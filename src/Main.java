public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO SPACE DEFENDER ===");
        
        MotorJuego motor = new MotorJuego();
        GestorEntradas input = new GestorEntradas();
        
        // Empezamos la partida
        motor.setEstado("JUGANDO");
        
        // Creamos al jugador y un enemigo (Funcionalidad obligatoria: añadir entidades)
        Jugador jugador = new Jugador(100, 10);
        EntidadVideojuego asteroide = new EntidadVideojuego("Enemigo Asteroide", 100, 200, 40, 40, 50, "roca.png");
        
        motor.agregarEntidad(jugador);
        motor.agregarEntidad(asteroide);
        
        // Simulamos acciones
        input.simularPulsacion("ARRIBA", motor, jugador);
        input.simularPulsacion("DISPARAR", motor, jugador);
        
        // Simulamos un par de frames del motor
        motor.actualizar();
        motor.actualizar();
        
        // Pausamos
        input.simularPulsacion("PAUSAR", motor, jugador);
        motor.actualizar(); // Esto debería bloquearse porque está en pausa
    }
}
