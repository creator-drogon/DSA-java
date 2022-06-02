package leetcode;

import java.util.ArrayList;
import java.util.List;

public class test extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Object ob = new Object();
        synchronized(Thread.currentThread()){
            ob.wait();
            ob.notify();
        }
    }


}
