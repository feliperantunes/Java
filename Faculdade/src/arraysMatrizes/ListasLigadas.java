package arraysMatrizes;

import java.util.LinkedList;

public class ListasLigadas {
    static void main(String[] args) {
        int [] primeiroArray;
        primeiroArray = new int [5];

        primeiroArray[0] = 1;
        primeiroArray[1] = 7;
        primeiroArray[2] = 9;
        primeiroArray[4] = 2;

        LinkedList<Integer> minhaListaLigada = new LinkedList();
        minhaListaLigada.add(1);
        minhaListaLigada.add(3);
        minhaListaLigada.add(7);
        minhaListaLigada.add(2, 5);
    }
}
