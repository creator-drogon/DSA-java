package java8;

public class ThreadEx {

    static Thread mythread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("this is a thread");
        }
    });

    /*
     since runnable interface is having just on method, equivalent lambda exp is possible
     @FunctionalInterface -- use it over interface specific to lambda exp (good practice)
    "functional interface" are interface with only one abstract method that can be implemented on fly via lambda
    */

    public static void main(String[] args) {
        mythread.start();
        Thread th = (new Thread(()-> System.out.println("also a thread")));
        th.start();
    }
}
