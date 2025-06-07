package TEACHER_SOLITIONS.Lab5.prog5_1_soln;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 10; ++i) {
			SingleThreadedSingleton.getInstance();
		}
		System.out.println(SingleThreadedSingleton.count);
	}

}
