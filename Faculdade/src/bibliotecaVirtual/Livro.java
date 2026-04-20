package bibliotecaVirtual;

import java.util.LinkedList;
import java.util.Queue;

public class Livro {
    private int idLivro;
    private String tituloLivro;
    private String autorLivro;
    private int anoPublicacao;
    private String categoria;
    private Usuario usuarioAtual;
    private Queue<Usuario> filaEspera = new LinkedList<>();

    // Construtor
    public Livro (int idLivro, String tituloLivro, String autorLivro, int anoPublicacao, String categoria, Usuario usuarioAtual){
        this.idLivro = idLivro;
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.usuarioAtual = usuarioAtual;
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

    public Usuario getUsuarioAtual () {
            return usuarioAtual;
    }

    public Queue getFilaEspera () {
        return filaEspera;
    }

    // Setters
    public void setUsuarioAtual(Usuario usuarioAtual){
        this.usuarioAtual = usuarioAtual;
    }

    public static void emprestaLivro(Livro livro, Usuario usuario) {
        if (livro.getUsuarioAtual() == null) {
            livro.setUsuarioAtual(usuario);
        } else {
            livro.getFilaEspera().add(usuario);
        }
    }

    public static void devolveLivro(Livro livro, Usuario usuario) {
        if (livro.getUsuarioAtual() == usuario) {
            if (!livro.getFilaEspera().isEmpty()) {
                Usuario proximo = (Usuario) livro.getFilaEspera().poll();
                livro.setUsuarioAtual(proximo);
            } else {
                livro.setUsuarioAtual(null);
            }
        }
    }

    @Override
    public String toString() {
        return getTituloLivro();
    }

}

