package dataStructure.stack;

public class Stack<T> {
    T[] stack;
    int size;
    Stack(){
        this.stack = (T[])new Object[1];
    }
    
    void push(T data){
        if(size == this.stack.length){
            resize(2*this.stack.length);
        }
        size = stack.length-1;
        this.stack[size] = data;
        size++;

    }

      T pop(){
        size = stack.length-1;
        T item = this.stack[size];
        --size;
        return item;
    }

    private Boolean isEmpty(){
        return this.stack.length == 0;
    }

    private void resize(int capacity) {
        
        T[] stackCopy = (T[])new Object[capacity];
        for(int i=0;i< stack.length;i++){
            stackCopy[i] = stack[i];
        }
        this.stack = stackCopy;
    }


}
