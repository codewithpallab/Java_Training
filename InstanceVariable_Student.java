package Variable;

public class InstanceVariable_Student {
    
    public int rollnum;
    public int number;
    public String name;
    public int totalmarks;

    public static void main(String[] args) {

        InstanceVariable_Student a = new InstanceVariable_Student();

        a.rollnum = 2205912;
        a.name = "PALLAB";
        a.totalmarks = 100;
        a.number = 232234344;

        System.out.println(a.rollnum);
        System.out.println(a.name);
        System.out.println(a.totalmarks);
        System.out.println(a.number); 
    }
}

