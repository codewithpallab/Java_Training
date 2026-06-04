package Constructor;

public class Parametrized_Constructor {
	

	    String languages;
		
		Parametrized_Constructor(String lang){
		languages = lang;
			System.out.println(languages +    " Programming languages");
		}

	public static void main(String[] args) {
	     Parametrized_Constructor a = new Parametrized_Constructor("Java");
         Parametrized_Constructor b = new Parametrized_Constructor("Javascript");
         Parametrized_Constructor c = new Parametrized_Constructor("CPP");
	}

}
