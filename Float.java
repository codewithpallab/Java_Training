package Scanner_Java;

import java.util.Scanner;

public class Float {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a float value:");
        float num = sc.nextFloat();

        System.out.println("You entered: " + num);

        sc.close();
    }
}

