/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class TablerodeJuego extends javax.swing.JFrame {

    int position1; //integer que sea el valor de la posicion X
     int altura1;
     int position2; //integer que sea el valor de la posicion X
     int altura2;
     boolean Crono;
    boolean TurnoPJ;
    Timer GDado;//Timer que controla el dado

    public TablerodeJuego() {
        //------------------------------------------Colocar una imagen al proyecto-----------------------------------
        Image Icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Icono_201212925.png"));
        setIconImage(Icono);
        //------------------------------------------------------------------------------------------------------
       
        initComponents();
        Girardado();//metodo de girar dado
        //---------------caras de los dados-------------------
        this.FigDado1.setVisible(false);
        this.FigDado2.setVisible(false);
        this.FigDado3.setVisible(false);
        this.FigDado4.setVisible(false);
        this.FigDado5.setVisible(false);
        this.FigDado6.setVisible(false);
        
        PausarDado1.setVisible(false);
        MoverFicha1.setVisible(false);
        GirarDado2.setVisible(false);
        PausarDado2.setVisible(false);
        MoverFicha2.setVisible(false);
        
        this.Turno.setText("Es el turno de: "+this.PJ1.getText());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PJ1 = new javax.swing.JLabel();
        PJ2 = new javax.swing.JLabel();
        PanelFicha1 = new javax.swing.JPanel();
        minFichaPJ1 = new javax.swing.JLabel();
        PanelFicha2 = new javax.swing.JPanel();
        minFichaPJ2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Dado = new javax.swing.JPanel();
        NumDado = new javax.swing.JLabel();
        FigDado1 = new javax.swing.JLabel();
        FigDado2 = new javax.swing.JLabel();
        FigDado3 = new javax.swing.JLabel();
        FigDado4 = new javax.swing.JLabel();
        FigDado5 = new javax.swing.JLabel();
        FigDado6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        GirarDado1 = new javax.swing.JButton();
        PausarDado1 = new javax.swing.JButton();
        MoverFicha1 = new javax.swing.JButton();
        GirarDado2 = new javax.swing.JButton();
        PausarDado2 = new javax.swing.JButton();
        MoverFicha2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JuegoTablero = new javax.swing.JPanel();
        PJ1ficha1 = new javax.swing.JLabel();
        PJ1ficha2 = new javax.swing.JLabel();
        Turno = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ContadorNum = new javax.swing.JLabel();
        FondoDado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serpientes y Escaleras");
        setMinimumSize(new java.awt.Dimension(1024, 720));
        getContentPane().setLayout(null);

        PJ1.setBackground(new java.awt.Color(0, 0, 0));
        PJ1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PJ1.setForeground(new java.awt.Color(255, 255, 51));
        PJ1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PJ1.setText("Jugador 1");
        getContentPane().add(PJ1);
        PJ1.setBounds(850, 380, 170, 40);

        PJ2.setBackground(new java.awt.Color(0, 0, 0));
        PJ2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        PJ2.setForeground(new java.awt.Color(0, 51, 204));
        PJ2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PJ2.setText("Jugador 2");
        getContentPane().add(PJ2);
        PJ2.setBounds(850, 440, 170, 40);

        PanelFicha1.setBackground(new java.awt.Color(0, 51, 204));
        PanelFicha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFicha1.setPreferredSize(new java.awt.Dimension(43, 43));
        PanelFicha1.setLayout(new java.awt.GridLayout(1, 0));

        minFichaPJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minFichaPJ1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        minFichaPJ1.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelFicha1.add(minFichaPJ1);

        getContentPane().add(PanelFicha1);
        PanelFicha1.setBounds(800, 440, 43, 43);

        PanelFicha2.setBackground(new java.awt.Color(255, 255, 51));
        PanelFicha2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelFicha2.setPreferredSize(new java.awt.Dimension(43, 43));
        PanelFicha2.setLayout(new java.awt.GridLayout(1, 0));

        minFichaPJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minFichaPJ2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        minFichaPJ2.setPreferredSize(new java.awt.Dimension(40, 40));
        PanelFicha2.add(minFichaPJ2);

        getContentPane().add(PanelFicha2);
        PanelFicha2.setBounds(800, 380, 43, 43);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(780, 30, 3, 570);

        Dado.setBackground(new java.awt.Color(51, 102, 0));
        Dado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Dado.setMaximumSize(new java.awt.Dimension(186, 186));
        Dado.setMinimumSize(new java.awt.Dimension(186, 186));
        Dado.setPreferredSize(new java.awt.Dimension(186, 186));
        Dado.setLayout(null);

        NumDado.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        NumDado.setForeground(new java.awt.Color(0, 204, 204));
        NumDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumDado.setToolTipText("");
        Dado.add(NumDado);
        NumDado.setBounds(160, 140, 40, 40);

        FigDado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara1.png"))); // NOI18N
        Dado.add(FigDado1);
        FigDado1.setBounds(0, 0, 200, 190);

        FigDado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara2.png"))); // NOI18N
        Dado.add(FigDado2);
        FigDado2.setBounds(0, 0, 200, 190);

        FigDado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara3.png"))); // NOI18N
        Dado.add(FigDado3);
        FigDado3.setBounds(0, 0, 200, 190);

        FigDado4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara4.png"))); // NOI18N
        Dado.add(FigDado4);
        FigDado4.setBounds(0, 0, 200, 190);

        FigDado5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara5.png"))); // NOI18N
        Dado.add(FigDado5);
        FigDado5.setBounds(0, 0, 200, 190);

        FigDado6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FigDado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dadocara6.png"))); // NOI18N
        Dado.add(FigDado6);
        FigDado6.setBounds(0, 0, 200, 190);

        getContentPane().add(Dado);
        Dado.setBounds(810, 60, 200, 186);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(153, 0, 0));
        lblCierre.setText("REINICIAR JUEGO");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
        });
        jPanel2.add(lblCierre);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(800, 510, 200, 40);

        GirarDado1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GirarDado1.setText("Girar Dado");
        GirarDado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirarDado1ActionPerformed(evt);
            }
        });
        getContentPane().add(GirarDado1);
        GirarDado1.setBounds(820, 260, 180, 40);

        PausarDado1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PausarDado1.setText("Parar Dado");
        PausarDado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarDado1ActionPerformed(evt);
            }
        });
        getContentPane().add(PausarDado1);
        PausarDado1.setBounds(820, 260, 180, 40);

        MoverFicha1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MoverFicha1.setText("Mover Ficha");
        MoverFicha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverFicha1ActionPerformed(evt);
            }
        });
        getContentPane().add(MoverFicha1);
        MoverFicha1.setBounds(820, 260, 180, 40);

        GirarDado2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        GirarDado2.setText("Girar Dado");
        GirarDado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirarDado2ActionPerformed(evt);
            }
        });
        getContentPane().add(GirarDado2);
        GirarDado2.setBounds(820, 260, 180, 40);

        PausarDado2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        PausarDado2.setText("Parar Dado");
        PausarDado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausarDado2ActionPerformed(evt);
            }
        });
        getContentPane().add(PausarDado2);
        PausarDado2.setBounds(820, 260, 180, 40);

        MoverFicha2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        MoverFicha2.setText("Mover Ficha");
        MoverFicha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverFicha2ActionPerformed(evt);
            }
        });
        getContentPane().add(MoverFicha2);
        MoverFicha2.setBounds(820, 260, 180, 40);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Tiempo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(810, 310, 100, 26);

        JuegoTablero.setBackground(new java.awt.Color(0, 153, 153));
        JuegoTablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JuegoTablero.setMinimumSize(new java.awt.Dimension(380, 380));
        JuegoTablero.setPreferredSize(new java.awt.Dimension(380, 380));
        JuegoTablero.setLayout(null);

        PJ1ficha1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PJ1ficha1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JuegoTablero.add(PJ1ficha1);
        PJ1ficha1.setBounds(7, 580, 60, 60);

        PJ1ficha2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JuegoTablero.add(PJ1ficha2);
        PJ1ficha2.setBounds(7, 580, 60, 60);

        getContentPane().add(JuegoTablero);
        JuegoTablero.setBounds(40, 10, 730, 650);

        Turno.setBackground(new java.awt.Color(0, 0, 0));
        Turno.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Turno.setForeground(new java.awt.Color(242, 242, 242));
        Turno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Turno.setText("Es el Turno de: ");
        getContentPane().add(Turno);
        Turno.setBounds(-20, 680, 640, 40);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(51, 153, 0));
        jPanel1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        ContadorNum.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        ContadorNum.setForeground(new java.awt.Color(255, 255, 255));
        ContadorNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContadorNum.setText("00:00:00");
        ContadorNum.setToolTipText("");
        jPanel1.add(ContadorNum);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(810, 340, 210, 30);

        FondoDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaper-mono-de-juegos-agricola-desktop.jpg"))); // NOI18N
        FondoDado.setText("jLabel2");
        getContentPane().add(FondoDado);
        FondoDado.setBounds(0, 0, 1050, 780);

        setSize(new java.awt.Dimension(1049, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GirarDado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirarDado1ActionPerformed

        GDado.start(); //Parar dado
        GirarDado1.setVisible(false);
        PausarDado1.setVisible(true);
    }//GEN-LAST:event_GirarDado1ActionPerformed

    private void PausarDado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarDado1ActionPerformed
        GDado.stop(); //Iniciar Dado
        MoverFicha1.setVisible(true);
        PausarDado1.setVisible(false);      
    }//GEN-LAST:event_PausarDado1ActionPerformed

    private void GirarDado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirarDado2ActionPerformed
        GDado.start(); //Parar dado
        GirarDado2.setVisible(false);
        PausarDado2.setVisible(true);
    }//GEN-LAST:event_GirarDado2ActionPerformed

    private void PausarDado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausarDado2ActionPerformed
        GDado.stop(); //Iniciar Dado
        MoverFicha2.setVisible(true);
        PausarDado2.setVisible(false);
    }//GEN-LAST:event_PausarDado2ActionPerformed

    private void MoverFicha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverFicha1ActionPerformed
        MovimientosPJ2 Player1 = new MovimientosPJ2(PJ1ficha1,Turno,GirarDado2, PJ2);
        Player1.start();
        MoverFicha1.setVisible(false);
    }//GEN-LAST:event_MoverFicha1ActionPerformed

    private void MoverFicha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverFicha2ActionPerformed
        MovimientosPJ1 Player2 = new MovimientosPJ1(PJ1ficha2,Turno,GirarDado1,PJ1);
        Player2.start();
        MoverFicha2.setVisible(false);
    }//GEN-LAST:event_MoverFicha2ActionPerformed

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        // TODO add your handling code here:
        Jugadores inicio =new Jugadores ();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCierreMouseClicked

    public final void Girardado(){
        GDado = new Timer(80, new ActionListener ()
         {
             public void actionPerformed(ActionEvent arg0)
             {
                int CaraDado = (int) (Math.random()*6+1);
                String strinNum = Integer.toString(CaraDado);
                NumDado.setText(strinNum); 
                if(CaraDado == 1){
                   FigDado1.setVisible(true);
                   FigDado2.setVisible(false);
                   FigDado3.setVisible(false);
                   FigDado4.setVisible(false);
                   FigDado5.setVisible(false);
                   FigDado6.setVisible(false);
                }
                if(CaraDado == 2){
                   FigDado1.setVisible(false);
                   FigDado2.setVisible(true);
                   FigDado3.setVisible(false);
                   FigDado4.setVisible(false);
                   FigDado5.setVisible(false);
                   FigDado6.setVisible(false);
                }
                if(CaraDado == 3){
                   FigDado1.setVisible(false);
                   FigDado2.setVisible(false);
                   FigDado3.setVisible(true);
                   FigDado4.setVisible(false);
                   FigDado5.setVisible(false);
                   FigDado6.setVisible(false);
                }
                if(CaraDado == 4){
                   FigDado1.setVisible(false);
                   FigDado2.setVisible(false);
                   FigDado3.setVisible(false);
                   FigDado4.setVisible(true);
                   FigDado5.setVisible(false);
                   FigDado6.setVisible(false);
                }
                if(CaraDado == 5){
                   FigDado1.setVisible(false);
                   FigDado2.setVisible(false);
                   FigDado3.setVisible(false);
                   FigDado4.setVisible(false);
                   FigDado5.setVisible(true);
                   FigDado6.setVisible(false);
                }
                if(CaraDado == 6){
                   FigDado1.setVisible(false);
                   FigDado2.setVisible(false);
                   FigDado3.setVisible(false);
                   FigDado4.setVisible(false);
                   FigDado5.setVisible(false);
                   FigDado6.setVisible(true);
                }
             }
         });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TablerodeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablerodeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablerodeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablerodeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablerodeJuego().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ContadorNum;
    private javax.swing.JPanel Dado;
    public javax.swing.JLabel FigDado1;
    public javax.swing.JLabel FigDado2;
    public javax.swing.JLabel FigDado3;
    public javax.swing.JLabel FigDado4;
    public javax.swing.JLabel FigDado5;
    public javax.swing.JLabel FigDado6;
    private javax.swing.JLabel FondoDado;
    public static javax.swing.JButton GirarDado1;
    public javax.swing.JButton GirarDado2;
    public javax.swing.JPanel JuegoTablero;
    public javax.swing.JButton MoverFicha1;
    public javax.swing.JButton MoverFicha2;
    public static javax.swing.JLabel NumDado;
    public javax.swing.JLabel PJ1;
    public static javax.swing.JLabel PJ1ficha1;
    public static javax.swing.JLabel PJ1ficha2;
    public javax.swing.JLabel PJ2;
    private javax.swing.JPanel PanelFicha1;
    private javax.swing.JPanel PanelFicha2;
    public javax.swing.JButton PausarDado1;
    public javax.swing.JButton PausarDado2;
    public javax.swing.JLabel Turno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCierre;
    public javax.swing.JLabel minFichaPJ1;
    public javax.swing.JLabel minFichaPJ2;
    // End of variables declaration//GEN-END:variables


}
