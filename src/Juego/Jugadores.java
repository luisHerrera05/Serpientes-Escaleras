package Juego;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.TransferHandler;

public class Jugadores extends javax.swing.JFrame {

    TablerodeJuego Jugar = new TablerodeJuego();
    Tablero13x13 Jugar2 = new Tablero13x13();
    Tablero15x15 Jugar3 = new Tablero15x15();

//Enlazar la clase TablerodeJuego
    //--------------Variables para el Cronometro---------------------------------
    boolean Suspendido;
    boolean Crono;
    int minutos;
    int segundos;
    //------------------------------------------------------
    String Tablero[][];
    String Tablero1[][];
    String Tablero2[][];//Declarar la Variable Tablero

    /**
     * Creates new form Jugadores_201212925
     */

    public Jugadores() {
        initComponents();
        //--------------Efecto Dragdrop--------------------------------------
        ficha1.setTransferHandler(new TransferHandler("icon"));
        ficha2.setTransferHandler(new TransferHandler("icon"));
        ficha3.setTransferHandler(new TransferHandler("icon"));
        ficha4.setTransferHandler(new TransferHandler("icon"));
        ficha5.setTransferHandler(new TransferHandler("icon"));
        ficha6.setTransferHandler(new TransferHandler("icon"));
        FichaPJ1.setTransferHandler(new TransferHandler("icon"));
        FichaPJ2.setTransferHandler(new TransferHandler("icon"));

        //---------------------------------------Declarar el Tablero 10x10 con el nombre de las casillas----------------------------------
        Tablero2 = new String[][]{
             {"157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169"},
             {"156", "155", "154", "153", "152", "151", "150", "149", "148", "147", "146", "145", "144"},
             {"131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143"},
             {"130", "129", "128", "127", "126", "125", "124", "123", "122", "121", "120", "119", "118"},
             {"105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117"},
             {"104", "103", "102", "101", "100", "99",  "98",  "97",  "96",  "95",  "94",  "93",  "92"},
             {"79",  "80",  "81",  "82",  "83",  "84",  "85",  "86",  "87",  "88",  "89",  "90",  "91"},
             {"78",  "77",  "76",  "75",  "74",  "73",  "72",  "71",  "70",  "69",  "68",  "67",  "66"},
             {"53",  "54",  "55",  "56",  "57",  "58",  "59",  "60",  "61",  "62",  "63",  "64",  "65"},
             {"52",  "51",  "50",  "49",  "48",  "47",  "46",  "45",  "44",  "43",  "42",  "41",  "40"},
             {"27",  "28",  "29",  "30",  "31",  "32",  "33",  "34",  "35",  "36",  "37",  "38",  "39"},
             {"26",  "25",  "24",  "23",  "22",  "21",  "20",  "19",  "18",  "17",  "16",  "15",  "14"},
             {"1",   "2",   "3",   "4",   "5",   "6",   "7",   "8",   "9",   "10",  "11",  "12",  "13"}
        };
        Tablero1 = new String[][]{
    {"211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "221", "222", "223", "224", "225"},
    {"210", "209", "208", "207", "206", "205", "204", "203", "202", "201", "200", "199", "198", "197", "196"},
    {"191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205"},
    {"192", "191", "190", "189", "188", "187", "186", "185", "184", "183", "182", "181", "180", "179", "178"},
    {"171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185"},
    {"172", "171", "170", "169", "168", "167", "166", "165", "164", "163", "162", "161", "160", "159", "158"},
    {"151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165"},
    {"152", "151", "150", "149", "148", "147", "146", "145", "144", "143", "142", "141", "140", "139", "138"},
    {"131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145"},
    {"132", "131", "130", "129", "128", "127", "126", "125", "124", "123", "122", "121", "120", "119", "118"},
    {"111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125"},
    {"112", "111", "110", "109", "108", "107", "106", "105", "104", "103", "102", "101", "100", "99 ", "98 "},
    {"91 ", "92 ", "93 ", "94 ", "95 ", "96 ", "97 ", "98 ", "99 ", "100", "101", "102", "103", "104", "105"},
    {"92 ", "91 ", "90 ", "89 ", "88 ", "87 ", "86 ", "85 ", "84 ", "83 ", "82 ", "81 ", "80 ", "79 ", "78 "},
    {"1  ", "2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9  ", "10 ", "11 ", "12 ", "13 ", "14 ", "15 "}
     };

        Tablero = new String[][]{
              {"100", "99 ", "98 ", "97 ", "96 ", "95 ", "94 ", "93 ", "92 ", "91 "},
            {"81 ", "82 ", "83 ", "84 ", "85 ", "86 ", "87 ", "88 ", "89 ", "90 "},
            {"80 ", "79 ", "78 ", "77 ", "76 ", "75 ", "74 ", "73 ", "72 ", "71 "},
            {"61 ", "62 ", "63 ", "64 ", "65 ", "66 ", "67 ", "68 ", "69 ", "70 "},
            {"60 ", "59 ", "58 ", "57 ", "56 ", "55 ", "54 ", "53 ", "52 ", "51 "},
            {"41 ", "42 ", "43 ", "44 ", "45 ", "46 ", "47 ", "48 ", "49 ", "50 "},
            {"40 ", "39 ", "38 ", "37 ", "36 ", "35 ", "34 ", "33 ", "32 ", "31 "},
            {"21 ", "22 ", "23 ", "24 ", "25 ", "26 ", "27 ", "28 ", "29 ", "30 "},
            {"20 ", "19 ", "18 ", "17 ", "16 ", "15 ", "14 ", "13 ", "12 ", "11 "},
            {"1  ", "2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9  ", "10 "}
        };
                }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Escojer4 = new javax.swing.JLabel();
        Escojer5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Escojer = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        ficha1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        ficha2 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        ficha3 = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        ficha4 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        ficha5 = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        ficha6 = new javax.swing.JLabel();
        namePJ1 = new javax.swing.JTextField();
        PanelFicha1 = new javax.swing.JPanel();
        FichaPJ1 = new javax.swing.JLabel();
        jugar10x10 = new javax.swing.JButton();
        namePJ2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Escojer7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Escojer9 = new javax.swing.JLabel();
        Escojer8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Escojer6 = new javax.swing.JLabel();
        PanelFicha2 = new javax.swing.JPanel();
        FichaPJ2 = new javax.swing.JLabel();
        jugar15x15 = new javax.swing.JButton();
        jugar13x13 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Jugadores");
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        Escojer4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Escojer4.setForeground(new java.awt.Color(255, 255, 0));
        Escojer4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Escojer4.setText("Jugador 1:");

        Escojer5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer5.setForeground(new java.awt.Color(255, 255, 0));
        Escojer5.setText("Nombre:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Escojer4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Escojer4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escojer5)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 260, 140, 80);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        Escojer.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer.setForeground(new java.awt.Color(255, 255, 0));
        Escojer.setText("arrastra una ficha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Escojer, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Escojer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(500, 30, 210, 50);

        Titulo.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 255, 51));
        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/serpientes_escaleras.jpg"))); // NOI18N
        getContentPane().add(Titulo);
        Titulo.setBounds(0, 0, 290, 140);

        Panel1.setBackground(new java.awt.Color(0, 51, 51));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_domo.png"))); // NOI18N
        ficha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel1);
        Panel1.setBounds(40, 150, 104, 104);

