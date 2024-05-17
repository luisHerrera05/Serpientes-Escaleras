package Juego;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MovimientosPJ2 extends Thread{
    //Variables de la clase
    private JLabel FigFicha;
    private JLabel SigTurno;
    private JLabel nombreTurno;
    private JButton botongirar;
    
    //Constructor para los Movimientos
    public MovimientosPJ2(JLabel FigFicha, JLabel SigTurno, JButton botongirar, JLabel nombreTurno){
        this.FigFicha = FigFicha;
        this.SigTurno = SigTurno;
        this.botongirar = botongirar;
        this.nombreTurno = nombreTurno;
        final int CELL_WIDTH = 73;
        final int CELL_HEIGHT = 65;
    }
    
    //Metodo para hacer mover las fichas
    @Override
    public void run() {
    int positionX = FigFicha.getX();
    int positionY = FigFicha.getY();

    // Para convertir a un integer la cantidad de casillas que pueda avanzar
    String numDadoCasilla = TablerodeJuego.NumDado.getText();
    int entero = Integer.parseInt(numDadoCasilla);

    int casillaAncho = 73;  // Ancho de cada casilla en píxeles
    int casillaAlto = 65;   // Alto de cada casilla en píxeles

    for (int i = 0; i < entero; i++) {
        // Movimiento en una fila
        if ((positionY / casillaAlto) % 2 == 0) { // Si está en una fila que se mueve a la derecha
            positionX += casillaAncho;
            if (positionX >= 730) { // Si llega al borde derecho
                positionX = 730 - casillaAncho;
                positionY -= casillaAlto; // Sube una fila
            }
        } else { // Si está en una fila que se mueve a la izquierda
            positionX -= casillaAncho;
            if (positionX < 0) { // Si llega al borde izquierdo
                positionX = 0;
                positionY -= casillaAlto; // Sube una fila
            }
        }
        FigFicha.setLocation(positionX, positionY);
        delay();
    }

    SigTurno.setText("Es el turno de: " + this.nombreTurno.getText());
    botongirar.setVisible(true);
}

private void delay() {
    try {
        Thread.sleep(80);
    } catch (InterruptedException ex) {
        Logger.getLogger(MovimientosPJ1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
} 
