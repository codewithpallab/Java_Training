package Scanner_Java;
import java.util.Scanner;

public class Short {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value" );
		short num = sc.nextShort();
		
		System.out.println("Entered value  : " +num);
		
     sc.close();
	}

}
