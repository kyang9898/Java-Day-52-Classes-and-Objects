public class BankAccount {
    private double bankAccountBalance;
    private String accountHolderName;

    public BankAccount(String customerName, double accountBalance) {
        this.accountHolderName = customerName;
        this.bankAccountBalance = accountBalance;
    }

    public double deposit (double depositMoney) {
        bankAccountBalance += depositMoney;
        return depositMoney;
    }

    public double withdrawl (double withdrawlMoney) {
        bankAccountBalance -= withdrawlMoney;
        return withdrawlMoney;
    }

    public String accountDetails() {
        return "Account name: " + accountHolderName + "Balance: " + bankAccountBalance;
    }

    public double transferFunds(double transferMoney) {
        return bankAccountBalance += transferMoney;
    }
    }
