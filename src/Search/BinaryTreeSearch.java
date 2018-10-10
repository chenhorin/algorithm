package Search;

public class BinaryTreeSearch<E extends Comparable<E>> {
    private class Node {
        public E value;
        public Node left;
        public Node right;

        public Node(E value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(E value) {
            this.value = value;
        }

        public Node() {
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    private Node root;

    private int size;

    public E treeSearch(E e) {
        return treeSearch(root, e);
    }

    /*1.private E treeSearch(Node node, E e) {
        if (node.value == e) {
            return e;
        }
        if (node.left.value.compareTo(e) < 0) {
            treeSearch(node.left, e);
        } else if (node.right.value.compareTo(e) > 0) {
            treeSearch(node.right,e);
        }
        throw new IllegalArgumentException("elements not exist");
       }
    */
    private E treeSearch(Node node, E e) {
        if (node == null) {
            throw new IllegalArgumentException("elements not exist");
        }
        if (node.value.compareTo(e) == 0) {
            return e;
        }
        if (node.left.value.compareTo(e) < 0) {
            return treeSearch(node.right, e);
        } else{
            return treeSearch(node.left, e);
        }
    }
}
