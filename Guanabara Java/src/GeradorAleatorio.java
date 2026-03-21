import java.util.Scanner;

public class GeradorAleatorio {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Um número aleatório entre 0 e 1: %.2f\n", Math.random());
        System.out.print("Insira um número inicial: ");
        float inicio = input.nextFloat();
        System.out.print("Insira um número final: ");
        float fim = input.nextFloat();
        double aleatorio = Math.random();
        double aleatorio1 = inicio + aleatorio *(inicio - fim);
        int teste = (int) aleatorio1;
        System.out.print(teste);
    }
}
