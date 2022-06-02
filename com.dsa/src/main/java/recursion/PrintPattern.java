package recursion;

public class PrintPattern {


    public static void main(String[] args) {
        Triangle(4,0);
    }

    public static void Triangle(int row,int col){
        if(row ==0){
            return;
        }
        if(row>col){
            System.out.print("*");
            Triangle(row,col+1);
        }
        else{
            System.out.println();
            Triangle(row-1,0);
        }

    }
}
