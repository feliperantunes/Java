import java.util.Scanner;

public class OperadorTernario {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Teste lógico\nInsira o primeiro número: ");
        int n1 = input.nextInt();
        System.out.print("Agora insira o segundo número: ");
        int n2 = input.nextInt();

        int testeLogico = (n1 > n2) ? 0 : 1;
        String teste = testeLogico == 1 ? "O segundo número é maior" : "O primeiro número é maior";
        System.out.println(teste);

    }
}