        Panel2.setBackground(new java.awt.Color(0, 51, 51));
        Panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_gato.png"))); // NOI18N
        ficha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel2);
        Panel2.setBounds(170, 150, 104, 104);

        Panel3.setBackground(new java.awt.Color(0, 51, 51));
        Panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_marciano.png"))); // NOI18N
        ficha3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel3);
        Panel3.setBounds(290, 150, 104, 104);

        Panel4.setBackground(new java.awt.Color(0, 51, 51));
        Panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_peludito.png"))); // NOI18N
        ficha4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel4);
        Panel4.setBounds(420, 150, 104, 104);

        Panel5.setBackground(new java.awt.Color(0, 51, 51));
        Panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_cocodrilo.png"))); // NOI18N
        ficha5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel5);
        Panel5.setBounds(540, 150, 104, 104);

        Panel6.setBackground(new java.awt.Color(0, 51, 51));
        Panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ficha6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ficha6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tablero_pyong.png"))); // NOI18N
        ficha6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ficha6MousePressed(evt);
            }
        });
        ficha6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ficha6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ficha6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Panel6);
        Panel6.setBounds(670, 150, 104, 104);

        namePJ1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        namePJ1.setMinimumSize(new java.awt.Dimension(300, 30));
        namePJ1.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(namePJ1);
        namePJ1.setBounds(40, 350, 300, 30);

        PanelFicha1.setBackground(new java.awt.Color(255, 255, 0));
        PanelFicha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PanelFicha1.setForeground(new java.awt.Color(153, 0, 0));

        FichaPJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FichaPJ1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FichaPJ1MouseReleased(evt);
            }
        });
        FichaPJ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FichaPJ1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FichaPJ1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelFicha1Layout = new javax.swing.GroupLayout(PanelFicha1);
        PanelFicha1.setLayout(PanelFicha1Layout);
        PanelFicha1Layout.setHorizontalGroup(
            PanelFicha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFicha1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FichaPJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelFicha1Layout.setVerticalGroup(
            PanelFicha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanelFicha1);
        PanelFicha1.setBounds(150, 390, 104, 104);

        jugar10x10.setBackground(new java.awt.Color(0, 153, 255));
        jugar10x10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jugar10x10.setText("jugar 10x10");
        jugar10x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugar10x10ActionPerformed(evt);
            }
        });
        getContentPane().add(jugar10x10);
        jugar10x10.setBounds(290, 470, 120, 50);

        namePJ2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        namePJ2.setMinimumSize(new java.awt.Dimension(300, 30));
        namePJ2.setPreferredSize(new java.awt.Dimension(300, 30));
        getContentPane().add(namePJ2);
        namePJ2.setBounds(450, 350, 300, 30);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        Escojer7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer7.setForeground(new java.awt.Color(0, 51, 204));
        Escojer7.setText("Ficha:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer7)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(470, 400, 80, 40);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        Escojer9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Escojer9.setForeground(new java.awt.Color(51, 51, 255));
        Escojer9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Escojer9.setText("Jugador 2:");

        Escojer8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer8.setForeground(new java.awt.Color(0, 51, 204));
        Escojer8.setText("Nombre:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Escojer9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Escojer9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escojer8)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(460, 260, 140, 80);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        Escojer6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        Escojer6.setForeground(new java.awt.Color(255, 255, 0));
        Escojer6.setText("Ficha:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escojer6)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(50, 410, 80, 40);

        PanelFicha2.setBackground(new java.awt.Color(0, 51, 204));
        PanelFicha2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        FichaPJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FichaPJ2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FichaPJ2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout PanelFicha2Layout = new javax.swing.GroupLayout(PanelFicha2);
        PanelFicha2.setLayout(PanelFicha2Layout);
        PanelFicha2Layout.setHorizontalGroup(
            PanelFicha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PanelFicha2Layout.setVerticalGroup(
            PanelFicha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FichaPJ2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanelFicha2);
        PanelFicha2.setBounds(590, 390, 104, 104);

        jugar15x15.setBackground(new java.awt.Color(102, 255, 0));
        jugar15x15.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jugar15x15.setText("jugar 15x15");
        jugar15x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugar15x15ActionPerformed(evt);
            }
        });
        getContentPane().add(jugar15x15);
        jugar15x15.setBounds(430, 470, 130, 50);

        jugar13x13.setBackground(new java.awt.Color(204, 0, 0));
        jugar13x13.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jugar13x13.setText("jugar 13x13");
        jugar13x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugar13x13ActionPerformed(evt);
            }
        });
        getContentPane().add(jugar13x13);
        jugar13x13.setBounds(320, 400, 120, 50);

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/desktop-wallpaper-snakes-and-ladders-snake-and-ladder.jpg"))); // NOI18N
        Fondo.setToolTipText("");
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 820, 530);

        setSize(new java.awt.Dimension(821, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ficha1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha1MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha1MousePressed

    private void ficha2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha2MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha2MousePressed

    private void ficha3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha3MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha3MousePressed

    private void ficha4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha4MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha4MousePressed

    private void ficha5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha5MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha5MousePressed

    private void ficha6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ficha6KeyPressed

    }//GEN-LAST:event_ficha6KeyPressed

    private void ficha6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ficha6MousePressed
        //--------------Efecto Dragdrop-------------
        JComponent comp = (JComponent) evt.getSource();
        TransferHandler handler = comp.getTransferHandler();
        handler.exportAsDrag(comp, evt, TransferHandler.COPY);
    }//GEN-LAST:event_ficha6MousePressed


    private void jugar10x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugar10x10ActionPerformed
        String nombre1 = namePJ1.getText();
        String nombre2 = namePJ2.getText();
        if (nombre1.equals(nombre2)) {//verificar si los nombres de los jugadores son iguales
            JOptionPane.showMessageDialog(null, "Los nombres de los Jugadores son iguales");
        } else {
            if (FichaPJ1.getIcon().toString().equals(FichaPJ2.getIcon().toString())) {
                JOptionPane.showMessageDialog(null, "Las fichas son las mismas");//son iguales
            } else {

                this.setVisible(false);// cerrar la ventana jugadores
                this.Jugar.setVisible(true);
                nombrarPJ();//Escribir los nombres de los jugadores
                escojerFicha(); //Escojer las fichas
                imprimirTablero(); // Imprimir el Tablero Matriz
                Cronometro reloj = new Cronometro(Jugar.ContadorNum, Crono);
                reloj.start();
            }
        }

    }//GEN-LAST:event_jugar10x10ActionPerformed

    private void FichaPJ1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FichaPJ1KeyReleased

    }//GEN-LAST:event_FichaPJ1KeyReleased

    private void FichaPJ1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FichaPJ1KeyPressed

    }//GEN-LAST:event_FichaPJ1KeyPressed

    private void FichaPJ2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaPJ2MouseReleased

    }//GEN-LAST:event_FichaPJ2MouseReleased

    private void FichaPJ1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FichaPJ1MouseReleased

    }//GEN-LAST:event_FichaPJ1MouseReleased

    private void jugar15x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugar15x15ActionPerformed
        // TODO add your handling code here:
        String nombre1 = namePJ1.getText();
        String nombre2 = namePJ2.getText();
        if (nombre1.equals(nombre2)) {//verificar si los nombres de los jugadores son iguales
            JOptionPane.showMessageDialog(null, "Los nombres de los Jugadores son iguales");
        } else {
            if (FichaPJ1.getIcon().toString().equals(FichaPJ2.getIcon().toString())) {
                JOptionPane.showMessageDialog(null, "Las fichas son las mismas");//son iguales
            } else {

                this.setVisible(false);// cerrar la ventana jugadores
                this.Jugar3.setVisible(true);
                nombrarPJ15x15();//Escribir los nombres de los jugadores
                escojerFicha15x15(); //Escojer las fichas
                imprimirTablero15x15(); // Imprimir el Tablero Matriz
                Cronometro reloj = new Cronometro(Jugar.ContadorNum, Crono);
                reloj.start();
            }
        }
    }//GEN-LAST:event_jugar15x15ActionPerformed

    private void jugar13x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugar13x13ActionPerformed
        // TODO add your handling code here:
        String nombre1 = namePJ1.getText();
        String nombre2 = namePJ2.getText();
        if (nombre1.equals(nombre2)) {//verificar si los nombres de los jugadores son iguales
            JOptionPane.showMessageDialog(null, "Los nombres de los Jugadores son iguales");
        } else {
            if (FichaPJ1.getIcon().toString().equals(FichaPJ2.getIcon().toString())) {
                JOptionPane.showMessageDialog(null, "Las fichas son las mismas");//son iguales
            } else {

                this.setVisible(false);// cerrar la ventana jugadores
                this.Jugar2.setVisible(true);
                nombrarPJ13x13();//Escribir los nombres de los jugadores
                escojerFicha13x13(); //Escojer las fichas
                imprimirTablero13x13(); // Imprimir el Tablero Matriz
                Cronometro reloj = new Cronometro(Jugar.ContadorNum, Crono);
                reloj.start();
            }
        }

    }//GEN-LAST:event_jugar13x13ActionPerformed

    public void nombrarPJ() { //Pasar los nombres al otro Form(TablerodeJuego)
        this.Jugar.PJ1.setText(this.namePJ1.getText());
        this.Jugar.PJ2.setText(this.namePJ2.getText());
        this.Jugar.Turno.setText("Es el turno de: " + this.namePJ1.getText());
    }

    public void escojerFicha() {//Pasar las fichas al otro Form(TablerodeJuego)
        this.Jugar.minFichaPJ2.setIcon(this.FichaPJ1.getIcon());
        this.Jugar.minFichaPJ1.setIcon(this.FichaPJ2.getIcon());
        this.Jugar.PJ1ficha1.setIcon(this.FichaPJ1.getIcon());
        this.Jugar.PJ1ficha2.setIcon(this.FichaPJ2.getIcon());
    }

    public void nombrarPJ13x13() { //Pasar los nombres al otro Form(TablerodeJuego)
        this.Jugar2.PJ1.setText(this.namePJ1.getText());
        this.Jugar2.PJ2.setText(this.namePJ2.getText());
        this.Jugar2.Turno.setText("Es el turno de: " + this.namePJ1.getText());
    }

    public void escojerFicha13x13() {//Pasar las fichas al otro Form(TablerodeJuego)
        this.Jugar2.minFichaPJ2.setIcon(this.FichaPJ1.getIcon());
        this.Jugar2.minFichaPJ1.setIcon(this.FichaPJ2.getIcon());
        this.Jugar2.PJ1ficha1.setIcon(this.FichaPJ1.getIcon());
        this.Jugar2.PJ1ficha2.setIcon(this.FichaPJ2.getIcon());
    }

    public void nombrarPJ15x15() { //Pasar los nombres al otro Form(TablerodeJuego)
        this.Jugar3.PJ1.setText(this.namePJ1.getText());
        this.Jugar3.PJ2.setText(this.namePJ2.getText());
        this.Jugar3.Turno.setText("Es el turno de: " + this.namePJ1.getText());
    }

    public void escojerFicha15x15() {//Pasar las fichas al otro Form(TablerodeJuego)
        this.Jugar3.minFichaPJ2.setIcon(this.FichaPJ1.getIcon());
        this.Jugar3.minFichaPJ1.setIcon(this.FichaPJ2.getIcon());
        this.Jugar3.PJ1ficha1.setIcon(this.FichaPJ1.getIcon());
        this.Jugar3.PJ1ficha2.setIcon(this.FichaPJ2.getIcon());
    }

    public void imprimirTablero() {
        JLabel label;
        String Casillas;
        int cellWidth = 73; // Ancho de cada celda
        int cellHeight = 65; // Alto de cada celda

        for (int j = 0; j < 10; j++) {  // Bucle para los datos de las columnas
            for (int i = 0; i < 10; i++) {  // Bucle para los datos de las filas
                Casillas = Tablero[j][i];
                label = new JLabel(Casillas);
                label.setHorizontalAlignment(JLabel.RIGHT); // alineación horizontal
                label.setVerticalAlignment(JLabel.TOP); // alineación vertical
                label.setForeground(Color.ORANGE); // color del label
                label.setFont(new Font("Comic Sans MS", Font.BOLD, 16)); // letra y tamaño
                label.setBounds(cellWidth * i, cellHeight * j, cellWidth, cellHeight); // la distancia entre cada celda
                label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
                Jugar.JuegoTablero.add(label); // agregar los labels en el Panel JuegoTablero
            }
        }
    }

  public void imprimirTablero13x13() {
        JLabel label;
        String Casillas;
        int cellWidth = 56; // Ancho de cada celda
        int cellHeight = 50; // Alto de cada celda

        for (int i = 0; i < 13; i++) {  // Bucle para los datos de las columnas
            for (int j = 0; j < 13; j++) {  // Bucle para los datos de las filas
                Casillas = Tablero2[j][i];
                label = new JLabel(Casillas);
                label.setHorizontalAlignment(JLabel.RIGHT); // alineación horizontal
                label.setVerticalAlignment(JLabel.TOP); // alineación vertical
                label.setForeground(Color.ORANGE); // color del label
                label.setFont(new Font("Comic Sans MS", Font.BOLD, 16)); // letra y tamaño
                label.setBounds(cellWidth * i, cellHeight * j, cellWidth, cellHeight); // la distancia entre cada celda
                label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
                Jugar2.JuegoTablero.add(label); // agregar los labels en el Panel JuegoTablero
            }
        }
    }

    public void imprimirTablero15x15() {
        JLabel label;
        String Casillas;
        int cellWidth = 48; // Ancho de cada celda
        int cellHeight = 43; // Alto de cada celda

        for (int j = 0; j < 15; j++) {  // Bucle para los datos de las columnas
            for (int i = 0; i < 15; i++) {  // Bucle para los datos de las filas
                Casillas = Tablero1[j][i];
                label = new JLabel(Casillas);
                label.setHorizontalAlignment(JLabel.RIGHT); // alineación horizontal
                label.setVerticalAlignment(JLabel.TOP); // alineación vertical
                label.setForeground(Color.ORANGE); // color del label
                label.setFont(new Font("Comic Sans MS", Font.BOLD, 16)); // letra y tamaño
                label.setBounds(cellWidth * i, cellHeight * j, cellWidth, cellHeight); // la distancia entre cada celda
                label.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
                Jugar3.JuegoTablero.add(label); // agregar los labels en el Panel JuegoTablero
            }
        }
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
            java.util.logging.Logger.getLogger(Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugadores().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Escojer;
    private javax.swing.JLabel Escojer4;
    private javax.swing.JLabel Escojer5;
    private javax.swing.JLabel Escojer6;
    private javax.swing.JLabel Escojer7;
    private javax.swing.JLabel Escojer8;
    private javax.swing.JLabel Escojer9;
    public javax.swing.JLabel FichaPJ1;
    public javax.swing.JLabel FichaPJ2;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel PanelFicha1;
    private javax.swing.JPanel PanelFicha2;
    private javax.swing.JLabel Titulo;
    public javax.swing.JLabel ficha1;
    public javax.swing.JLabel ficha2;
    public javax.swing.JLabel ficha3;
    public javax.swing.JLabel ficha4;
    public javax.swing.JLabel ficha5;
    public javax.swing.JLabel ficha6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JButton jugar10x10;
    public javax.swing.JButton jugar13x13;
    public javax.swing.JButton jugar15x15;
    private javax.swing.JTextField namePJ1;
    private javax.swing.JTextField namePJ2;
    // End of variables declaration//GEN-END:variables

}
