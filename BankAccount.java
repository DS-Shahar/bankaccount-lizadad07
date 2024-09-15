
public class BankAccount {
	private int minBalance;
    private int balance;
    
    
    
    public BankAccount(int balance, int minBalance) {
        this.balance = balance;
        this.minBalance = minBalance;
    }
    
    public int getBalance() {
    	return this.balance;
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

}
