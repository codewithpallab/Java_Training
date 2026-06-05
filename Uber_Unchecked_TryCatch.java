package ExceptionHandling;

public class Uber_Unchecked_TryCatch {

    public static void main(String[] args) {

        System.out.println("Ride started");

        try {
            int distance = 10;
            int time = 0;

            int fare = distance / time;   // error ❌
            System.out.println("Fare: " + fare);

        } catch (ArithmeticException e) {
            System.out.println("Error in fare calculation: " + e.getMessage());
        }

        System.out.println("Ride ended");
    }
}
