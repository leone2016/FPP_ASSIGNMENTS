import java.util.Arrays;

/**
 Programming Assignment 7-2
 Here you will implement a recursive sorting routine, applied to the characters within an
 input String. Name your class MinSort and your sorting method sort.
 The recursive strategy for MinSort is: Given an input String s consisting only of
 characters a-z do the following:
 1. Find the position minpos of the alphabetically least character in s
 2. Swap the character in position 0 with the character ch in position minpos
 3. Remove character ch from the string, store it, and call the remaining String t
 4. Sort t and place in storage to the right of the character ch
 5. Return the stored String.
 For step 1 -- to find the position of a smallest character in the String – modify the code
 given in Lesson 8 (slide 13).
 Test your code in a main method using the input String
 s = “zwxuabfkafutbbbb”
 with these lines of code:
 MinSort ms = new MinSort();
 String result = ms.sort("zwxuabfkafutbbbb");
 System.out.println(result);
 */
public class Assignment7_2 {

    public String sort(String s) {
        if (s.isEmpty()) {
            return "";
        }
        int minPos = minpos(s, 0, s.length() - 1);
        char minChar = s.charAt(minPos);
        String remaining = s.substring(0, minPos) + s.substring(minPos + 1);
        return minChar + sort(remaining);
    }

    private int minpos(String s, int bottom, int top) {
        if (bottom == top) {
            return bottom; // Base case: only one character
        }
        int minIndex = bottom;
        for (int i = bottom + 1; i <= top; i++) {
            if (s.charAt(i) < s.charAt(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Assignment7_2 ms = new Assignment7_2();
        String result = ms.sort("zwxuabfkafutbbbb");
        System.out.println(result);
    }
}
