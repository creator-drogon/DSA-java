package dataStructure.tree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(32);
        bst.insert(20);
        bst.insert(5);
        bst.insert(64);
        bst.insert(898);
        bst.insert(200000);
        System.out.println(bst.getMax().toString());
        System.out.println(bst.getMin().toString());
        bst.traverse();
       // bst.remove(20);
        System.out.println("----------------------------");
        bst.traverse();
        Node root = new Node(32);

        int height = ((TreeOperations<?>) bst).findHeight(root);
        System.out.println(height);



    }
}
