package bibliotecaVirtual;

import java.util.LinkedList;
import java.util.Queue;

import static bibliotecaVirtual.Livro.devolveLivro;
import static bibliotecaVirtual.Livro.emprestaLivro;

public class Biblioteca {
    static LinkedList<Livro> listaLivros = new LinkedList<Livro>();
    static LinkedList<Usuario> listaUsuarios = new LinkedList<Usuario>();
    Queue<Livro> filaEspera = new LinkedList<Livro>();

        public static void criaLivros() {
            Livro Duna = new Livro(
                    1,
                    "Duna: livro 1",
                    "Frank Herbert",
                    1965,
                    "Ficção Ciêntifica",
                    null,
                    null
            );
            listaLivros.add(Duna);

            Livro Dracula = new Livro(
                    2,
                    "Dracula",
                    "Bram Stoker",
                    1897,
                    "Ficção Ciêntifica",
                    null,
                    null
            );
            listaLivros.add(Dracula);

            Livro Hamlet = new Livro(
                    3,
                    "Hamlet",
                    "William Shakespeare",
                    1600,
                    "Drama",
                    null,
                    null
            );
            listaLivros.add(Hamlet);

        }

        public static void criaUsuario() {
            Usuario Felipe = new Usuario(
                    1,
                    "Felipe",
                    "felipe@gmail.com",
                    20
            );
            listaUsuarios.add(Felipe);

            Usuario Joao = new Usuario(
                    2,
                    "João",
                    "joao@hotmail.com",
                    18
            );
            listaUsuarios.add(Joao);

            Usuario Bernardo = new Usuario(
                    3,
                    "Bernardo",
                    "bernardo@yahoo.com",
                    18
            );
            listaUsuarios.add(Bernardo);

            Usuario Vinicius = new Usuario(
                    4,
                    "Vinicius",
                    "vinicius@gmail.com",
                    17
            );
            listaUsuarios.add(Vinicius);

        }

        public static void mostrarInventario() {
            for (Livro livro : listaLivros) {
                String nomeUsuario;
                if (livro.getUsuarioAtual() == null || livro.getFilaEspera() == null) {
                    nomeUsuario = "Disponível";
                } else {
                    nomeUsuario = livro.getUsuarioAtual().getNomeUsuario();
                }
                System.out.printf("Título do livro: %s\nAutor do livro: %s\nAno publicação: %d\nCategoria: %s\nUsuário atual: %s\n-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\n",
                        livro.getTituloLivro(),
                        livro.getAutorLivro(),
                        livro.getAnoPublicacao(),
                        livro.getCategoria(),
                        nomeUsuario
                );
            }
        }

        public static void mostraUsuarios() {
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
            emprestaLivro(listaLivros.get(1), listaUsuarios.get(0));
            emprestaLivro(listaLivros.get(0), listaUsuarios.get(1));
            devolveLivro(listaLivros.get(0), listaUsuarios.get(1));
            emprestaLivro(listaLivros.get(1), listaUsuarios.get(1));
            mostrarInventario();
            //mostraUsuarios();
        }

}
