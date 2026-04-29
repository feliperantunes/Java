package bibliotecaVirtual;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Biblioteca {
    static LinkedList<Livro> listaLivros = new LinkedList<Livro>();
    static LinkedList<Usuario> listaUsuarios = new LinkedList<Usuario>();
    static HashMap<Livro, Set<Livro>> mapa = new HashMap<>();
    static binaryTree firstTree = new binaryTree();

    // MELHROAR
    public static void recomendarLivros(Usuario usuario) {
        if (usuario.getHistorico().isEmpty()) {
            System.out.println("Nenhum histórico para recomendar.");
            return;
        }

        Livro ultimoLivro = usuario.getHistorico().peek();

        Set<Livro> recomendacoes = mapa.get(ultimoLivro);

        if (recomendacoes == null || recomendacoes.isEmpty()) {
            System.out.println("Sem recomendações para este livro.");
            return;
        }

        System.out.println("Baseado no livro: " + ultimoLivro);
        System.out.println("Recomendações:");
        for (Livro livro : recomendacoes) {
            System.out.println("- " + livro);
        }
}

    // Lista todos os livros (Apenas Nome e id)
    public static void mostrarInventario() {
        for (Livro livro : listaLivros) {
            System.out.printf("Título do livro: %s\nIdentificador do livro: %d\n-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\n",
                    livro.getTituloLivro(),
                    livro.getIdLivro()
            );
        }
    }

    // Mostra livro individual de acordo com o id passado (Todas as informações)
    public static void mostraLivroId (int alvos) {
        for (Livro livro : listaLivros) {
            if (alvos == livro.getIdLivro()) {
                String nomeUsuario;
                String filaEspera = livro.getFilaEspera().toString();
                if (livro.getUsuarioAtual() == null || livro.getFilaEspera().isEmpty()) {
                    nomeUsuario = "Disponível";
                    filaEspera = "Fila vazia";
                } else {
                    nomeUsuario = livro.getUsuarioAtual().getNomeUsuario();
                    filaEspera = livro.getFilaEspera().toString();
                }
                System.out.printf("Título do livro: %s\nAutor do livro: %s\nAno publicação: %d\nCategoria: %s\nUsuário atual: %s\nFila de espera: %s\n-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\n",
                        livro.getTituloLivro(),
                        livro.getAutorLivro(),
                        livro.getAnoPublicacao(),
                        livro.getCategoria(),
                        nomeUsuario,
                        filaEspera
                );
            }
        }
    }

    public static void mostraUsuarios() {
        for (Usuario usuario : listaUsuarios) {
            String historico = usuario.getHistorico().toString();
            System.out.printf("Nome do usuário: %s\nEmail usuário: %s\nIdade: %d\nHistórico: %s\n-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\n",
                    usuario.getNomeUsuario(),
                    usuario.getEmailUsuario(),
                    usuario.getIdade(),
                    historico
            );
        }
    }

}