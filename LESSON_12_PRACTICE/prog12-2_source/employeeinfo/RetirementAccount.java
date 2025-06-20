public class RetirementAccount extends Account {
	private final double PENALTY_PERCENT = 2.0;

	RetirementAccount(Employee e, double startBalance) {
		super(e, startBalance);
	}

	RetirementAccount(Employee e) {
		super(e);
	}

	@Override
	public void makeWithdrawal(double amount) throws OverdrawnAccountException {
		double bal = getBalance();
		double penalty = bal * (PENALTY_PERCENT / 100);
		double newBalance = bal - amount - penalty;

		if (newBalance < 0) {
			throw new OverdrawnAccountException(
					"After computing penalties, your withdrawal amount exceeds your balance.");
		}
		setBalance(newBalance);
	}

	public AccountType getAcctType() {
		return AccountType.RETIREMENT;
	}

}
