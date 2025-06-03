package ASSIGNMENT5_1;


public class Main{

public static void main(String[] args) {
    MySingleton s1 = MySingleton.INSTANCE;
    MySingleton s2 = MySingleton.INSTANCE;

    s1.showMessage();

    // Verifying both instances are the same
    if (s1 == s2) {
        System.out.println("Singleton verified: both references point to the same instance.");
    } else {
        System.out.println("Singleton failed: different instances exist.");
    }
}
}