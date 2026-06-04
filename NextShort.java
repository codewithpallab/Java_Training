package Scanner_Java;
import java.util.Scanner;

public class NextShort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value ");
		short num = sc.nextShort();
		System.out.println("ENTERED VALUE : "  +num );
       sc.close();
	}

}
