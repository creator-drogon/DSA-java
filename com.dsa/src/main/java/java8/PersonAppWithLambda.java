package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonAppWithLambda {

// main aim of this class is to replace the functional interface implementation with lambda

// java provides out of the box functional interface that can be used instead of creating our own interfaces

    static public List<Person> p = Arrays.asList(
            new Person("karan", "khanna", 24),
            new Person("gagan", "kumar", 94),
            new Person("magan", "beta", 54),
            new Person("sagan", "lambda", 20),
            new Person("karan", "gamma", 29));

    public static void main(String[] args) {
        Collections.sort(p, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));

       // printAll(p);
        performWithLambda(p, p->true,p-> System.out.println(p));
        //printAll is basically printConditionally with condition always true for all the person object in the list

        //providing inline implementation of interface Condition
        performWithLambda(p, p -> p.getLastName().startsWith("k"),p -> System.out.println(p.getFirstName()));
    }
//replaces our self create functional interface of Condition with predicate java owned interface that also returns boolean
    private static void performWithLambda(List<Person> p, Predicate<Person> predicate, Consumer<Person> consumer) {
//print conditionally method just prints the method with condition returning true

        for(Person single : p){

            if(predicate.test(single)) {
                consumer.accept(single);

            }

        }
    }

    private static void printAll(List<Person> p) {

        for (Person single : p) {
            System.out.println(single);

        }
    }



}
