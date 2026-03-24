import java.sql.SQLOutput;
import java.util.Scanner;

public class EstruturasCondicionais {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bem vindo ao teste lógico de Estruturas Condicionais!\nInsira o primeiro número: ");
        float firstNumber = input.nextFloat();
        System.out.print("Agora insira o segundo número: ");
        float secondNUmber = input.nextFloat();

        if (firstNumber > secondNUmber) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (firstNumber < secondNUmber){
            System.out.println("O segundo número é maior que o primeiro");
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
