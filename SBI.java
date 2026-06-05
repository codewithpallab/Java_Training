package AbstractClass;

public class SBI extends BankDepartment {

    @Override
    public void accountType() {
        System.out.println("Account Type: Savings and Current");
    }

    @Override
    public void interest() {
        System.out.println("Interest Rate: 6%");
    }

    public void loan() {
        System.out.println("Loan Facility Available");
    }

    public static void main(String[] args) {


        SBI obj = new SBI();
        obj.accountType();
        obj.interest();
        obj.setup();
        obj.support();
        obj.loan();

        System.out.println("==========");

       
        BankDepartment obj1 = new SBI();
        obj1.accountType();
        obj1.interest();
        obj1.setup();
        obj1.support();
    }
}
