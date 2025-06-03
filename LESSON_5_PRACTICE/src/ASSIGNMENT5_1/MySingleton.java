package ASSIGNMENT5_1;

public class MySingleton {

    private static final MySingleton instance = new MySingleton();

    private MySingleton(){
        if(instance!= null)throw new RuntimeException("Use getInstance() method to get the single instance");
    }

    public static MySingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from the singleton!");
    }
}
