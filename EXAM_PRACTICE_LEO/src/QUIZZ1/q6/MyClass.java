package QUIZZ1.q6;

/**
 * ERROR: The field value is not visible to MyNestedClass.
 * The field value is private in MyClass, so it cannot be accessed from the static nested class MyNestedClass.
 * To fix this, you can either:
 * 1. Change the visibility of the field value to protected or public.
 * 2. Provide a public method in MyClass that returns the value of the field.
 * 3. Make MyNestedClass a non-static nested class (inner class), which would allow it to access the instance fields of MyClass.
 *
 * This code is commented out to avoid compilation errors.
 */
public class MyClass {
 /*   public static void main(String[] args) {
        new MyClass();
    }
    private int value = 3;
    MyClass() {
        MyNestedClass c = new MyNestedClass();
        System.out.println(c.compute());
    }
    static class MyNestedClass {
        private int compute() {
            return value;
        }
    }*/
}
