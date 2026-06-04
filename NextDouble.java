package Scanner_Java;
import java.util.Scanner;
public class NextDouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value ");
		double num = sc.nextDouble();
		System.out.println("You entered: " + num);

        sc.close();

	}

}
