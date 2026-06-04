package Scanner_Java;

import java.util.Scanner;

public class Next {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your name:");

        String a = sc.next();  

        System.out.println("Your name is: " + a);

        sc.close();
    }
}





