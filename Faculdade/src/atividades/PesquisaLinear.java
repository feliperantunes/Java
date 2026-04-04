package atividades;

import java.util.Arrays;
import java.util.Scanner;

// Fazer algoritmo para busca linear o(n)
public class PesquisaLinear {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] meuArray = {2, 3, 5, -1, 7, 9};
        Arrays.sort(meuArray);

        System.out.print("Insira o número que você queira buscar no array e iremos retornar a posição exata do mesmo: ");
        int numemroDesejado = scanner.nextInt();
        for (int c = 0; c < meuArray.length; c++) {
            System.out.printf("%d | %d\n", c, meuArray[c]);
        }
    }
}
