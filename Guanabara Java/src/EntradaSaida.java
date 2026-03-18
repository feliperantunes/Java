import java.util.Scanner;

public class EntradaSaida {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.printf("Insira a nota do aluno %s: ", nome);
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f", nome, nota);
    }
}
