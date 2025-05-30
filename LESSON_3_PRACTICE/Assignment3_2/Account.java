package Assignment3_2;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;

	private double balance;
	private AccountType acctType;
	private Employee employee;

	// Constructor
	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type: " + acctType.toString().toLowerCase() + "\n" +
				"Current bal:  " + balance;
	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > balance) {
			return false;
		}
		balance -= amount;
		return true;
	}
}
