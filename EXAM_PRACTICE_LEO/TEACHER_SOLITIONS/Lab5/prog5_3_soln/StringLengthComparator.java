package TEACHER_SOLITIONS.Lab5.prog5_3_soln;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>{

    boolean ascending;
    
	StringLengthComparator(boolean ascending) {
		this.ascending = ascending;
	}
	@Override
	public int compare(String o1, String o2) {
//		if(o1.length() < o2.length()) return -1;
//		else if(o1.length() > o2.length()) return 1;
//		else return 0;
		//easier way:
		return ascending ? (o1.length() - o2.length())   :
			(o2.length() - o1.length());
	}
}
