public class Moda {
    public static void main(String[] args) {
        int []vetor = {1, 5, 2, 3, 1, 3, 1};
        int moda = 0;
        int quantidadeVezes = 0;

        for (int indice = 0; indice < vetor.length; indice++) {
            for (int contador = 0; contador < vetor.length; contador++){
                int teste1 = vetor[contador];
                int teste2 = vetor[indice];
                if (vetor [contador] == vetor[indice]){
                    quantidadeVezes++;
                }
                System.out.printf("%d | %d | %d\n", teste1, teste2,quantidadeVezes);
            }
        }

        System.out.printf("Moda: %d\nQuantidade vezes: %d", moda, quantidadeVezes);

    }

}