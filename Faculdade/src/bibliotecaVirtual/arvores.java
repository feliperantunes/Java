package bibliotecaVirtual;

import static bibliotecaVirtual.Biblioteca.*;
import static bibliotecaVirtual.Livro.*;
import static bibliotecaVirtual.Livro.addRecomendacao;
import static bibliotecaVirtual.Usuario.visualizaLivro;

// Objeto nó
class Node {
    Livro livro;
    Node left;;
    Node right;

    // Construtor
    public Node(Livro livro) {
        this.livro = livro;
        left = null;
        right = null;
    }
}

// Avore binaria
class binaryTree {
    Node root;

    public binaryTree(){
        root = null;
    }

    // Inserir elementos na arvore
    public void set (Livro livro) {
        root = setRecursiveNode(root, livro);
    }

    // Inserir no recursivamente
    private Node setRecursiveNode (Node currentNode, Livro livro) {
        if (currentNode == null) {
            return new Node(livro);
        }

        if (livro.getIdLivro() < currentNode.livro.getIdLivro()) {
            currentNode.left = setRecursiveNode(currentNode.left, livro);
        } else {
            currentNode.right = setRecursiveNode(currentNode.right, livro);
        }
        return currentNode;
    }

    // Procurar elementos na arvore
    public boolean searchValue (int searchValue) {
        return searchRecursiveValue(root, searchValue);
    }

    private boolean searchRecursiveValue (Node currentNode, int valueToSearch){
        if (currentNode == null) {
            return false;
        }

        if (currentNode.livro.getIdLivro() == valueToSearch) {
            return true;
        }

        return (valueToSearch < currentNode.livro.getIdLivro()) ?
                (searchRecursiveValue(currentNode.left, valueToSearch)) : (searchRecursiveValue(currentNode.right, valueToSearch));
    }

    // Remover elementos na arvore
    public void del (int valueToDelete) {
        root = delRecursiveNode(root, valueToDelete);
    }

    private Node delRecursiveNode(Node currentNode, int valueToDelete) {
        if (currentNode == null) {
            return null;
        }

        if (valueToDelete == currentNode.livro.getIdLivro()) {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            }
            if (currentNode.left == null) {
                return currentNode.right;
            }
            if (currentNode.right == null) {
                return currentNode.left;
            }

            Livro highValue = searchHightValue(currentNode.left);
            currentNode.livro = highValue;
            currentNode.left = delRecursiveNode(currentNode.left, highValue.getIdLivro());
            return currentNode;
        } else if (valueToDelete < currentNode.livro.getIdLivro()) {
            currentNode.left = delRecursiveNode(currentNode.left, valueToDelete);
            return currentNode;
        } else {
            currentNode.right = delRecursiveNode(currentNode.right, valueToDelete);
            return currentNode;
        }
    }
    private Livro searchHightValue(Node currentNode) {
        return (currentNode.right == null) ?
                currentNode.livro : searchHightValue(currentNode.right);
    }

    public void showTree () {
        showRecursiveTree(root,0);
    }

    private void showRecursiveTree (Node currentNode, int nTree) {
        if (currentNode == null) {
            return;
        }
        if (nTree > 0) {
            System.out.print("     ".repeat(nTree - 1) + "+---");
        }
        System.out.println(currentNode.livro);
        showRecursiveTree(currentNode.left, nTree + 1);
        showRecursiveTree(currentNode.right, nTree + 1);
    }
}