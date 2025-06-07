package TEACHER_SOLITIONS.Lab5.prog5_1_soln;

public enum SingletonAsEnum {
	INSTANCE;
	public void printHello() {
		System.out.println("Hello");
	}
}

//See how it works
class TestSingleton {
	public static void main(String[] args) {
		SingletonAsEnum instance = SingletonAsEnum.INSTANCE;
		instance.printHello();
	}
}
