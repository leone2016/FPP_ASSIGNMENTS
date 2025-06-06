package QUIZZ1.q3;

public class MyClass extends MySuperClass {

    public static void main(String[] args) {
        MySuperClass cl = new MySuperClass();
        System.out.println(cl.getType());
    }
    public int getType() {
        return 3;
    }

}
