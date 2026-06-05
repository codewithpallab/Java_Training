package AbstractClass;

public abstract class ITDepartment implements C_01_Employee {

    public abstract void dept();
    public abstract void salary();

    public void setup() {
        System.out.println("Setup: Dell Desktop and Additional Monitor");
    }

    public void support() {
        System.out.println("Support: Reliance");
    }
}
