import java.util.Scanner;

public class DesempenhoAcademico {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bem vindo ao sistema educacional!\nInsira o nome do aluno:");
        String aluno = input.next();
        System.out.printf("Insira a nota do aluno %S no PRIMEIRO SEMESTRE: ", aluno);
        float nota1Semestre = input.nextFloat();
        System.out.printf("Insira a nota do aluno %S no SEGUNDO SEMESTRE: ", aluno);
        float nota2Semestre = input.nextFloat();
        float media = (nota1Semestre + nota2Semestre) / 2;
        System.out.printf("Média final do aluno %S: %.2f\n", aluno, media);
        if (media <= 5.0) {
            System.out.printf("O aluno %S está REPROVADO", aluno);
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.printf("O aluno %S está em RECUPERAÇÃO", aluno);
        } else if (media >= 7.0) {
            System.out.printf("O aluno %S está APROVADO", aluno);
        }

    }
}
