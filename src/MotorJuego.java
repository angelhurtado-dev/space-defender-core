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
}
