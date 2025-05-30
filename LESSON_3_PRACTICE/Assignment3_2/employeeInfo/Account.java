package Assignment3_2.employeeInfo;

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
		if (deposit < 0) {
			throw new IllegalArgumentException("Deposit amount must be non-negative");
		}
		balance += deposit; // update balance
		System.out.println("Deposit successful. New balance: " + balance);
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > balance) {
			return false; // withdrawal amount too large
		} else {
			balance -= amount; // update balance
			return true; // successful withdrawal
		}
	}
	public double getBalance() {
		return balance;
	}
}
