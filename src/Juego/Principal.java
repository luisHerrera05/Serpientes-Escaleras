package Juego;


public class Principal {
    public static void main(String[] args) {
        // Iniciar el Juego de Serpientes y Escaleras
        TablerodeJuego iniciar = new TablerodeJuego();
        iniciar.setVisible(true);
        Tablero13x13 iniciar2 = new Tablero13x13();
        iniciar2.setVisible(true);
        Tablero15x15 iniciar3 = new Tablero15x15();
        iniciar2.setVisible(true);
    }
}
