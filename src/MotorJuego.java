import java.util.ArrayList;
import java.util.List;

public class MotorJuego {
    private String estado; // MENU, JUGANDO, PAUSA, GAME_OVER
    private List<EntidadVideojuego> entidades;

    public MotorJuego() {
        this.estado = "MENU";
        this.entidades = new ArrayList<>();
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("--- ESTADO DEL JUEGO CAMBIADO A: " + estado + " ---");
    }

    public void agregarEntidad(EntidadVideojuego entidad) {
        entidades.add(entidad);
        System.out.println("Entidad añadida al juego: " + entidad.getNombre());
    }

    // El Game Loop obligatorio que pide el enunciado
    public void actualizar() {
        if (!estado.equals("JUGANDO")) {
            System.out.println("El juego no está activo. Estado actual: " + estado);
            return;
        }
        
        System.out.println("... Simulando frame (Game Loop) ...");
        for (EntidadVideojuego e : entidades) {
            // Simulamos que los enemigos avanzan hacia abajo
            if (e.getNombre().contains("Enemigo")) {
                e.mover(0, -5);
            }
        }
    }
    // Funcionalidad Avanzada 1: Detector de Colisiones Simple
    public void detectarColisiones(Jugador jugador) {
        for (EntidadVideojuego e : entidades) {
            if (!e.equals(jugador)) { // No comparar al jugador consigo mismo
                boolean colisionX = jugador.getX() < e.getX() + e.getW() && jugador.getX() + jugador.getW() > e.getX();
                boolean colisionY = jugador.getY() < e.getY() + e.getH() && jugador.getY() + jugador.getH() > e.getY();
                
                if (colisionX && colisionY) {
                    System.out.println("¡ALERTA CRÍTICA! Colisión detectada entre " + jugador.getNombre() + " y " + e.getNombre());
                    jugador.setVida(jugador.getVida() - 20);
                    System.out.println("Vida del jugador reducida a: " + jugador.getVida());
                }
            }
        }
    }
    // Funcionalidad Avanzada 2: Guardado Rápido Simulado
    public void guardadoRapido(Jugador jugador) {
        System.out.println("--- INICIANDO GUARDADO RÁPIDO ---");
        String datosGuardado = String.format(
            "{\"estado\": \"%s\", \"jugador_x\": %d, \"jugador_y\": %d, \"vida\": %d, \"puntuacion\": %d}",
            estado, jugador.getX(), jugador.getY(), jugador.getVida(), jugador.getPuntuacion()
        );
        System.out.println("Datos exportados (JSON Simulado): " + datosGuardado);
        System.out.println("Partida guardada con éxito.");
    }
}
