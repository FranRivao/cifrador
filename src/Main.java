public class Main {
    public static void main (String [] args) {
        Desplazamiento des = new Desplazamiento(5, "me llamo francisco");
        System.out.println(des.transformar(true));
        System.out.println(des.transformar(false));
        Transposicion tran = new Transposicion(3, "hola soy francisco");
        System.out.println(tran.transformarPorFila(true));
        System.out.println(tran.transformarPorFila(false));
    }
}
