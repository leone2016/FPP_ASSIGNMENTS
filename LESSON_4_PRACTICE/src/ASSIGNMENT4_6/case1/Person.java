package ASSIGNMENT4_6.case1;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		GregorianCalendar dob = new GregorianCalendar(1990, 1, 1);
		Person p1 = new Person("Alice", dob);
		PersonWithJob pwj1 = new PersonWithJob("Alice", dob, 50000);
		PersonWithJob pwj2 = new PersonWithJob("Alice", dob, 70000);

		System.out.println("Case1: p1.equals(pwj1): " + p1.equals(pwj1)); // true
		System.out.println("Case1: pwj1.equals(p1): " + pwj1.equals(p1)); // true
		System.out.println("Case1: pwj1.equals(pwj2): " + pwj1.equals(pwj2)); // true
	}

}
