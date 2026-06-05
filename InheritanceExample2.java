package Interface;


interface FoodApp {
    void placeOrder();
    void makePayment();
    void trackOrder();
}


class Zomato implements FoodApp {

    public void placeOrder() {
        System.out.println("Zomato: Order placed successfully");
    }

    public void makePayment() {
        System.out.println("Zomato: Payment done via UPI");
    }

    public void trackOrder() {
        System.out.println("Zomato: Your order is on the way");
    }
}


class Swiggy implements FoodApp {

    public void placeOrder() {
        System.out.println("Swiggy: Order placed successfully");
    }

    public void makePayment() {
        System.out.println("Swiggy: Payment done via Card");
    }

    public void trackOrder() {
        System.out.println("Swiggy: Delivery partner is near" );
    }
}


public class InheritanceExample2 {

    public static void main(String[] args) {

        FoodApp f;

        
        f = new Zomato();
        f.placeOrder();
        f.makePayment();
        f.trackOrder();

        System.out.println("---------------");

        
        f = new Swiggy();
        f.placeOrder();
        f.makePayment();
        f.trackOrder();
    }
}
