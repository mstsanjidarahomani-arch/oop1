
package Encapsulation2;


public class Main {
 
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();

        account.setAccountNumber("02724205101115");
        account.setBalance(2000000.0);

        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();
   
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

    
