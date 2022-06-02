package dataStructure.heap;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        final List<Integer> integers = Arrays.asList();
        Heap heap = new Heap(integers.size(), integers);
        heap.add(2);
        heap.add(22);
        heap.add(45);
        heap.add(1);
        heap.add(7);
        int ans = heap.peak();
        System.out.println(ans);
    }
}
