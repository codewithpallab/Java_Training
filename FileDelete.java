package FileHandling;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		
		  File myobj = new File("D:\\File_Handling\\Pallab8500.txt");
		  if(myobj.delete()){
			  System.out.println("Deleted the file "  + myobj.getName());
		  }
		  else {
			  System.out.println("There is no such file to delete");
		  }
		

	}

}
