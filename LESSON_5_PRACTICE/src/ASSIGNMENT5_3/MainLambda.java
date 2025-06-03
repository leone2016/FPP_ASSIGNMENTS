package ASSIGNMENT5_3;

public class MainLambda     {
    public static void main(String[] args) {
        String[] testStrings = {"apple", "dog", "banana", "cat", "a", "elephant"};

        StringSort sorter = new StringSort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        String[] sorted = sorter.stringSort(testStrings);

        System.out.println("Sorted by length (lambda):");
        for (String s : sorted) {
            System.out.println(s);
        }
    }
}
