package ExceptionHandling;

public class Uber_Checked_TryCatch {

    public static void main(String[] args) {

        System.out.println("Booking ride...");

        try {
            Thread.sleep(2000);  
        } catch (InterruptedException e) {
            System.out.println("Error while booking ride");
        }

        System.out.println("Driver assigned successfully!");
    }
}

