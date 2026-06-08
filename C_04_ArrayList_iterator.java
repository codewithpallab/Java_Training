package list;
import java.util.ArrayList;
import java.util.Iterator;

public class C_04_ArrayList_iterator {

	public static void main(String[] args) {
	
		   ArrayList<String> obj1 = new ArrayList<String>();
		   obj1.add("Selenium");
	        obj1.add("Postman");
	        obj1.add("JMeter");
	        obj1.add("Appium");
	        obj1.add("QTP");
	        Iterator<String>itr =obj1.iterator();
	        while(itr.hasNext()) {
	        	String val=itr.next();
	        	System.out.println("Element is :"  + val );
	        }
	}

}
