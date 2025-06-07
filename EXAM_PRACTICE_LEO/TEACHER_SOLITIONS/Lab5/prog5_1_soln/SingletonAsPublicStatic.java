package TEACHER_SOLITIONS.Lab5.prog5_1_soln;

public class SingletonAsPublicStatic {
	public static final SingletonAsPublicStatic INSTANCE 
		= new SingletonAsPublicStatic();
	
	private SingletonAsPublicStatic() {}
	
	public static void main(String[] args) {
		SingletonAsPublicStatic singleton =
			SingletonAsPublicStatic.INSTANCE;
	}
}
