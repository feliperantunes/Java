import java.util.Scanner;

public class EstruturasDeRepeticao {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Contador de cambalhotas!!\nInsira o números de cambalhotas: ");
        int cambalhotas = input.nextInt() + 1;
        for (int contador = 1; contador < cambalhotas; contador++) {
            System.out.printf("%dº Cambalhota\n", contador);
        }
        System.out.println("Fim das cambalhotas!");
    }
}
/* utilizando While
public class EstruturasDeRepeticaoWhile {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Contador de cambalhotas!!\nInsira o números de cambalhotas: ");
        int cambalhotas = input.nextInt() + 1;
        int contador = 1;
        While (contador < cambalhotas) {
            System.out.printf("%dº Cambalhota\n", contador);
            contador++;
        }
        System.out.println("Fim das cambalhotas!");
    }
}
*/