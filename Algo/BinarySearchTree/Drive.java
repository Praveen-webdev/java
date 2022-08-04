package Algo.BinarySearchTree;

public class Drive {
    public static void main(String[] args) {
        BinaraySearchTree bst = new BinaraySearchTree();
        bst.insert(20);
        bst.insert(50);
        bst.insert(40);
        bst.insert(30);
        bst.insert(50);
        bst.insert(70);
        bst.display();
        System.out.println(bst.search(20));
    }
}