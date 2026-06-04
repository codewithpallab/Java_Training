package Variable;

public class Instance_Variables_Case_Study_IV {

    int accountNumber;
    String accountHolderName;
    long balance;
    String branchName;

    public static void main(String[] args) {

        
        Instance_Variables_Case_Study_IV acc = new Instance_Variables_Case_Study_IV();

        
        acc.accountNumber = 11002233;
        acc.accountHolderName = "SitaRama";
        acc.balance = 12345678L;
        acc.branchName = "Coforge Ltd HDFC";

        // Print details
        System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Account Holder Name: " + acc.accountHolderName);
        System.out.println("Balance: " + acc.balance);
        System.out.println("Branch Name: " + acc.branchName);
    
}
}