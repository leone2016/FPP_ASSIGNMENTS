package Assignment2_5;
import java.util.Scanner;
public class Prog5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write a word:");
        String word = sc.nextLine();
        sc.close();
        String reverseWord = "";
        // Using a for loop to reverse the word

        for(int i = word.length() - 1; i>=0; i-- ){
            reverseWord += word.charAt(i);
        }
        // Printing the reversed word
        System.out.println("The reversed word is: " + reverseWord);
    }
}
