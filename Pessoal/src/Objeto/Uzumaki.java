package Objeto;

public class Uzumaki extends Ninja{

    public void cla () {

    }

    // herança
    @Override
    public void ataqueBase (){
        System.out.println("Membro do clã UZUMAKI utiliza ataque base RASENGAN!");
    }

    // polimorfismo
    public void ataqueBase(int nivelChacara) {
        if (nivelChacara < 5) {
            System.out.println("RESEN SHURIKEN lançado!");
        } else if (nivelChacara > 5) {
            System.out.println("CLONE DAS SOMBRAS lançado!");
        } else {
            System.out.println("Sem chacara");
        }
    }

    public void modoSeninAtivado () {
        System.out.println("Modo Senin ativado!");
    }
}
