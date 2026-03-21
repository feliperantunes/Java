import java.util.Scanner;

public class OperadoresRelacionais {
    static void main(String[] args) {
        /* > Maior que | >= Maior ou igual
        *  < Menor que | <= Menor ou igual
        *  == Igual a
        *  != Diferente
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Verificando operadores relacionais!");
        System.out.print("Insira o primeiro número: ");
        float n1 = input.nextFloat();
        System.out.print("Insira o segundo número: ");
        float n2 = input.nextFloat();

        String testeLogico = (n1 >= n2) ? "Verdadeiro" : "Falso";
        System.out.println("Vamos verificar...");
        System.out.printf("O %.2f é IGUAL ou MAIOR que %.2f? %s", n1, n2, testeLogico);

    }
}
