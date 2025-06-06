public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.run();
    }

    public void run() {
        int loopcount = 0;
        double scalar = 0.1;
        double x = 0.9;
        double y = 0.7;

        while (x - scalar != y + scalar) {
            x *= scalar;
            y *= scalar;
            scalar *= scalar;
            ++loopcount;
        }

        System.out.println("Times through the loop: " + loopcount);
    }
}
