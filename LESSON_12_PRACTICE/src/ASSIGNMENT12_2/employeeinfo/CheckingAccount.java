<<<<<<< HEAD:LESSON_12_PRACTICE/prog12-2_source/employeeinfo/CheckingAccount.java
=======
package ASSIGNMENT12_2.employeeinfo;

>>>>>>> 0a788d90b611e14cce8ebb1107be0d01fba88a17:LESSON_12_PRACTICE/src/ASSIGNMENT12_2/employeeinfo/CheckingAccount.java
public class CheckingAccount extends Account {
	private final double MONTHLY_SERVICE_CHARGE = 5.00;

	CheckingAccount(Employee e,  double startBalance){
		super(e,startBalance);
	}
	CheckingAccount(Employee e){
		super(e);
	}
	
	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance - MONTHLY_SERVICE_CHARGE;
	}
	public AccountType getAcctType(){
		return AccountType.CHECKING;
	}

}
