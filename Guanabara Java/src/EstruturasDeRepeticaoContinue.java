import java.util.Scanner;

public class EstruturasDeRepeticaoContinue {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Contador de cambalhotas!!\nInsira o números de cambalhotas: ");
        int cambalhotas = input.nextInt() + 1;
        for (int contador = 1; contador < cambalhotas; contador++) {
            if (contador == 2 || contador  ==4) {
                continue;
            }
            if (contador == 7) {
                break;
            }
            System.out.printf("%dº Cambalhota\n", contador);

        }
        System.out.println("Fim das cambalhotas!");
    }
}