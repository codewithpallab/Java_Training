package Scanner_Java;

import java.util.Scanner;

public class Double {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        double num = sc.nextDouble();

        System.out.println("You entered: " + num);

        sc.close();
    
}
}
