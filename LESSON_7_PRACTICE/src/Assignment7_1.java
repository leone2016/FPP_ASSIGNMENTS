/**
 * Programming Assignment 7-1
 * For this exercise, you will write your own exponential function. Use the fact that for any
 * (real number) x and any natural number n > 0,
 *
 * x ^ n = x * x ^ (n-1)
 * to write a recursive function
 * double power(double x,int n)
 * that returns x^n and that uses only multiplication (and addition and subtraction if
 * necessary) for its computation. (For this exercise, do not use the Math function
 * pow(x,n).) Enclose the function in a class called Exponential.
 * Demonstrate that your method works by doing the following: In the main method, create
 * an instance of Exponential, and, from this instance, call power(2,10), and print the
 * result to the console
 */
public class Assignment7_1 {

    static class Exponential{

        private static int pow( int x, int n){
            if( n == 0 ) return 1;
            return x * pow(x , n-1);
        }
    }

    public static void main(String[] args) {

        System.out.println( ""+ Exponential.pow(2,10) );
    }
}
