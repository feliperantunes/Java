public class Metodo {
    static void main(String[] args) {
        mostrarMeuNome();
        mostrarNome("Arroz", 20);
    }

    private static void mostrarMeuNome(){
        System.out.println("Meu nome é Felipe e eu tenho 19 anos.");
    }

    private static void mostrarNome(String nome, int idade) {
        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
    }
}
