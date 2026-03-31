import java.util.Scanner;

public class ConversorTemperatura {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boasVindas = """
                -=== Bem vindo ao conversor de temperatura! ===-
                          [Celsius] => [Fahrenheit]
                
                Insira a temperatura em Celsius: """;
        System.out.print(boasVindas);
        float temperaturaCelsius = scanner.nextFloat();
        float temperaturaFahrenheit = (temperaturaCelsius * 1.8f) + 32;
        System.out.printf("A temperatura de %.1fºc são %.1fºf", temperaturaCelsius, temperaturaFahrenheit);
    }
}
