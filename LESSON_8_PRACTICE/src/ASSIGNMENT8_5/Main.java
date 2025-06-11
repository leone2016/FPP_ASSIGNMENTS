package ASSIGNMENT8_5;

public class Main {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('c',"Charlie");

        String s = t.get('b');
        String z = t.get('z');
        System.out.println(s); // Billy
        System.out.println(z); // null
    }
}
