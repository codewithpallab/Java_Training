package AbstractClass;

public abstract class BankDepartment implements BankEmployee {

    public abstract void accountType();
    public abstract void interest();

    public void setup() {
        System.out.println("Setup: Core Banking Software Installed");
    }

    public void support() {
        System.out.println("Support: 24x7 Customer Support");
    }
}
