package QUIZZ1.q2;

public class MyClass extends MySuperClass {

    public static void main(String[] args) {
        MySuperClass cl = new MyClass();
        System.out.println(cl.getType());
    }
    public int getType() {
        return 3;
    }

}
