package ExceptionHandling;

public class C_03_UnCheckedException_TryCatch {
         
	public static void main(String[] args) {
		
         System.out.println("Program started");
         try {
        	 int x=10/0;
        	 System.out.println("Division result is : ");
         }
         catch(ArithmeticException e) {
        	 System.out.println("Something went wrong. Please Check the exception."  + e.getMessage());
         }
         System.out.println("Program End");
	}

}
