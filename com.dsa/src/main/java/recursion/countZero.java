package recursion;
// this function will calculate the number of zeros
public class countZero {

    public static void main(String[] args) {
        System.out.println(count(205002));
    }

    static int count(int num){
//        if(num==0) return 1;
//        else
          return helper(num,0); //passing count as argument, this is recursion with preset argument

    }
        static int helper(int num,int count){
            if(num==0) return count;
            int rem = num%10;
            if(rem==0) return helper(num/10,++count);
            return helper(num/10,count);
    }
}
