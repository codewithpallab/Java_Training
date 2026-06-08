package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample {

    public static void main(String[] args) {

        try {
            File myobj = new File("D:\\File_Handling\\Pallab85.txt");

            if (myobj.createNewFile()) {
                System.out.println("File created: " + myobj.getName());
                System.out.println("Absolute path: " + myobj.getAbsolutePath());
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
