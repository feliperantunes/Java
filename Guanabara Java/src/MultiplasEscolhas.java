import java.util.Scanner;

public class MultiplasEscolhas {
    static void main(String[] args) {
        System.out.print("Quantas pernas tem a criatura?\nResposta: ");
        Scanner input = new Scanner(System.in);
        int pernas = input.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Então é um Saci";
                break;
            case 2:
                tipo = "Então é um Bípede";
                break;
            case 4:
                tipo = "Então é um Quadrúpede";
                break;
            case 6, 8:
                tipo = "Então é uma Aranha";
                break;
            default:
                tipo = "Só pode ser um ET";
        }
        System.out.printf("%d pernas? %s", pernas,tipo);
    }
}
