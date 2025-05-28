package Assignment2_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog6 {
    public static String[] removeDups(String[] array){
        List<String> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!result.contains(array[i])) {
                result.add(array[i]);
            }
        }

        return result.toArray(new String[0]);

    }

    public static void main(String[] args) {
        String[] animals= new String[]{"horse", "dog", "cat", "horse","dog"};
        String[] newAnimals = removeDups(animals);

        System.out.println(Arrays.toString(newAnimals));
    }
}
