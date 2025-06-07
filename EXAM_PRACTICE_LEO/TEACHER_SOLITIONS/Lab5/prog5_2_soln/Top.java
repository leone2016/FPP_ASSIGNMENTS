package TEACHER_SOLITIONS.Lab5.prog5_2_soln;


public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	public Top() {
		mid = new Middle();		
		midbot = mid.new Bottom();
	}	
	int readBottom() {
		return midbot.b;
	}		
	class Middle {
		int m = 2;
		int addTopAndBottom() {
			return t + midbot.b;
		}		
		class Bottom {
			 final int b = 3;
			 int multiplyAllThree() {
				return t * m * b;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();		
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.b);
		System.out.println(top.midbot.multiplyAllThree());
	}

}
/*
public class Main {

	public static void main(String[] args) {
		Top top = new Top();
		Top.Middle tm = top.new Middle();
		Top.Middle.Bottom tmb = tm.new Bottom();
		System.out.println(tmb.b);
		System.out.println(tmb.multiplyAllThree());

	}

}
*/
