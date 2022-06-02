package java8;

import java.util.*;

public class PersonApp {




        static public List<Person> p = Arrays.asList(
                new Person("karan", "khanna", 24),
                new Person("gagan", "kumar", 94),
                new Person("magan", "beta", 54),
                new Person("sagan", "lambda", 20),
                new Person("karan", "gamma", 29));

        public static void main(String[] args) {
            Collections.sort(p, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getLastName().compareTo(o2.getLastName());

                }
            });

            //printAll(p);

            //providing inline implementation of interface Condition
            personConditionally(p, new Condition() {
                @Override
                public boolean Test(Person P) {
                    if
                        (P.getLastName().startsWith("l")) {

                    return true;
                    }
                    return false;
                }
            });
        }

    private static void personConditionally(List<Person> p, Condition condition) {
//print conditionally method just prints the method with condition returning true

            for(Person single : p){

                if(condition.Test(single)) {
                    System.out.println(single);

                }

        }
    }

    private static void printAll(List<Person> p) {

            for (Person single : p) {
                System.out.println(single);

            }
        }

        interface Condition{
            boolean Test(Person P);

        }


    }



