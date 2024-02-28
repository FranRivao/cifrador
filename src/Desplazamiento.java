public class Desplazamiento {
    private final int clave;
    private String mensaje;

    public Desplazamiento(int clave, String mensaje) {
        this.clave = clave;
        this.mensaje = mensaje;
    }

    public String transformar(boolean cifrar) {
        StringBuilder nuevoMensaje = new StringBuilder();
        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            nuevoMensaje.append(cifrar ? (char) (letra + clave) : (char) (letra - clave));
        }
        mensaje = nuevoMensaje.toString();
        return mensaje;
    }
}
