public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Keng", 500);
        bankAccount.deposit(100);
        System.out.println(bankAccount.accountDetails());
        
        BankAccount bankAccount1 = new BankAccount("Lue", 5000);
        BankAccount bankAccount2 = new BankAccount("LP", 300);
        bankAccount1.withdrawl(100);
        bankAccount2.deposit(100);
        System.out.println(bankAccount1.accountDetails());
        System.out.println(bankAccount2.accountDetails());
    }
}
