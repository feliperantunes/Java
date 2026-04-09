package arraysMatrizes;
import java.util.Arrays;
public class AddDelArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        System.out.println("Vetor original: " + Arrays.toString(original));

        int[] novo = new int[original.length + 1];
        // Vetor de origem, posição inicial do vetor de origem, vetor de destino (novo vetor criado), posição inicial do vetor de destino, quantidade
        // Comece no índice 0 do array original, cola no índice 0 do novo array, copia o tamanho do vetor original e copia todos os elementos do array original
        System.arraycopy(original, 0, novo, 0, original.length);
        novo[original.length] = 4000; // Adicionando o elemento 4000
        System.out.println("Novo vetor: " + Arrays.toString(novo));

        int indexParaRemover = 2;
        int[] novo2 = new int [original.length - 1];

        System.arraycopy(original, 0, novo2, 0, indexParaRemover);
        System.out.println("Novo vetor (parcial): " + Arrays.toString(novo2));

        // começo a copiar do próximo elemento para ignorar o que será removido, colo na posição onde ele estava e copio apenas os elementos que vêm depois dele
        System.arraycopy(original, indexParaRemover + 1, novo2, indexParaRemover, original.length - indexParaRemover - 1);
        System.out.println("Novo vetor (final): " + Arrays.toString(novo2));
    }
}