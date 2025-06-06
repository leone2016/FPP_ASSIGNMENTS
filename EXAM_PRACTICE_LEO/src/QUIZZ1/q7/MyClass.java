package QUIZZ1.q7;

/**
 *
 */
public class MyClass {
    public static void main(String[] args) {
        MyClass cl = new MySubClass();
        System.out.println(cl.compute());
    }
    private int value = 3;
    public int compute() {
        return value;
    }
}

/**
 * This subclass attempts to access the private field value from MyClass.
 * It will not compile because MyInnerClass is a static nested class,
 * and static nested classes do not have access to instance fields of the enclosing class.
 * To fix this, you can either:
 * 1. Change the visibility of the field value to protected or public.
 * 2. Provide a public method in MyClass that returns the value of the field.
 * 3. Make MyInnerClass a non-static nested class (inner class), which would allow it to access the instance fields of MyClass.
 *
 *
 * * This code is commented out to avoid compilation errors.
 */
class MySubClass extends MyClass {
   /* MySubClass() {}
    public int compute() {
        return (new MyInnerClass()).compute();
    }
    class MyInnerClass {
        private int compute() {
            return value*value; // Error: The field value is not visible to MyInnerClass.
        }
    }*/
}
