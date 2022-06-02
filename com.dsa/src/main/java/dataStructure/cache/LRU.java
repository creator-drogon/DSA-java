package dataStructure.cache;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    final int capacity;
    int currentSize;
    Map<String,Node> map;
    Node front = null;
    Node rear = null;

    LRU(int capacity){
        this.capacity = capacity;
        map = new HashMap<>(capacity);
    }

    void put(Node node){
        // if map already contains the key then perform update
        if(map.containsKey(node.key)){
            Node oldValue = map.get(node);


        }
    }


}
  class Node {
        Node prev;
        Node next;
        Integer data;
        String key;

        Node(Integer data, String key ){
            this.data = data;
            this.key = key;
        }
    }