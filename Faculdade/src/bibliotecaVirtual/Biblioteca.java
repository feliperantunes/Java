package bibliotecaVirtual;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import static bibliotecaVirtual.Livro.*;
import static bibliotecaVirtual.Usuario.visualizaLivro;

public class Biblioteca {
    static LinkedList<Livro> listaLivros = new LinkedList<Livro>();
    static LinkedList<Usuario> listaUsuarios = new LinkedList<Usuario>();
    static HashMap<Livro, Set<Livro>> mapa = new HashMap<>();

    public static void criaLivros() {
            Livro Duna = new Livro(
                    0,
                    "Duna: livro 1",
                    "Frank Herbert",
                    1965,
                    "Ficção Ciêntifica",
                    null
            ); listaLivros.add(Duna);

            Livro Duna2 = new Livro(
                    1,
                    "Duna: Livro 2",
                    "Frank Herbert",
                    1969,
                    "Ficção Ciêntifica",
                    null
            ); listaLivros.add(Duna2);

            Livro Duna3 = new Livro(
                    2,
                    "Duna: Livro 3",
                    "Frank Herbert",
                    1976,
                    "Ficção Ciêntifica",
                    null
            ); listaLivros.add(Duna3);

            Livro Dracula = new Livro(
                    3,
                    "Dracula",
                    "Bram Stoker",
                    1897,
                    "Ficção Ciêntifica",
                    null
            ); listaLivros.add(Dracula);

            Livro Hamlet = new Livro(
                    4,
                    "Hamlet",
                    "William Shakespeare",
                    1600,
                    "Drama",
                    null
            ); listaLivros.add(Hamlet);

            Livro OrgulhoPreconceito = new Livro(
                    5,
                    "Orgulho e Preconceito",
                    "Jane Austen",
                    1813,
                    "Romance",
                    null
            ); listaLivros.add(OrgulhoPreconceito);

            Livro RetratoDorianGrey = new Livro(
                    6,
                    "O Retrato de Dorian Grey",
                    "Oscar Wilde",
                    1890,
                    "Ficção filosófica",
                    null
            ); listaLivros.add(RetratoDorianGrey);

            Livro CodigoLimpo = new Livro(
                    7,
                    "Código Limpo: Habilidades Práticas do Agile Software",
                    "Robert C. Martin",
                    2008,
                    "Informática",
                    null
            ); listaLivros.add(CodigoLimpo);

            Livro EntendendoAlgoritmos = new Livro(
                    8,
                    "Entendendo Algoritmos: Um Guia Ilustrado para Programadores e Outros Curiosos",
                    "Aditya Y. Bhargava",
                    2017,
                    "Informática",
                    null
            ); listaLivros.add(EntendendoAlgoritmos);

            Livro ProgramadorPragmatico = new Livro(
                    9,
                    "O Programador Pragmático: De Aprendiz a Mestre",
                    "Andrew Hunt",
                    1999,
                    "Informática",
                    null
            ); listaLivros.add(ProgramadorPragmatico);


            // Recomendações
            addRecomendacao(Duna, Duna2); addRecomendacao(Duna, Duna3);
            addRecomendacao(Duna2, Duna); addRecomendacao(Duna2, Duna3);
            addRecomendacao(Duna3, Duna); addRecomendacao(Duna3, Duna2);

            addRecomendacao(Hamlet, OrgulhoPreconceito); addRecomendacao(Hamlet, RetratoDorianGrey);
            addRecomendacao(OrgulhoPreconceito, Hamlet); addRecomendacao(OrgulhoPreconceito, RetratoDorianGrey);
            addRecomendacao(RetratoDorianGrey, Hamlet); addRecomendacao(RetratoDorianGrey, OrgulhoPreconceito);

            addRecomendacao(CodigoLimpo, ProgramadorPragmatico);
            addRecomendacao(CodigoLimpo, EntendendoAlgoritmos);

            addRecomendacao(ProgramadorPragmatico, CodigoLimpo);
            addRecomendacao(ProgramadorPragmatico, EntendendoAlgoritmos);

            addRecomendacao(EntendendoAlgoritmos, CodigoLimpo);
            addRecomendacao(EntendendoAlgoritmos, ProgramadorPragmatico);

            addRecomendacao(Dracula, Duna);
            addRecomendacao(Dracula, RetratoDorianGrey);
            addRecomendacao(RetratoDorianGrey, Dracula);
            addRecomendacao(RetratoDorianGrey, OrgulhoPreconceito);
    }

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

    public static void criaUsuario() {
        Usuario Felipe = new Usuario(
                0,
                "Felipe",
                "felipe@gmail.com",
                20
        );
        listaUsuarios.add(Felipe);

        Usuario Joao = new Usuario(
                1,
                "João",
                "joao@hotmail.com",
                18
        );
        listaUsuarios.add(Joao);

        Usuario Bernardo = new Usuario(
                2,
                "Bernardo",
                "bernardo@yahoo.com",
                18
        );
        listaUsuarios.add(Bernardo);

        Usuario Vinicius = new Usuario(
                3,
                "Vinicius",
                "vinicius@gmail.com",
                17
        );
        listaUsuarios.add(Vinicius);

    }

    public static void mostrarInventario() {
        for (Livro livro : listaLivros) {
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

    public static void main(String[] args) {
        criaLivros();
        criaUsuario();
        emprestaLivro(listaLivros.get(1), listaUsuarios.get(0));
        emprestaLivro(listaLivros.get(0), listaUsuarios.get(1));
        devolveLivro(listaLivros.get(0), listaUsuarios.get(1));
        emprestaLivro(listaLivros.get(1), listaUsuarios.get(1));
        visualizaLivro(listaLivros.get(2), listaUsuarios.get(2));
        visualizaLivro(listaLivros.get(0), listaUsuarios.get(2));
        recomendarLivros(listaUsuarios.get(2));
        //mostrarInventario();
        mostraUsuarios();
    }

/*Ideia 1: Mostrar apenas nome do livro e Id e depois selecionar qual livro quer mostrar com mais detalhes
* Ideia 2: Separar a criação dos livros e dos usuarios em outros arquivos para ficar menos poluido
*/
}
