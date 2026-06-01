public class Jugador extends EntidadVideojuego {
    private int puntuacion;

    public Jugador(int x, int y) {
        super("Nave Defensora", x, y, 50, 50, 100, "sprite_nave.png");
        this.puntuacion = 0;
    }

    public void sumarPuntos(int puntos) {
        this.puntuacion += puntos;
        System.out.println("¡Puntuación actual: " + this.puntuacion + "!");
    }
    
    public int getPuntuacion() { return puntuacion; }
}
