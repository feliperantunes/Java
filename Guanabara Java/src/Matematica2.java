import java.util.Scanner;

public class Matematica2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo divisor!");
        System.out.print("Insira o Numerador da sua divisão: ");
        float numerador = input.nextFloat();
        System.out.print("Agora insira o Denominador da sua divisão: ");
        float denominador = input.nextFloat();
        System.out.printf("%.2f / %.2f = %.2f", numerador, denominador, (numerador / denominador));
    }
}
