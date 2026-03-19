import java.util.Scanner;

public class DivisaoEResto {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo a divisor");
        System.out.print("Insira o numerador: ");
        float numerador = scan.nextFloat();
        System.out.print("Insira o denominador: ");
        float denominador = scan.nextFloat();

        float divisao = numerador / denominador;
        float restoDivisao = numerador % denominador;

        System.out.printf("O resultado da divisão é: %.2f \n O resultado do resto da divisão é: %.2f", divisao, restoDivisao);
    }
}
