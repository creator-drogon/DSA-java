import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Array {

    public static void main(String[] args) {
        int[][] arr =   {{1,2,3},//6
                        {4,5,6,7},//22
                        {1,2,13}};//16

        int[] arr2 = {2,3,4,5,6,7,8,9,44,33,77,99,101};

        PriorityQueue<Integer> p = new PriorityQueue<>(Integer::compareTo);
        p.add(4);
        p.add(5);
        p.add(2);
        p.add(32);
        p.comparator();
        p.forEach(System.out::println);

//        System.out.println(search(arr,56));
//        System.out.println(maximumWealth(arr));
        BinarySearch bs  = new BinarySearch();
       // System.out.println(bs.search(arr2,4));

        int[] nums = {3,40,5,6,7};
        int a = nums[1];
        String s = String.valueOf(a);
      //  System.out.println(s.length());

    }

    static boolean search(int[][] arr, int target){

        for(int i =0;i< arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){

                if(arr[i][j] == target) return true;
            }
        }

        return false;
    }


        public static int maximumWealth(int[][] accounts) {

            int max = Integer.MIN_VALUE;
            for(int row =0; row<accounts.length;row++){
                int sum = 0;
                for(int column =0; column< accounts[row].length;column++){

                    sum = sum + accounts[row][column];

                }if(sum > max) max = sum;
            }

            return max;

        }
    }
