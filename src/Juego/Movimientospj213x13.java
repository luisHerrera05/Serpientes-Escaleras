/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Juego;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Movimientospj213x13 extends Thread {
 
    private JLabel FigFicha;
    private JLabel SigTurno;
    private JLabel nombreTurno;
    private JButton botongirar;
    
    //Constructor para los Movimientos
    public Movimientospj213x13(JLabel FigFicha, JLabel SigTurno, JButton botongirar, JLabel nombreTurno){
        this.FigFicha = FigFicha;
        this.SigTurno = SigTurno;
        this.botongirar = botongirar;
        this.nombreTurno = nombreTurno;
    }
    
    //Metodo para hacer mover las fichas
    @Override
    public void run(){
        
        int position = FigFicha.getX();
        
        //Para poder comvertir a un integer la cantidad de casillas que pueda avanzar
        String numDadoCasilla = Tablero13x13.NumDado.getText();
        int entero = Integer.parseInt(numDadoCasilla);
        
        //-----------------------------Casillas esquinas-------------------------
        if(FigFicha.getX()==567){
            if(entero == 1){
                for(int w = 0; 130 > w; w++){
                FigFicha.setLocation(FigFicha.getX(), 580 - w);
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 2){
                for(int w = 0; 130 > w; w++){
                FigFicha.setLocation(FigFicha.getX(), 580 - w);
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
                for(int x = 0; 80 > x; x++){
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 3){
                for(int w = 0; 130 > w; w++){
                FigFicha.setLocation(FigFicha.getX(), 580 - w);
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
                for(int x = 0; 160 > x; x++){
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 4){
                for(int x = 0; 240 > x; x++){
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }    
            if(entero == 5){
                for(int w = 0; 130 > w; w++){
                FigFicha.setLocation(FigFicha.getX(), 580 - w);
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
                for(int x = 0; 320 > x; x++){
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 6){
                for(int w = 0; 130 > w; w++){
                FigFicha.setLocation(FigFicha.getX(), 580 - w);
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
                for(int x = 0; 400 > x; x++){
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            SigTurno.setText("Es el turno de: "+this.nombreTurno.getText());
            botongirar.setVisible(true); 
        }  
        
        //------------------------------ fila 2 -----------------------------------------
        if((FigFicha.getY() < 500 && FigFicha.getY() > 420)||(FigFicha.getY() < 340 && FigFicha.getY() > 260)||(FigFicha.getY() < 260 && FigFicha.getY() > 180)||(FigFicha.getY() < 20 && FigFicha.getY() > 0)){
            if(entero == 1){
                for(int x = 0; 80 > x; x++){
                    if(FigFicha.getX() == 7){
                        break;
                    }
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 2){
                for(int x = 0; 160 > x; x++){
                    if(FigFicha.getX() == 7){
                        break;
                    }
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 3){
                for(int x = 0; 240 > x; x++){
                    if(FigFicha.getX() == 7){
                        break;
                    }
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 4){
                for(int x = 0; 320 > x; x++){
                    if(FigFicha.getX() == 7){
                        break;
                    }
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }    
            if(entero == 5){
                for(int x = 0; 400 > x; x++){
                    if(FigFicha.getX() == 7){
                        break;
                    }
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 6){
                for(int x = 0; 480 > x; x++){
                    if(FigFicha.getX() == 7){
                        break;
                    }
                    FigFicha.setLocation(position - x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            SigTurno.setText("Es el turno de: "+this.nombreTurno.getText());
            botongirar.setVisible(true); 
        }
        
        //------------------------------ fila 1 -----------------------------------------
        if((FigFicha.getY() == 580)||(FigFicha.getY() == 420)||(FigFicha.getY() == 260)||(FigFicha.getY() == 100)){
            if(entero == 1){
                for(int x = 0; 130 > x; x++){
                    if(FigFicha.getX() == 567){
                        break;
                    }
                    FigFicha.setLocation(position + x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 2){
                for(int x = 0; 160 > x; x++){
                    if(FigFicha.getX() == 567){
                        break;
                    }
                    FigFicha.setLocation(position + x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 3){
                for(int x = 0; 240 > x; x++){
                    if(FigFicha.getX() == 567){
                        break;
                    }
                    FigFicha.setLocation(position + x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 4){
                for(int x = 0; 320 > x; x++){
                    if(FigFicha.getX() == 567){
                        break;
                    }
                    FigFicha.setLocation(position + x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }    
            if(entero == 5){
                for(int x = 0; 400 > x; x++){
                    if(FigFicha.getX() == 567){
                        break;
                    }
                    FigFicha.setLocation(position + x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            if(entero == 6){
                for(int x = 0; 480 > x; x++){
                    if(FigFicha.getX() == 567){
                        break;
                    }
                    FigFicha.setLocation(position + x, FigFicha.getY());
                try {
                     sleep(15);
                } catch (InterruptedException ex) {
                Logger.getLogger(Movimientospj213x13.class.getName()).log(Level.SEVERE, null, ex);}
                }
            }
            SigTurno.setText("Es el turno de: "+this.nombreTurno.getText());
            botongirar.setVisible(true); 
        } 
        
    }    
} 