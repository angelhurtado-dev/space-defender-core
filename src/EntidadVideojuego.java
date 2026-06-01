public class EntidadVideojuego {
    private String nombre;
    private int x, y, w, h;
    private int vida;
    private String animacion;

    public EntidadVideojuego(String nombre, int x, int y, int w, int h, int vida, String animacion) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.vida = vida;
        this.animacion = animacion;
    }

    public void mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
        System.out.println(nombre + " se movió a [" + x + ", " + y + "]");
    }

    // Getters y Setters básicos para la encapsulación
    public String getNombre() { return nombre; }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getW() { return w; }
    public int getH() { return h; }
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }
    public String getAnimacion() { return animacion; }
}