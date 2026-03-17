package Objeto;

public class Ninja {
    private String nome;
    String cla;
    String aldeia;
    int idade;

    /* Getter para mostrar para o usuário*/
    public String getNome() {
        return nome;
    }

    /* Setter para definir o valor da var*/
    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public void jogarKunai () {
        System.out.println("Kunai jogada");
    }

    public void ataqueBase (){
        System.out.println("Membro do clã utiliza ataque base ");
    }

}
