package D1;

import Assignment2_2.RandomNumbers;

public class prog7 {
    public static void main(String[] args) {
        int[] t = new int[8];
        int[] b = new int[8];

        for(int i=0; i<8; i++){
            t[i] = RandomNumbers.getRandomInt(1,99);
            b[i] = RandomNumbers.getRandomInt(1,99);
        }
        for(int i=0; i<4; i++){
            System.out.printf(" %10d", t[i]);
        }
        System.out.println();
        for(int i=0; i<4; i++){
            System.out.printf(" %7s %2d", "+", b[i]);
        }
        System.out.println();
        for(int i=0; i<4; i++){
            System.out.printf("%11s", " ____");
        }
        System.out.println("\n");

        for(int i=4; i<8; i++){
            System.out.printf(" %10d", t[i]);
        }
        System.out.println();
        for(int i=4; i<8; i++){
            System.out.printf(" %7s %2d", "+", b[i]);
        }
        System.out.println();
        for(int i=0; i<4; i++){
            System.out.printf("%11s", " ____");
        }
        System.out.println();


    }
}
