package BankAccount;

class Employee {

    int empId;
    String empName;
    double salary;

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        
        Employee emp = new Employee();

        
        emp.empId = 85009999;
        emp.empName = "Pallab";
        emp.salary = 20000;

       
        emp.displayDetails();
    }
}

