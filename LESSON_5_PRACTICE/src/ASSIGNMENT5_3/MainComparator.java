package ASSIGNMENT5_3;

public class MainComparator {
    public static void main(String[] args) {
        String[] testStrings = {"apple", "dog", "banana", "cat", "a", "elephant"};

        StringSort sorter = new StringSort(new StringLengthComparator());
        String[] sorted = sorter.stringSort(testStrings);
        System.out.println("1. Sort array with Comparator");

        System.out.println("Sorted by length:");
        for (String s : sorted) {
            System.out.println(s);
        }
    }
}