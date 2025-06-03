package ASSIGNMENT5_3;

import java.util.Comparator;

public class MainLambda {
    public static void main(String[] args) {
        String[] strings = {"Amine", "Mohamed Amine", "Mohamed", "Atmani", "Amine Atmani"};

        StringSort sorter = new StringSort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        String[] sorted = sorter.stringSort(strings);

        for (String s : sorted) {
            System.out.println(s);
        }

    }
}
