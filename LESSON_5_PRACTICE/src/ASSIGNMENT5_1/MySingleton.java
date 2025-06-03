package ASSIGNMENT5_1;

public class MySingleton{
    public static final MySingleton INSTANCE
            = new MySingleton();

    private MySingleton() {}

    public void showMessage() {
        System.out.println("Hello from the Singleton!");
    }

}
