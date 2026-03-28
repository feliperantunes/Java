import java.util.Scanner;

public class CalcularValorEntrega {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a distância até o cliente (Km): ");
        float distancia = input.nextFloat();
        System.out.print("Está chovendo?\n[true] [false] ");
        boolean chovendo = input.nextBoolean();
        float taxa = 0f;
        if (distancia <= 5) {
            taxa = 5.00f;
        } else if (distancia >= 6 && distancia <= 10) {
            taxa = 8.00f;
        } else {
            taxa = 10.00f;
        }
        if (chovendo) {
            taxa += 2.00f;
            System.out.printf("Está chovendo, logo sera adicionado R$ 2,00 ao valor da taxa\n   ");
        }
        System.out.printf("A taxa de entrega final ficou: R$ %.2f",taxa);
    }
}
