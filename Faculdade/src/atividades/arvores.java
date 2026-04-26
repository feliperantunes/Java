package atividades;

// Objeto nó
class Node {
    int nodeValue;
    Node left;;
    Node right;

    // Construtor
    public Node(int value) {
        this.nodeValue = value;
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
    public void set (int valueToSet) {
        root = setRecursiveNode(root, valueToSet);
    }

    // Inserir no recursivamente
    private Node setRecursiveNode (Node currentNode, int valueToSet) {
        if (currentNode == null) {
            return new Node(valueToSet);
        }

        if (valueToSet < currentNode.nodeValue) {
            currentNode.left = setRecursiveNode(currentNode.left, valueToSet);
        } else {
            currentNode.right = setRecursiveNode(currentNode.right, valueToSet);
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

        if (currentNode.nodeValue == valueToSearch) {
            return true;
        }

        return (valueToSearch < currentNode.nodeValue) ?
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

        if (valueToDelete == currentNode.nodeValue) {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            }
            if (currentNode.left == null) {
                return currentNode.right;
            }
            if (currentNode.right == null) {
                return currentNode.left;
            }

            int highValue = searchHightValue (currentNode.left);
            currentNode.nodeValue = highValue;
            currentNode.left = delRecursiveNode(currentNode.left, highValue);
            return  currentNode;
        } else if (valueToDelete < currentNode.nodeValue) {
            currentNode.left = delRecursiveNode(currentNode.left, valueToDelete);
            return currentNode;
        } else {
            currentNode.right = delRecursiveNode(currentNode.right, valueToDelete);
            return currentNode;
        }
    }
    private int searchHightValue (Node currentNode) {
        return (currentNode.right == null) ?
                (currentNode.nodeValue) : (searchHightValue(currentNode.right));
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
        System.out.println(currentNode.nodeValue);
        showRecursiveTree(currentNode.left, nTree + 1);
        showRecursiveTree(currentNode.right, nTree + 1);
    }
}

public class arvores {
    static void main(String[] args) {
       binaryTree firstTree = new binaryTree();

       firstTree.set(5);
       firstTree.set(6);
       firstTree.set(1);
       firstTree.set(0);
       firstTree.set(7);

       firstTree.showTree();
    }
}
