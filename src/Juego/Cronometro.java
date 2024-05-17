package Juego;

import javax.swing.JLabel;

/**
 * @author Tobito
 */
public class Cronometro extends Thread{
    private JLabel cTiempo;//Crear un Label 
    boolean ActivoCrono = true;
    //Variable para controlar el encendido y apagado del programa
    //---------Constructor del Cronometro----------
    public Cronometro(JLabel cTiempo, boolean ActivoCrono){
        this.cTiempo = cTiempo;
        this.ActivoCrono = ActivoCrono;
    }
    //-----------Metodo del Cronometro-----------
    @Override
    public void run(){
        int seg = 0, min = 0, hora = 0;
        while(ActivoCrono = true){
            if (seg == 59) {//si los segundos son iguales a 59
               seg = 0;//segundo vuelve a empezar en cero
               min++;//y aumenta un minuto
            }
            if (min == 59) {//si los minutos son iguales a 59
               min = 0;//minuto vuelve a empezar en cero
               hora++;//y aumenta una hora
            }
                    seg++;        
                    if((seg <= 9) && (min <= 9) && (hora <= 9)){
                        cTiempo.setText("0"+hora + ":" + "0"+min + ":" + "0"+seg);
                        
                    }   
                    if((seg > 9) && (min <= 9) && (hora <= 9)){
                        cTiempo.setText("0"+hora + ":" + "0"+min + ":" +seg);
                    }   
                    if((seg > 9) && (min > 9) && (hora <= 9)){
                        cTiempo.setText("0"+hora + ":" +min + ":" +seg);
                    }
                    try{
                        sleep(1000);
                    }catch(Exception ex){}
                     cTiempo.setText( "00:00:000" );
              
       }
        
    }
}


