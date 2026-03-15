package ProgramaIdioma;

import java.util.Locale;

public class ProgramaIdioma {
    public static void main(String[] args) {
        String idioma = Locale.getDefault().getLanguage();
        System.out.print("O idioma do sistema esta em ");
        System.out.println(idioma.toString());
    };
}
