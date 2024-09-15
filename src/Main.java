
public class Main {
	public static void main(String[] args) {
        BankAccount acctLisa = new BankAccount(1000, -1000);
        BankAccount acctBob = new BankAccount(1000, -1000);
        
        System.out.println("Balance Lisa=" + acctLisa.getBalance());
        System.out.println("Balance Bob=" + acctBob.getBalance());
        acctLisa.transfer(acctBob, 500); // Lisa transfered to Bob 500
        System.out.println("Balance Bob after the first transfer =" + acctBob.getBalance());
        System.out.println("Balance Lisa after the first transfer=" + acctLisa.getBalance());
        acctBob.transfer(acctLisa,1600); // Bob transfered to Lisa 1600
        System.out.println("Balance Lisa after the second transfer=" + acctLisa.getBalance());
        System.out.println("Balance Bob after the second transfer=" + acctBob.getBalance());
        
    }
}
