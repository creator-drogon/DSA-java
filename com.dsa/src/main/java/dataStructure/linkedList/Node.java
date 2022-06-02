package dataStructure.linkedList;

public class Node<T extends Comparable<T>> {

    T data;
    public  Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }
    public Node(T data, Node<T> nextNode){
        this.data = data;
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }


      public String toString(){
           return "Node-> " + this.data;
        }
}
