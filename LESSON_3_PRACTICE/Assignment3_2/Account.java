package Assignment3_2;

class Account {
	public final static String CHECKING = AccountType.CHECKING.toString();
	public final static String SAVINGS = AccountType.SAVINGS.toString();;
	public final static String RETIREMENT = AccountType.RETIREMENT.toString();;
	private final static double DEFAULT_BALANCE = 0.0;

	private double balance;
	private String acctType;
	private Employee employee;

	Account(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		balance -= amount;
		return false;
	}
}
