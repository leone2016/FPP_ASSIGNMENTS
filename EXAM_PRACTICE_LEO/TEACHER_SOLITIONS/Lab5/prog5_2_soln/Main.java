package TEACHER_SOLITIONS.Lab5.prog5_2_soln;

public class Main {

	public static void main(String[] args) {
		Top top = new Top();
		Top.Middle tm = top.new Middle();
		Top.Middle.Bottom tmb = tm.new Bottom();
		System.out.println(tmb.	b);
		System.out.println(top.readBottom());
		System.out.println(tmb.multiplyAllThree());

	}

}
