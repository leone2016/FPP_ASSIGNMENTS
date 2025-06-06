package QUIZZ1.q5;

public class MyClass {
    public static void main(String[] args) {
        new MyClass();
    }
    private int value = 3;
    MyClass() {
        MyInnerClass c = new MyInnerClass();
        System.out.println(c.compute());
    }
    class MyInnerClass {
        private int compute() {
            return value;
        }
    }
}
