package ASSIGNMENT5_3;

import java.util.Comparator;

public class MainAnonymous {
    public static void main(String[] args) {
        String[] strings = {"Amine", "Mohamed Amine", "Mohamed", "Atmani", "Amine Atmani"};

        StringSort sorter = new StringSort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        String[] sorted = sorter.stringSort(strings);

        for (String s : sorted) {
            System.out.println(s);
        }

    }
}
