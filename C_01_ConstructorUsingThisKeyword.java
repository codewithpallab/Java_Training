package Constructor;

public class C_01_ConstructorUsingThisKeyword {
	
	public  C_01_ConstructorUsingThisKeyword() {
		this(10);
		System.out.println("The value in parameter");
	}
       
	public  C_01_ConstructorUsingThisKeyword(int count) {
		this("Pallab");
		System.out.println("int type constructor and count is :"  +count);
	}
	
	public  C_01_ConstructorUsingThisKeyword(String name) {
		System.out.println("String type constructor and name is : "  +name);
	}
	
	
	public static void main(String[] args) {
		
    C_01_ConstructorUsingThisKeyword a = new C_01_ConstructorUsingThisKeyword();
    a.display();
        
   }
	private void display() {
		
}
	}
