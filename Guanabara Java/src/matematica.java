public class matematica {
    static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println("Expotenciação: 5² = " + Math.pow(5,2));
        System.out.println("Raiz quadrada: √25 = " + Math.sqrt(25));
        System.out.println("Raiz cubica: √³27 = " + Math.cbrt(27));
        System.out.println("Valor absoluto (ignora o sinal): Abs -8 = " + Math.abs(-8));
        System.out.println("Piso: 3.9 = " + Math.floor(3.9));
        System.out.println("Teto: 4.2 = " + Math.ceil(4.2));
        System.out.println("Areedondamento: 5.6 = " + Math.round(5.6));

        System.out.println("Número aleatório entre 0.0 e 1.0: " + Math.random());
        System.out.println("Número aleatório entre intervalos: " + (5 + Math.random() * (10-5)));
    }
}
