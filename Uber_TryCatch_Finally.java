package ExceptionHandling;

public class Uber_TryCatch_Finally {

    public static void main(String[] args) {

        try {
            int amount = 500;
            int wallet = 0;

            int result = amount / wallet;  
            System.out.println("Payment successful: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }

        finally {
            System.out.println("Transaction process completed");
        }
    }
}
