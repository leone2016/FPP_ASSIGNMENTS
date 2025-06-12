package ASSIGNMENT8_5;

public class Main {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('c',"Charlie");
        t.add('c',"Leo");
        t.add('d',"Tesst");
        String s = t.get('b');
        String z = t.get('z');
        System.out.println(s); // Billy
        System.out.println(z); // null
        System.out.println("====== ALL USERS ======");
        System.out.println(t);
       // t.getAll();
    }
}
