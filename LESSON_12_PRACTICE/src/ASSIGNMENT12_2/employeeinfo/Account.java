<<<<<<< HEAD:LESSON_12_PRACTICE/prog12-2_source/employeeinfo/Account.java
=======
package ASSIGNMENT12_2.employeeinfo;

>>>>>>> 0a788d90b611e14cce8ebb1107be0d01fba88a17:LESSON_12_PRACTICE/src/ASSIGNMENT12_2/employeeinfo/Account.java
abstract public class Account {
	private Employee emp;
	private double balance;

	Account(Employee e, double startBalance) {
		emp = e;
		balance = startBalance;

	}

	Account(Employee e) {
		this(e, 0.0);
	}

	abstract public AccountType getAcctType();

	void makeDeposit(double amount) {
		balance += amount;
	}

	void makeWithdrawal(double amount) throws OverdrawnAccountException {
		if (amount > balance) {
			if (getAcctType() == AccountType.RETIREMENT) {
				throw new OverdrawnAccountException(
						"After computing penalties, your withdrawal amount exceeds your balance. ");
			}
			throw new OverdrawnAccountException("Withdrawal amount exceeds balance");
		}
		balance -= amount;

		setBalance(getBalance() - amount);
	}

	double getBalance() {
		return balance;
	}

	/** used by subclasses only */
	void setBalance(double bal) {
		balance = bal;
	}

	public Employee getEmp() {
		return emp;
	}

	private String newline = System.getProperty("line.separator");

	public String toString() {
		String ret = "Account type: " + getAcctType().toString().toLowerCase() + newline +
				"Current bal:  " + balance;
		return ret;
	}

}
