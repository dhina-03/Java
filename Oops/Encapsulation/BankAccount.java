public class BankAccount {
    private String holderName;
    private long accountNumber;
    private double balance;

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public String getHolderName(){
        return holderName;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount account1= new BankAccount();
        account1.setHolderName("Dhina");
        account1.setAccountNumber(123455676);
        account1.setBalance(8764.0);
        System.out.println("Holder Name: " + account1.getHolderName());
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: $" + account1.getBalance());
    }
}
