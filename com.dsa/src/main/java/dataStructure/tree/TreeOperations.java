package dataStructure.tree;

public class TreeOperations<T extends Comparable<T>> extends BinarySearchTree{


    public int findHeight(Node node){
        if(node == null) return 0;

       return  Math.max(findHeight(node.getRightChild()),findHeight(node.getLeftChild())) + 1;
    }
}
