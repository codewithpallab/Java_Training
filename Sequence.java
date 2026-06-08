package list;
import java.util.ArrayList;
public class Sequence {

	public static void main(String[] args) {
		
		ArrayList<String>obj1=new ArrayList<String>();

        obj1.add("Selenium");
        obj1.add("Postman");
        obj1.add("JMeter");
        obj1.add("Appium");
        obj1.add("QTP");
        
        int ListSize = obj1.size();
        
        for(int i=0; i<ListSize; i++) {
        	System.out.println("Elements in ArrayList "  +obj1.get(i));
        }


	}

}
