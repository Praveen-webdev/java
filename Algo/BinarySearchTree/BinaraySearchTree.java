package Algo.BinarySearchTree;

public class BinaraySearchTree {
    BinaryNode root;

    public BinaraySearchTree() {
        root = null;
    }

    public void insert(int value) {
        BinaryNode node = new BinaryNode(value);
        root = insertHelper(root, node);
    }

    private BinaryNode insertHelper(BinaryNode root, BinaryNode node) { // * uses recursion to insert nodes
        int value = node.value;
        if (root == null) {
            root = node;
        } else if (value >= root.value) { // inserting nodes at right side
            root.right = insertHelper(root.right, node);
        } else {
            root.left = insertHelper(root.left, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(BinaryNode root) { // n order traversal
        if (root != null) { // * Ascending order
            displayHelper(root.left); // ? For descending order: displayHelper(root.right);
            System.out.println(root.value);
            displayHelper(root.right); // ? displayHelper(root.left)
        }
    }

    public boolean search(int value) {
        return searchHelper(root, value);
    }

    private boolean searchHelper(BinaryNode root, int value) {
        if (root == null) {
            return false;
        } else if (root.value == value) {
            return true;
        } else if (value < root.value) {
            return searchHelper(root.left, value);
        } else {
            return searchHelper(root.right, value);
        }
    }
}
