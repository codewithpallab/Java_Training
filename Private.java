//Private: The access level of a private modifier is only within the class.
//It cannot be accessed from outside the class.

package AccessModifier;

class A {
	int x=100;
}

public class Private {

	public static void main(String[] args) {
	       A obj =new A();
	       int output =obj.x;
	       System.out.println("output is :" + output);

	}

}
