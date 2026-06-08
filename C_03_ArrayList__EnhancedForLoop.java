package list;

import java.util.ArrayList;

public class C_03_ArrayList__EnhancedForLoop {

    public static void main(String[] args) {

        ArrayList<String> obj1 = new ArrayList<String>();

        obj1.add("Selenium");
        obj1.add("Postman");
        obj1.add("JMeter");
        obj1.add("Appium");
        obj1.add("QTP");

        for (String v : obj1) {
            System.out.println("Element is : " + v);
        }
    }
}