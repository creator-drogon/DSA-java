package java8;

public class Lambda {
    Object a = new Object();


    static cal add = (int a , int b) -> a+b;
    // we dont need a return keyword and we assign our operation to interface type
    //lambda is actually a replacement for a block of code to inline execution
    //lambda helps us write implementation of functional interface inline with shorter syntax

    public static void main(String[] args) {
        add.addo(3,4);
    }




    interface cal {

        int addo(int a,int b);
    }


}
