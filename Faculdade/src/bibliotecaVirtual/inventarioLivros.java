package bibliotecaVirtual;

import java.util.LinkedList;

public class inventarioLivros {
    public static void main(String[] args) {
        LinkedList<Livro> minhaLista = new LinkedList();
        Livro Duna = new Livro(
                1,
                "Duna: livro 1",
                "Frank Herbert",
                1965,
                "Ficção Ciêntifica"
        );

        Livro Dracula = new Livro(
                2,
                "Dracula",
                "Bram Stoker",
                1897,
                "Ficção Ciêntifica"
        );

        Livro Hamlet = new Livro (
                3,
                "Hamlet",
                "William Shakespeare",
                1600,
                "Drama"
        );
        minhaLista.add(Duna);
        minhaLista.add(Dracula);
        minhaLista.add(Hamlet);
    }
}
