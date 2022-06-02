package dataStructure.linkedList;

public class LinkedList<T extends Comparable<T>> implements List<T>{

    Node<T> head;
    int length;

    @Override
    public void insert(T data) {
        this.length++;
        if(head==null){
            head = new Node<>(data);
        }
        //O(1) operation for insertion at the beginning
        else{
            Node<T> newNode = new Node<>(data);
            newNode.setNextNode(head);
            head = newNode;
        }

    }

    public Boolean isEmpty(){
        return this.head == null;
    }

    @Override
    public void remove(T data) {
        if(head == null) throw new IndexOutOfBoundsException();
        if(head.getData().equals(data)){
            head = head.nextNode;
            return;
        }
        Node<T> current  = head;
        Node<T> previous = null;
        while(current!=null && !current.getData().equals(data)){
            previous= current;
            current= current.nextNode;
        }
        if(current!=null && previous!=null){
            previous.nextNode = current.nextNode;
        }


    }

    @Override
    public void traverse() {
        Node<T> temp = null;
        if( this.head!=null){
        temp  = this.head;}

        while(temp.getNextNode()!=null){

            System.out.println(temp);
            temp = temp.getNextNode();
        }


    }
    public T getPos(int pos){
        if (isEmpty()) throw new IndexOutOfBoundsException();
        Node<T> temp = head;
        for(int i=0;i<pos;i++){
            temp = temp.getNextNode();
        }
        if(temp == null) throw new IndexOutOfBoundsException();
        return temp.data;
    }

    @Override
    public int size() {
        return 0;
    }
}
