package ASSIGNMENT5_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Amine", "Mohamed Amine", "Mohamed", "Atmani", "Amine Atmani"};

        StringSort stringSort = new StringSort(new StringLengthComparator());
        String[] Sorted = stringSort.stringSort(strings);


        System.out.println(Arrays.toString(Sorted));


        for (String s : Sorted) {
            System.out.print(s);
        }
    }
}