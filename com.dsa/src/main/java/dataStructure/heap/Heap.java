package dataStructure.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    int size;
    int capacity;
   static  List<Integer> data;

    Heap(int size,List<Integer> data){
        this.data = new ArrayList<>();

    }

    void add(int value){
        data.add(value);
        upHeap(data.size() -1);

    }

    int remove(){
        swap(0, data.size()-1);
        int removal = data.remove(data.size()-1);
        downHeap(0);
        return removal;

    }

    private void downHeap(int parent) {
        int min = parent;
        int rightChild = parent*2 +1;
        int leftChild = parent*2 +2;
        if(rightChild < data.size() && data.get(rightChild) < data.get(min) ){

            min = rightChild;
        }
        if(leftChild < data.size() && data.get(leftChild) < data.get(min) ){

            min = leftChild;
        }
        if(min!=parent){
            swap(parent,min);
            downHeap(min);
        }

    }

    private void upHeap(int i) {

        if(i==0){
            return;
        }
        int parent = (i -1)/2;

        //min heap value of parent should be less hence perform swap
        if(data.get(parent) > data.get(i)){
            swap(i, parent);
            upHeap(parent);

        }

    }

    int peak(){

        return data.get(0);
    }

    private void swap(int i, int parent) {
        int temp = data.get(parent);
        int temp2 = data.get(i);
        data.set(i,temp);
        data.set(parent,temp2);
    }


}
