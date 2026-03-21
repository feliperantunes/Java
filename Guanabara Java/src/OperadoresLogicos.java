import java.util.Scanner;

public class OperadoresLogicos {
    static void main(String[] args) {
        /* && E
        *  || Ou
        *  ^  Exclusivo
        *  !  Negação
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Verificando operadores lógicos!");
        System.out.print("Insira o primeiro número: ");
        int n1 = input.nextInt();
        System.out.print("Insira o segundo número: ");
        int n2 = input.nextInt();

        if (n1 >= 0 && n2 <= 10) {
            System.out.println("O número está entre 0 e 10");
        }

        if (!(n1 % 2 == 0)) {
            System.out.println("O primeiro número é impar");
        } else {
            System.out.println("O primeiro número é par");
        }

    }
}
