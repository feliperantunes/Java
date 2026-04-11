package atividades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class teste {

    static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        int teste = dataAtual.getYear();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatador);

        System.out.println(teste);
    }
}
