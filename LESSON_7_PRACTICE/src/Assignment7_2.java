import java.util.Arrays;

/**
 Programming Assignment 7-4
 Write a recursive solution for reversing the given n elements of an array. Do not use auxiliary
 array to store the results. Work only with the given array to reverse. Think about the method
 signature and the arguments. If you want, you can have public utility method with and private
 recursive method. Inputs are not necessarily in sorted order.
 Before Reverse: [1, 3, 5, 7, 9, 13]

 After Reverse: [13, 9, 7, 5, 3, 1]
 */
public class Assignment7_2 {

    static class Reverse{

        private static int[] data( int[] x, int index){
            if( index == 0 ){
                return x;
            }
            int right = index-1;
            int left = (x.length-1) - (index-1);
            if(left > right) {
                return x;
            }
            int temp = x[left];
            x[left]  = x[right];
            x[right]  = temp;
            int test = "test".compareTo("tes");
            return data(x, index -1);
        }
    }

    public static void main(String[] args) {
        int res[] = Reverse.data(new int[]{1, 3, 5, 7, 9, 13}, 6);
        System.out.println( ""+ Arrays.toString(res));
    }
}
