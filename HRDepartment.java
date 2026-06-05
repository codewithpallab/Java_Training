package AbstractClass;

public class HRDepartment extends ITDepartment {

    @Override
    public void dept() {
        System.out.println("Dept: Engineering, IT");
    }

    @Override
    public void salary() {
        System.out.println("Salary: This is the salary block");
    }

    public void bonus() {
        System.out.println("Bonus: This is the bonus block");
    }

    public static void main(String[] args) {

        
        HRDepartment obj = new HRDepartment();
        obj.dept();
        obj.salary();
        obj.setup();
        obj.support();
        obj.bonus();

        System.out.println("=========");

        
        ITDepartment obj1 = new HRDepartment();
        obj1.dept();
        obj1.salary();
        obj1.setup();
        obj1.support();
    }
}