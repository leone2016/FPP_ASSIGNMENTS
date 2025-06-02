package LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo;
import LESSON_4_PRACTICE.src.ASSIGNMENT4_7.MyStringList;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable<Employee>{ //implements Comparable<Employee> {
	private LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.AccountList accounts;
	private String name;
	private Date hireDate;
	
	public Employee(String name, int year, int month, int day){
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(year, month, day);
		hireDate = cal.getTime();
		accounts =  new LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.AccountList();
	}
	@Override
	public int compareTo(Employee e) {
		double thisBalance = this.accounts.getLargest().getBalance();
		double otherBalance = e.accounts.getLargest().getBalance();
		return Double.compare(thisBalance, otherBalance);
	}

	/** returns a list of account types in the order in which 
	 *  accounts are stored in the AccountList
	 */
	public MyStringList getNamesOfAccounts(){
		MyStringList names = new MyStringList();
		for(int i = 0; i < accounts.size(); ++i){
			names.add(accounts.get(i).getAcctType().toString().toLowerCase());
		}
		return names;
		
	}
	
	public void createNewSavings(double startBalance){
		accounts.add(new LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.SavingsAccount(this,startBalance));
	}
	public void createNewChecking(double startBalance){
		accounts.add(new LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.CheckingAccount(this,startBalance));
	}
	public void createNewRetirement(double startBalance){
		accounts.add(new LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.RetirementAccount(this,startBalance));

	}
	public void deposit(int acctIndex, double amt){
		LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Account selected = accounts.get(acctIndex);
		selected.makeDeposit(amt);
	}
	public boolean withdraw(int acctIndex, double amt){
		LESSON_4_PRACTICE.src.ASSIGNMENT4_7.employeeinfo.Account selected = accounts.get(acctIndex);
		return selected.makeWithdrawal(amt);
	}	
	

	public String getName() {
		return name;
	}
	public Date getHireDate(){
		Date returnVal = (Date)hireDate.clone();
		return returnVal;
	}
	private String n = System.getProperty("line.separator");
	
	@Override
	public String toString() {
		return name + " : " + accounts.getLargest().getBalance();
	}
	
}
