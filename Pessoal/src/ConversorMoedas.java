import java.util.Scanner;

public class ConversorMoedas {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float dolar = 5.26f;
        System.out.print("Insira o valor do produto (Em $): ");
        float valorProduto = input.nextFloat();
        System.out.printf("Valor de $%.2f na cotação atual: R$ %.2f", valorProduto, (dolar*valorProduto));

    }
}
