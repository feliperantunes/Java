package arrays;
import java.util.Arrays;
public class AddDelElementos {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        System.out.println("Vetor original: " + Arrays.toString(original));

        int[] novo = new int[original.length + 1];
        System.arraycopy(original, 0, novo, 0, original.length);
        novo[original.length] = 4000; // Adicionando o elemento 4000
        System.out.println("Novo vetor: " + Arrays.toString(novo));

        int indexParaRemover = 2;
        int[] novo2 = new int [original.length - 1];

        System.arraycopy(original, 0, novo2, 0, indexParaRemover);
        System.out.println("Novo vetor (parcial): " + Arrays.toString(novo2));

        System.arraycopy(original, indexParaRemover + 1, novo2, indexParaRemover, original.length - indexParaRemover - 1);
        System.out.println("Novo vetor (final): " + Arrays.toString(novo2));
    }
}