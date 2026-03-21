import java.time.LocalDate;
import java.util.Scanner;

public class Votacao {
    static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        Scanner input = new Scanner(System.in);
        int ano = hoje.getYear();
        System.out.print("Insira seu ano de nascimento: ");
        int anoNascimento = input.nextInt();
        int idade = ano - anoNascimento;
        String situacao = (idade > 18 ? "MAIOR DE IDADE" : "MENOR DE IDADE");
        String situacaoVoto = ((idade >= 16 && idade < 18) || idade > 70) ? "VOTO é OPICIONAL" : "VOTO é OBRIGATÓRIO";
        System.out.printf("Você tem %d anos de idade. Logo você é %S e o seu %S", idade, situacao, situacaoVoto);

    }

}
