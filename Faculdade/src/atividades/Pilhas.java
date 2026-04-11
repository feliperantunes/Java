import java.util.LinkedList;

class PilhaComLista {
    private LinkedList<Integer> lista = new LinkedList<Integer>();

    // Adiciona elemento na pilha
    public void empilhar(int valor) {
        lista.addLast(valor);  // Adiciona no final da lista (topo da pilha)
    }

    // Remove elemento do topo da pilha
    public int desempilhar() {
        if (!estaVazia()) {
            return lista.removeLast();  // Remove do final da lista (topo da pilha)
        } else {
            System.out.println("Pilha vazia!");
            return -1;  // Indicando erro
        }
    }

    // Verifica se a pilha está vazia
    public boolean estaVazia() {
        return lista.isEmpty();
    }
}

class Main {
    // Método main para testes
    public static void main(String[] args) {
        PilhaComLista pilha = new PilhaComLista();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);
        pilha.empilhar(50);
        pilha.empilhar(60);
        pilha.empilhar(70);
        pilha.empilhar(4);
        pilha.empilhar(5);
        pilha.empilhar(1);

        while (!pilha.estaVazia()) {
            System.out.println("Removendo o valor do topo. Removemos o: " + pilha.desempilhar());
        }
    }
}
