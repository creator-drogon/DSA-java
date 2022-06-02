package colections;

import java.util.Arrays;
import java.util.List;
//Upper Bounded Wildcards
//add(List<? extends  Number> num) means a list that will accept parameters that are child class of  number class such as Integer,Float
//lower bound wildcards
public class GnereicsWildcaeds {


    public static void main(String[] args) {
        List<Number> tp =Arrays.asList(1,3.9,46);
        add(tp);
        printer(8);
        printer("eight");

    }
    public static void add(List<? extends  Number> num){
        double sum = 0.0;

        for(Number i:num){
            sum+=i.doubleValue();
        }
        System.out.println(sum);
    }


//Lower bound wildcards will allow only lower child classes
    public static void addLower(List<? super Integer> num){
        double sum = 0.0;

        for(Object i:num){

        }
        System.out.println(sum);
    }

    //generic works only with reference types so we can't use generic with int, char
    static <T> void printer(T obj){

        System.out.println(obj);
    }
}
