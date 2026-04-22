package bibliotecaVirtual;

import static bibliotecaVirtual.Biblioteca.*;
import static bibliotecaVirtual.Livro.*;
import static bibliotecaVirtual.Livro.addRecomendacao;
import static bibliotecaVirtual.Usuario.visualizaLivro;

public class Main {

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

    public static void main(String[] args) {
        // Criação de usuarios e livros
        criaLivros();
        criaUsuario();

        emprestaLivro(listaLivros.get(1), listaUsuarios.get(0));
        emprestaLivro(listaLivros.get(0), listaUsuarios.get(1));
        devolveLivro(listaLivros.get(0), listaUsuarios.get(1));
        emprestaLivro(listaLivros.get(1), listaUsuarios.get(1));
        visualizaLivro(listaLivros.get(2), listaUsuarios.get(2));
        visualizaLivro(listaLivros.get(0), listaUsuarios.get(2));
        //recomendarLivros(listaUsuarios.get(2));

        // Lista todos os livros (Apenas Nome e id)
        mostrarInventario();

        // Mostra livro individual de acordo com o id passado (Todas as informações)
        mostraLivroId(0);
        //mostraUsuarios();
    }

}
