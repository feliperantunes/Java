//import java.util.Arrays;
import java.util.Scanner;

public class PedidosCafeteria {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos itens o cliente deseja? ");
        int qtdProduto = scanner.nextInt();
        float[] precos = new float [qtdProduto];
        float precoProduto = 0;
        for (int contador = 0; contador < qtdProduto; contador++){
            System.out.print("Insira o nome do produto: ");
            String nomeProduto = scanner.next();
            System.out.print("Insira o preço do produto: R$ ");
            precoProduto = scanner.nextFloat();
            precos[contador] = precoProduto;
        }
        float soma = 0;
        for (float preco: precos) {
            soma+= preco;
        }
        System.out.print("O cliente é cadastrado?\n[true] [false]:");
        boolean cadastrado = scanner.nextBoolean();
        if (cadastrado) {
            soma -= (soma * 0.10);
            System.out.printf("O cliente é cadastrado, 10%% de desconto aplicado!\nValor total da compra: R$ %.2f", soma);
        } else {
            System.out.printf("Valor total da compra: R$ %.2f", soma);
        }

    }

}
