package Variable;

public class LocalVariable {

    public void calculate() {
        int height = 100;
        System.out.println("height " + height);
    }

    public static void main(String[] args) {
        LocalVariable a = new LocalVariable();
        a.calculate();
    }
}
