public class Saida {
    static void main (String[] args) {
        float nota = 8.6f;
        String nome = "Felipe";
        System.out.print("A nota é " + nota);
        System.out.println("Sua nota é " +nota);
        System.out.printf("A nota de %s é %.2f \n", nome, nota); //%f é utilizado por ser um tipo Float, o 2 é a quantidade de casas decimais
        System.out.format("A nota de %s é %f \n", nome, nota);
        // \n é a quebra de linha
    }
}
