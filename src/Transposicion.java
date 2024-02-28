public class Transposicion {
    private final int clave;
    private String mensaje;

    public Transposicion(int clave, String mensaje) {
        this.clave = clave;
        this.mensaje = mensaje;
    }

    public String transformarPorFila(boolean cifrar) {
        StringBuilder nuevoMensaje = new StringBuilder();
        for (int i = 0; i < mensaje.length(); i++) {
            nuevoMensaje.append(cifrar ? mensaje.charAt(i+clave) : mensaje.charAt(i-clave));
        }
        mensaje = nuevoMensaje.toString();
        return mensaje;
    }
}
