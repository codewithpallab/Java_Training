package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {

	public static void main(String[] args) {
		
		try {
			FileWriter myWriter= new FileWriter("D:\\File_Handling\\Pallab85.txt");
			myWriter.write("Trainer is friendly!Super Happy but no learning! Enjoy.Project Selection? hello hello ");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
			
		} catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		

	}

}
