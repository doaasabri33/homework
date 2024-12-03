
package newpackage;

public class R11 {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    
    public R11(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

  
    public int getLimit() {
        return limit;
    }

  
    public void updateLimit(int newLimit) {
        if (newLimit > 0) {
            this.limit = newLimit;
            System.out.println("Credit limit updated to: " + newLimit);
        } else {
            System.out.println("Invalid credit limit!");
        }
    }

   
    public static void main(String[] args) {
        R11 card = new R11("John Doe", "ABC Bank", "1234 5678 9012", 5000, 100.0);
        System.out.println("Original Limit: " + card.getLimit());
        card.updateLimit(10000); // Update limit
        System.out.println("New Limit: " + card.getLimit());
    }
}
