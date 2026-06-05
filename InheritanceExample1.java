package Interface;


// First Interface
interface FirstInterface {
    public void mymethod();
}

// Second Interface
interface SecondInterface {
    public void myothermethod();
}

// Implementing class
class DemoClass implements FirstInterface, SecondInterface {

    public void mymethod() {
        System.out.println("Enter some text");
    }

    public void myothermethod() {
        System.out.println("Enter some other text");
    }
}


public class InheritanceExample1 {
    public static void main(String[] args) {

        DemoClass a = new DemoClass();
        a.mymethod();
        a.myothermethod();
    }
}
