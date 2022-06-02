package multithreading;

import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPlay {

    public static ThreadLocal<SimpleDateFormat> date = new ThreadLocal<SimpleDateFormat>();


        // thread local provides thread specific variables
    static ExecutorService es = Executors.newFixedThreadPool(10);


double d = 20.3;
long n = (long) d;
int j= (int) n;
float f = j;




    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        for(int i =0; i<10;i++) {
            Thread myth = new Thread(new MyTask());
            myth.start();
        }
        System.out.println("current thread name is " + Thread.currentThread().getName());
        AtomicInteger a = new AtomicInteger();
        ThreadPlay.date.get();
        es.submit(new MyTask());

        Thread t = new Thread(()-> System.out.println("do nothing "));
        t.setDaemon(true);

    }



    static class MyTask implements java.lang.Runnable{


        @Override
        public void run() {

            System.out.println("current thread name is " + Thread.currentThread().getName());

        }
    }
}
