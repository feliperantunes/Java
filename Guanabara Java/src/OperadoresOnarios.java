public class OperadoresOnarios {
    static void main(String[] args) {
        int incremento = 6;
        incremento++;
        System.out.println(incremento);

        int decremento = 8;
        decremento--;
        System.out.println(decremento);

        int valor  = 20;
        int posIncremento = 6 + valor++;
        System.out.printf ("%d %d", valor, posIncremento);

    }

}
