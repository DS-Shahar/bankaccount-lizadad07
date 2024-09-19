
public class BankAccount {
	private int minBalance;
    private int balance;
    private String owner; 
    
    
    
    public BankAccount(int balance, int minBalance, String owner) {
        this.balance = balance;
        this.minBalance = minBalance;
        this.owner = owner;
    }
    
    public int getBalance() {
    	return this.balance;
    }
    public int getMinBalance() {
    	return this.minBalance;
    }
    public String getOwner() {
    	return this.owner;
    }

	public boolean withdraw(int amount) {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
    }
	public boolean deposit(int amount) {
		if (amount > 0) {
        balance = balance + amount;
        return true;
		}
		return false;
    }
	public boolean transfer(BankAccount target, int amount) {
        if (withdraw(amount) == false)
            return false;
        target.deposit(amount);
	  return true;
    }
	public String toString() {
        return "Balance of " + owner + ": " + this.balance + " minBalance: " + this.minBalance ;
    }


}
