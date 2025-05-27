package D1;

public class prog3 {
    public static void main(String[] args) {
        float x = 1.27f;
        float y = 3.881f;
        float z = 9.6f;
        float sum;
        sum = x + y + z;
        //#1
        System.out.println("S = " + sum);
        int s = (int) sum;
        System.out.println("Sum(Cast) = "+ s);
        //#2
        int rs = Math.round(sum);
        System.out.println("Sum(round) = " + rs);

    }
}
