//package Assignment3_2.employeeInfo;
//
//import Assignment3_1.Util;
//
//import java.time.LocalDate;
//
//public class Employee {
//	// instance fields
//	private Account savingsAcct;
//	private Account checkingAcct;
//	private Account retirementAcct;
//	private String name;
//	private LocalDate hireDay;
//	private String format = "name = %s, salary = %.2f, hireDay = %s";
//	// constructor
//    public Employee(String name, int aYear, int aMonth, int aDay) {
//		this.name = name;
//		hireDay = LocalDate.of(aYear, aMonth, aDay);
//	}
//	// instance methods
//	public String getName() {
//		return name;
//	}
//	public LocalDate getHireDay() {
//		return hireDay;
//	}
//	public void createNewChecking(double startAmount) {
//		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
//
//	}
//	public void createNewSavings(double startAmount) {
//		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
//
//	}
//	public void createNewRetirement(double startAmount) {
//		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
//	}
//	public void deposit(AccountType acctType, double amt){
//		switch (acctType) {
//			case CHECKING -> {
//				if (checkingAcct == null) {
//					throw new IllegalArgumentException("Checking account does not exist.");
//				} else {
//					checkingAcct.makeDeposit(amt);
//				}
//			}
//			case SAVINGS -> {
//				if (savingsAcct == null) {
//					throw new IllegalArgumentException("Savings account does not exist.");
//				} else {
//					savingsAcct.makeDeposit(amt);
//				}
//			}
//			case RETIREMENT -> {
//				if (retirementAcct == null) {
//					throw new IllegalArgumentException("Retirement account does not exist.");
//				} else {
//					retirementAcct.makeDeposit(amt);
//				}
//			}
//			default -> throw new IllegalArgumentException("Invalid account type.");
//		}
//	}
//
//	public boolean withdraw(AccountType acctType, double amt){
//		switch (acctType) {
//			case CHECKING -> {
//				if (checkingAcct == null)
//					throw new IllegalArgumentException("Checking account does not exist.");
//				 else
//					return checkingAcct.makeWithdrawal(amt);
//
//			}
//			case SAVINGS -> {
//				if (savingsAcct == null)
//					throw new IllegalArgumentException("Savings account does not exist.");
//				 else
//					return savingsAcct.makeWithdrawal(amt);
//
//			}
//			case RETIREMENT -> {
//				if (retirementAcct == null)
//					throw new IllegalArgumentException("Retirement account does not exist.");
//				 else
//					return retirementAcct.makeWithdrawal(amt);
//
//			}
//			default -> throw new IllegalArgumentException("Invalid account type.");
//		}
//	}
//
//	public String getFormattedAcctInfo() {
//		StringBuilder sb = new StringBuilder();
//		sb.append(String.format("\n\nACCOUNT INFO FOR %s:\n", name));
//		if (checkingAcct != null) {
//			sb.append(String.format("Account type: %s\nCurrent bal: %.2f\n", "checking", checkingAcct.getBalance()));
//		}
//		if (savingsAcct != null) {
//			sb.append(String.format("Account type: %s\nCurrent bal: %.2f\n", "savings", savingsAcct.getBalance()));
//		}
//		if (retirementAcct != null) {
//			sb.append(String.format("Account type: %s\nCurrent bal: %.2f\n", "retirement", retirementAcct.getBalance()));
//		}
//		return sb.toString();
//	}
//
//	public String toString() {
//		return String.format(format, name, Util.dateAsString(hireDay));
//	}
//}