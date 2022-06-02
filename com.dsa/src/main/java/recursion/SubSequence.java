package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SubSequence {

    public static void main(String[] args) {

        System.out.println(generate("","ab").toString());




    }

    static ArrayList<String> generate(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
           ArrayList<String> st = new ArrayList<>();
           st.add(processed);
           return st;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = generate(processed+ch,unprocessed.substring(1));
        ArrayList<String> right = generate(processed,unprocessed.substring(1));
        left.addAll(right);
        return left;





    }
}
