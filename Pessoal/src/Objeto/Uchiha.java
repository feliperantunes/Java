package Objeto;

public class Uchiha extends Ninja {
    public void sharinganAtivado() {
        System.out.println("Sharingan ativado!");
    }

    public void nivelSharingan2 () {
        System.out.println("Sharingan de nível 2");
    }

    public void nivelSharingan3 () {
        System.out.println("Sharingan de nível 3");
    }

    @Override
    public void ataqueBase (){
        System.out.println("Membro do clã UCHIHA utiliza ataque base CHIDORI");
    }
}


