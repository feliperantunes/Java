import java.util.Scanner;

public class PesquisaLinear {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] meuArray = {2, 3, 5, -1, 7, 9};

        System.out.print("Insira um número que você queira buscar no array: ");
        int numeroDesejado = scanner.nextInt();

        int i;
        int indiceDesejado = 0;
        boolean flag = false;

        for (i = 0; i < meuArray.length; i++) {
            System.out.printf("%d | %d\n",i, meuArray[i]);
            if (numeroDesejado == meuArray[i]){
                flag = true;
                indiceDesejado = i;
                break;
            }
        }
        if (flag) {
            System.out.printf("O número %d esta na posição %d da lista",numeroDesejado,(indiceDesejado+1));
        } else {
            System.out.println("Número não encontrado na lista");
        }
    }
}