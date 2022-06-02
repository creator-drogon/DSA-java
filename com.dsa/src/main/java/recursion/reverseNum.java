package recursion;

public class reverseNum {

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    static int reverse(int num){
        int digits  = (int)(Math.log10(num) +1);
        return helper(num,digits);
    }

    private static int helper(int num, int digits) {
        if(num%10==num) return num;
        else {

            int rem = num%10;
            return (int) (rem*Math.pow(10,digits-1) + helper(num/10,digits-1));
        }

    }
}
