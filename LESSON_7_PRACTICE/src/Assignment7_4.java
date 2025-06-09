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
public class Assignment7_4 {

    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case: if the start index is greater than or equal to the end index, return
        }
        // Swap the elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call with updated indices
        reverseArray(arr, start + 1, end - 1);
    }

    /**
     * Main method to test the reverseArray function.
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 13};
        System.out.println("Before Reverse: " + Arrays.toString(arr));
        reverseArray(arr, 0, arr.length - 1);
        System.out.println("After Reverse: " + Arrays.toString(arr));
    }
}
/**
 * first approach, but it is better with two indices
 *
 *     static class Reverse{
 *
 *         private static int[] data( int[] x, int index){
 *             if( index == 0 ){
 *                 return x;
 *             }
 *             int right = index-1;
 *             int left = (x.length-1) - (index-1);
 *             if(left > right) {
 *                 return x;
 *             }
 *             int temp = x[left];
 *             x[left]  = x[right];
 *             x[right]  = temp;
 *             int test = "test".compareTo("tes");
 *             return data(x, index -1);
 *         }
 *     }
 */