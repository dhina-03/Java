public class BankAccount1 {
        private String holderName;
        private long accountNumber;
        private double balance;

        public BankAccount1(String holderName, long accountNumber, double balance) {
            this.holderName = holderName;
           this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public String getHolderName(){
            return holderName;
        }
        public long getAccountNumber() {
            return accountNumber;
        }
        public double getBalance() {
            return balance;
        }
        public static void main(String[] args) {
            BankAccount1 account1 = new BankAccount1("Dhina", 123455676, 8764.0);
            System.out.println("Holder Name: " + account1.getHolderName());
            System.out.println("Account Number: " + account1.getAccountNumber());
            System.out.println("Balance: $" + account1.getBalance());
        }
    }


