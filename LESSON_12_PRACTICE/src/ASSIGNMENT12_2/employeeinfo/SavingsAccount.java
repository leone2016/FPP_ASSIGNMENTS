<<<<<<< HEAD:LESSON_12_PRACTICE/prog12-2_source/employeeinfo/SavingsAccount.java
=======
package ASSIGNMENT12_2.employeeinfo;

>>>>>>> 0a788d90b611e14cce8ebb1107be0d01fba88a17:LESSON_12_PRACTICE/src/ASSIGNMENT12_2/employeeinfo/SavingsAccount.java
public class SavingsAccount extends Account {
	private final double MONTHLY_INTEREST_RATE = 0.25;
	SavingsAccount(Employee e, double startBalance){
		super(e,startBalance);
	}
	SavingsAccount(Employee e){
		super(e);
	}
	
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (MONTHLY_INTEREST_RATE/100)*baseBalance;
		return baseBalance + interest;
	}
	public AccountType getAcctType(){
		return AccountType.SAVINGS;
	}

}
