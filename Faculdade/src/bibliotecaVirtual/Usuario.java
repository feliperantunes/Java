package bibliotecaVirtual;

public class Usuario {
    private int idUsuario;
    private String nomeUsuario;
    private String emailUsuario;
    private int idade;

    public Usuario (int idUsuario, String nomeUsuario, String emailUsuario, int idade) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.idade = idade;
    }

    // Getters
    public  int getIdUsuario() {
        return  idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public  int getIdade(){
        return  idade;
    }

    @Override
    public String toString() {
        return getNomeUsuario();
    }
}