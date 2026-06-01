public class GestorEntradas {
    public void simularPulsacion(String boton, MotorJuego motor, Jugador jugador) {
        System.out.println(">> Input detectado: [" + boton + "]");
        switch (boton.toUpperCase()) {
            case "ARRIBA":
                jugador.mover(0, 10);
                break;
            case "DISPARAR":
                System.out.println("¡Pew pew! El jugador dispara un láser.");
                break;
            case "PAUSAR":
                motor.setEstado("PAUSA");
                break;
            default:
                System.out.println("Comando no reconocido.");
        }
    }
}
