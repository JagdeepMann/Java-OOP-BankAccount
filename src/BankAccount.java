import java.util.Random;
public class BankAccount {
	//member variables
	private String accountNum;
	private double checkingBal;
	private double savingsBal;
	//static member variables
	private static int numOfAccts = 0;
	private static double totalAmount = 0;



	private static String acctNumGenerator() {
		String str = "";
		
		Random r = new Random();
		for(int i = 0; i <10; i++) {
			str += r.nextInt(10);
		}
		return str;
	}
	

	public BankAccount() {
		this.accountNum = BankAccount.acctNumGenerator();
		this.checkingBal = 0.0;
		this.savingsBal = 0.0;
		numOfAccts++;
	}
	
	
	// get and set methods
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public static int getNumOfAccts() {
		return numOfAccts;
	}

	public static void setNumOfAccts(int numOfAccts) {
		BankAccount.numOfAccts = numOfAccts;
	}

	public static double getTotalAmount() {
		return totalAmount;
	}

	public static void setTotalAmount(double totalAmount) {
		BankAccount.totalAmount = totalAmount;
	}

	public double getCheckingBal() {
		return checkingBal;
	}
	public void setCheckingBal(double checkingBal) {
		this.checkingBal = checkingBal;
	}
	public double getSavingsBal() {
		return savingsBal;
	}
	public void setSavingsBal(double savingsBal) {
		this.savingsBal = savingsBal;
	}
	
	
	public void depositCheckingAcct(double amount) {
		this.setCheckingBal(amount);
		totalAmount+=amount;
	}
	
	public void depositSavingsAcct(double amount) {
		this.setSavingsBal(amount);
		totalAmount+=amount;
	}
	
	public void withdrawCheckingAcct(double amount) {
		if(amount>this.getCheckingBal()) {
			System.out.println("Not enough Balance in Checking account");
		}
		else {
			this.setCheckingBal(getCheckingBal()-amount);
			totalAmount-=amount;
		}
	}
	
	public void withdrawSavingsAcct(double amount) {
		if(amount>this.getSavingsBal()) {
			System.out.println("Not enough Balance in Savings account");
		}
		else {
			this.setSavingsBal(getSavingsBal()-amount);
			totalAmount-=amount;
		}
	}
	
	public double totalAmount() {
		totalAmount = savingsBal+checkingBal;
		System.out.println(totalAmount);
		return totalAmount;
	}
	
	
	
}