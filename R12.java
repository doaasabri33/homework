
package newpackage;
public class R12 {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

   
    public R12(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Payment amount must be positive!");
            return; 
        }
        balance -= amount;
        System.out.println("Payment of " + amount + " made. New balance: " + balance);
    }

    
    public double getBalance() {
        return balance;
    }

    
    public static void main(String[] args) {
        R12 card = new R12("John Doe", "ABC Bank", "1234 5678 9012", 5000, 100.0);
        System.out.println("Balance: " + card.getBalance());
        card.makePayment(50);  
        card.makePayment(-20); 
    
    //R13
    R12[] wallet = new R12[3];
    wallet[0] = new R12("John Bowman", "California Savings", "5391 0375 9387 5309", 2500, 0);
    wallet[1] = new R12("John Bowman", "California Federal", "3485 0399 3395 1954", 3500, 0);
    wallet[2] = new R12("John Bowman", "California Finance", "6011 4902 3294 2994", 5000, 0);

    for (int val = 1; val <= 16; val++) {
        wallet[0].makePayment(100);
        wallet[1].makePayment(200);
        wallet[2].makePayment(300);
    }
}



}
    