package bibliotecaVirtual;

import java.io.FilterOutputStream;
import java.util.LinkedList;

public class Biblioteca {
    static LinkedList<Livro> listaLivros = new LinkedList<Livro>();
    static LinkedList<Usuario> listaUsuarios = new LinkedList<Usuario>();

    public static void criaLivros () {
        Livro Duna = new Livro(
                1,
                "Duna: livro 1",
                "Frank Herbert",
                1965,
                "Ficção Ciêntifica",
                false
        );
        listaLivros.add(Duna);

        Livro Dracula = new Livro(
                2,
                "Dracula",
                "Bram Stoker",
                1897,
                "Ficção Ciêntifica",
                true
        );
        listaLivros.add(Dracula);

        Livro Hamlet = new Livro (
                3,
                "Hamlet",
                "William Shakespeare",
                1600,
                "Drama",
                false
        );
        listaLivros.add(Hamlet);

    }

    public static void criaUsuario () {
        Usuario Felipe = new Usuario(
                1,
                "Felipe",
                "felipe@gmail.com",
                18
        );
        listaUsuarios.add(Felipe);
    }

    public static void mostrarInventario () {
        for (Livro livro : listaLivros) {
            System.out.printf("Título do livro: %s\nAutor do livro: %s\nAno publicação: %d\nCategoria: %s\n-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\n",
                    livro.getTituloLivro(),
                    livro.getAutorLivro(),
                    livro.getAnoPublicacao(),
                    livro.getCategoria());
        }
    }

    public static void mostraUsuarios () {
        for (Usuario usuario : listaUsuarios) {
            System.out.printf("Nome do usuário: %s\nEmail usuário: %s\nIdade: %d\n-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\n",
                    usuario.getNomeUsuario(),
                    usuario.getEmailUsuario(),
                    usuario.getIdade()
            );
        }
    }

    public static void main(String[] args) {
        criaLivros();
        criaUsuario();
        mostrarInventario();
        mostraUsuarios();
    }

}
