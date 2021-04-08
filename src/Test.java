
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		BankAccount ba2 = new BankAccount();
		
//		System.out.println(ba.getNumOfAccts());
		ba.depositCheckingAcct(5000);
		System.out.println("Checking acct balance is :" + ba.getCheckingBal());
		ba.withdrawCheckingAcct(2500);
		System.out.println("Checking acct balance is :" + ba.getCheckingBal());
		
		System.out.println("_______________________________");
		
		ba.depositSavingsAcct(3000);
		System.out.println("Checking acct balance is :" + ba.getSavingsBal());
		ba.withdrawSavingsAcct(1500);
		System.out.println("Checking acct balance is :" + ba.getSavingsBal());
		
		ba.totalAmount();
		
		ba.withdrawSavingsAcct(2500);

	}

}
