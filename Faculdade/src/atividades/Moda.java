package atividades;

public class Moda {
     static void main(String[] args) {
        int [] vetor = {1, 5, 2, 3, 1, 3, 1};
        int moda = 0;
        int quantidadeVezes = 0;
        int recordeAtual = 0;

        for (int indice = 0; indice < vetor.length; indice++) {
            int contador;
            for (contador = 0; contador < vetor.length; contador++) {
                if (vetor[contador] == vetor[indice]) {
                    quantidadeVezes++;
                }
            }
            if (quantidadeVezes > recordeAtual) {
                recordeAtual = quantidadeVezes;
                moda = vetor[indice];
            }
            quantidadeVezes = 0;
            //System.out.printf("%d | %d | %d\n",vetor[indice],quantidadeVezes, recordeAtual);
        }
        System.out.printf("Moda: %d", moda);
    }
}