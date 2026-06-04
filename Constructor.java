package Constructor;

public class Constructor {
	
	private String name;
	
	Constructor(){
		System.out.println("Constructor called .....");
		name ="Coforge Java Learning";
	}

	public static void main(String[] args) {
		
		Constructor a  = new Constructor();
		System.out.println(a.name);
		
		

	}

}
