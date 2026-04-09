package bibliotecaVirtual;

public class Livro {
    private int idLivro;
    private String tituloLivro;
    private String autorLivro;
    private int anoPublicacao;
    private String categoria;

    // Construtor
    public Livro (int idLivro, String tituloLivro, String autorLivro, int anoPublicacao, String categoria){
        this.idLivro = idLivro;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
    }

    // Getters
    public int getIdLivro () {
        return idLivro;
    }

    public String getTituloLivro () {
        return tituloLivro;
    }

    public String getAutorLivro () {
        return autorLivro;
    }

    public int getAnoPublicacao () {
        return anoPublicacao;
    }

    public String getCategoria () {
        return categoria;
    }

}

