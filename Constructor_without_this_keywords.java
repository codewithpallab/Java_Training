package Constructor;

public class Constructor_without_this_keywords {
	
	public Constructor_without_this_keywords() {
		System.out.println("Started Constructor");
	}
	public Constructor_without_this_keywords(int i ) {
		System.out.println(i);
	}
	
	public Constructor_without_this_keywords(String name ) {
		System.out.println(name);
	}
	
	public void display() {
		System.out.println("Working in file");
	}
	
	public void finish () {
		System.out.println("Finished work");
	}

	public static void main(String[] args) {
		
		
		Constructor_without_this_keywords a = new Constructor_without_this_keywords();
		a.display();
		Constructor_without_this_keywords b = new Constructor_without_this_keywords();
		b.display();
		Constructor_without_this_keywords c = new Constructor_without_this_keywords();
		c.finish();
		

	}

}
