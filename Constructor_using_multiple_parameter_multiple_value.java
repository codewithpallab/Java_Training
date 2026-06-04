package Constructor;

public class Constructor_using_multiple_parameter_multiple_value {
	
	public Constructor_using_multiple_parameter_multiple_value() {
		System.out.println("Started Constructor");
	}
	public Constructor_using_multiple_parameter_multiple_value(int i ) {
		System.out.println(i);
	}
	
	public Constructor_using_multiple_parameter_multiple_value(String name ) {
		System.out.println(name);
	}
	
	public Constructor_using_multiple_parameter_multiple_value(String n , double m , int j , float q ) {
		System.out.println(n+" "+m+" "+j+" "+q+" ");
	}
	
	public void display() {
		System.out.println("Working in file");
	}
	
	public void finish () {
		System.out.println("Finished work");
	}

	public static void main(String[] args) {
		
		
		Constructor_using_multiple_parameter_multiple_value a = new Constructor_using_multiple_parameter_multiple_value(10);
		a.display();
		Constructor_using_multiple_parameter_multiple_value b = new Constructor_using_multiple_parameter_multiple_value("pallab");
		b.display();
		Constructor_using_multiple_parameter_multiple_value l = new Constructor_using_multiple_parameter_multiple_value("hjhjhjh",1.8,67,2.7f);
		l.display();
		Constructor_using_multiple_parameter_multiple_value c = new Constructor_using_multiple_parameter_multiple_value();
		c.finish();
		

	}

}

