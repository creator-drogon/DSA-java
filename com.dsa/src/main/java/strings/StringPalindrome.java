package strings;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(check("abba",0,3));

    }




    static Boolean check(String s, int low, int high){
        if(low>=high) return true;

        if(s.charAt(low)!=s.charAt(high)) return false;
        return check(s,low+1,high-1);


    }
}
