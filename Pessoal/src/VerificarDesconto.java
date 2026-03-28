import java.util.Scanner;

public class VerificarDesconto {
    static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float preco = 22.90f;
        System.out.println("Bem vindo ao sistema de bilheteria");
        System.out.print("Insira a idade do cliente: ");
        int idade = input.nextInt();
        System.out.print("O cliente é estudante?\n[TRUE] ou [FALSE] ");
        boolean estudante = input.nextBoolean();
        if (idade < 18 ||estudante) {
            preco = preco/2;
//            String pagaMeia = "SIM";
            System.out.printf("O cliente ira pagar o ingresso pela metade do preço!\nPreço a pagar: %.2f", preco);
        } else {
            //String pagaMeia = "NÃO";
            System.out.printf("O cliente ira pagar o ingresso no seu valor completo!\nPreço a pagar: %.2f", preco);
        }

    }
}
