package QUIZZ1.q8;

public class TheClass {
    TheClass(){
        TheSubclass sub = new TheSubclass();
        System.out.println("The Class constructor");
    }
    public static void main(String[] args){
        new TheSubclass();
    }
}

class TheSubclass extends TheClass {
    TheSubclass() {
        System.out.println("The Subclass constructor");
    }
}