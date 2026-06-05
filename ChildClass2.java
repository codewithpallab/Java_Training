package inheritance;

public class ChildClass2 extends BaseClass1 {

    public void addToCart() {
        System.out.println("Product added to cart");
    }

    public void makePayment() {
        System.out.println("Payment successful");
    }

    public static void main(String[] args) {

        
        ChildClass2 obj = new ChildClass2();

        obj.login();         
        obj.searchProduct();  
        obj.addToCart();      
        obj.makePayment();   

        System.out.println("-----------");

        
        BaseClass1 obj2 = new BaseClass1();
        obj2.login();
        obj2.searchProduct();
    }
}