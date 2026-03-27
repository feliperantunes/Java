import java.util.Scanner;

public class PedidoLanchonete {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float precoHamburguer = 12.00f;
        float precoBatataFrita = 7.00f;
        float precoRefrigerante = 5.00f;

        System.out.println("Olá bem vindo, qual seria o seu pedido?");
        System.out.printf("Hamburguer: R$ %.2f\nQuantidade: ", precoHamburguer);
        int quantidadeHamburguer = input.nextInt();
        System.out.printf("Batata Frita: R$ %.2f\nQuantidade: ", precoBatataFrita);
        int quantidadeBatataFrita = input.nextInt();
        System.out.printf("Refrigerante: R$ %.2f\nQuantidade: ", precoRefrigerante);
        int quantidadeRefrigerante = input.nextInt();

        System.out.printf("\nRESUMO DO PEDIDO\nHamburguer: %d | R$ %.2f | R$: %.2f\nBatata frita: %d | R$ %.2f | R$: %.2f\nRefrigerante: %d | R$ %.2f | R$: %.2f\n",
                quantidadeHamburguer, precoHamburguer, (quantidadeHamburguer * precoHamburguer), quantidadeBatataFrita, precoBatataFrita, (quantidadeBatataFrita*precoBatataFrita), quantidadeRefrigerante, precoRefrigerante, (quantidadeRefrigerante*precoRefrigerante));
        System.out.printf("TOTAL DO PEDIDO: R$ %.2f",
                (quantidadeHamburguer+quantidadeBatataFrita+quantidadeRefrigerante) * (precoHamburguer+precoBatataFrita+precoRefrigerante));
    }
}
