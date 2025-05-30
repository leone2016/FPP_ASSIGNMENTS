package Assignment3_2.employeeInfo;

class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	public Account(AccountType accountType, double startAmount) {
		this.acctType = accountType;
		this.balance = startAmount;
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
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
