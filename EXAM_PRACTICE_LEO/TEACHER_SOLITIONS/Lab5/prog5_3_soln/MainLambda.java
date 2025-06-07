package TEACHER_SOLITIONS.Lab5.prog5_3_soln;

import java.util.Arrays;

public class MainLambda {

	public static void main(String[] args) {
		StringSort ss 
		  = new StringSort((str1, str2) -> str1.length() - str2.length());

		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		ss.stringSort(testStrings);

		System.out.println(Arrays.asList(testStrings));
	}
}
