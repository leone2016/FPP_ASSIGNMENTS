package ASSIGNMENT5_1;

/**
 * Things you should think about as you attempt to create this class:
 * 1. How do you prevent users of your class from creating multiple instances? Why can't they
 * just invoke the constructor of your class multiple times?
 *
 * RESPONSE: Declaring the constructor private, no other classes can instantiate MySingleton which means that it is not possible
 *  to call multiple times.
 *
 *
 * 2. If two clients attempt to access an instance of your class, how can you guarantee they will
 * get the same instance?
 *
 * RESPONSE: By returning the same static final instance from getInstance().
 *
 * 3. How can you test your class to prove that it really is a Singleton?
 *
 * RESPONSE:
 *
 * Calling getInstance() from different references and checking if both references point to the same object using == or comparing hashcodes.
 */
public class Main {
    public static void main(String[] args) {
        //MySingleton s1 = new MySingleton();// has private access which is not possible instantiate
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();

        System.out.println("s1 hashCode"+ s1.hashCode());
        System.out.println("s2 hashCode"+ s2.hashCode());

        if (s1 == s2){
            System.out.println("Both variables point to the same Singleton instance.");
        }else {
            System.out.println("Different instances exist — Singleton failed.");
        }

    }
}