import java.util.Scanner;

public class Soma {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora mais poderosa do mundo!");
        System.out.print("Insira o primeiro número que deseja somar: ");
        float n1 = teclado.nextFloat();
        System.out.print("Insira o segundo número que deseja somar: ");
        float n2 = teclado.nextFloat();
        float soma = n1 + n2;
        System.out.printf("A soma de %.2f + %.2f é igual a %.2f", n1, n2, soma);
    }
}
