package Assignment3_1;

import Assignment3_1.Employee;

class Account {
	public final static String CHECKING = AccountType.CHECKING.toString();
	public final static String SAVINGS = AccountType.SAVINGS.toString();;
	public final static String RETIREMENT = AccountType.RETIREMENT.toString();;
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance){
		employee = emp;
		this.acctType =acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
	}
	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	//updates the balance field
	public void makeDeposit(double deposit) {
		if (deposit < 0) {
			throw new IllegalArgumentException("Deposit amount must be non-negative");
		}
		balance += deposit; // update balance
		System.out.println("Deposit successful. New balance: " + balance);
	}

	/**
	 * updates the balance field and returns true, unless
	 * withdrawal amount is too large; in that case,
	 * it does not modify the balance field, and returns false
	 * @param amount
	 * @return
	 */
	public boolean makeWithdrawal(double amount) {
		if (amount > balance) {
			return false; // withdrawal amount too large
		} else {
			balance -= amount; // update balance
			return true; // successful withdrawal
		}
	}

	public String getAcctType() {
		return acctType.toString();
	}
	public double getBalance() {
		return balance;
	}
}
