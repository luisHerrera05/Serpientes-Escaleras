/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package Juego;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Movimientospj115x15 extends Thread {
 
    private JLabel FigFicha;
    private JLabel SigTurno;
    private JLabel nombreTurno;
    private JButton botongirar;
    
    //Constructor para los Movimientos
    public Movimientospj115x15(JLabel FigFicha, JLabel SigTurno, JButton botongirar, JLabel nombreTurno){
        this.FigFicha = FigFicha;
        this.SigTurno = SigTurno;
        this.botongirar = botongirar;
        this.nombreTurno = nombreTurno;
    }
    
    // Método para hacer mover las fichas
    @Override
    public void run(){
        
        int positionX = FigFicha.getX();
        int positionY = FigFicha.getY();
        
        // Para obtener la cantidad de casillas que puede avanzar
        String numDadoCasilla = Tablero15x15.NumDado.getText();
        int entero = Integer.parseInt(numDadoCasilla);
        
        // Movimiento horizontal
        for(int i = 0; i < entero; i++) {
            // Avance hacia la derecha
            if(positionX < 680) {
                positionX += 40; // Ajustar según el tamaño de cada casilla
            }
            // Avance hacia la izquierda
            else {
                positionX = 9; // Posición del borde izquierdo del tablero
            }
            
            FigFicha.setLocation(positionX, positionY);
            
            try {
                Thread.sleep(120); // Ajustar la velocidad de movimiento
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj215x15.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // Movimiento vertical
        for(int i = 0; i < entero; i++) {
            // Avance hacia abajo
            if(positionY < 580) {
                positionY += 40; // Ajustar según el tamaño de cada casilla
            }
            // Avance hacia arriba
            else {
                positionY = 9; // Posición del borde superior del tablero
            }
            
            FigFicha.setLocation(positionX, positionY);
            
            try {
                Thread.sleep(120); // Ajustar la velocidad de movimiento
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj215x15.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        SigTurno.setText("Es el turno de: " + this.nombreTurno.getText());
        botongirar.setVisible(true); 
    }
}