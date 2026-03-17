package Objeto;

public class Main {
    public static void main (String[] args){

        Uzumaki naruto = new Uzumaki();
        naruto.setNome("Naruto");
        System.out.println("Nome do ninja: " + naruto.getNome());
        naruto.aldeia = "Vila da Folha";
        naruto.idade = 20;
        naruto.modoSeninAtivado();
        naruto.ataqueBase(2);

        Uchiha sasuke = new Uchiha();
        sasuke.setNome("Sasuke");
        System.out.println("Nome do ninja: " + sasuke.getNome());
        sasuke.aldeia = "Vila da Folha";
        sasuke.idade = 20;
        sasuke.sharinganAtivado();
        sasuke.ataqueBase();
        sasuke.jogarKunai();

    }

}
