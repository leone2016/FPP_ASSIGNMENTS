package LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo;

public class RetirementAccount extends LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Account {
	private final double PENALTY_PERCENT = 2.0;

	public RetirementAccount(LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Employee e, double startBalance){
		super(e,startBalance);
	}
	public RetirementAccount(LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Employee e){
		super(e);
	}	
	
	public boolean makeWithdrawal(double amount){
		double bal = getBalance();
		
		double penalty = bal * (PENALTY_PERCENT/100);
		bal = bal - amount - penalty;
		if(bal < 0){
			return false;
		}
		setBalance(bal);
		return true;
	}
	public LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.AccountType getAcctType(){
		return LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.AccountType.RETIREMENT;
	}	

}
