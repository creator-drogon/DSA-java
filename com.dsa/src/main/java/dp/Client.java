package dp;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------- Please enter the Test Details -----");
        String test = sc.nextLine();
        LabType labType = LabType.valueOf(test);


        Factory.getPhone(labType);

    }



}
