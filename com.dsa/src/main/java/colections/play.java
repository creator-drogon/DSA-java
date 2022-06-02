package colections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 class play {

     public static void main(String[] args) {
         Map<String,Integer> m1 = new HashMap<>();
         m1.put("e",1);
          m1.put("f", 2);

        int y =  m1.get("e");
         System.out.println(y);

     }
}
