package Prog2_4_parse;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Prog4 {
    public static void main(String[] args) {
        String data = Data.records;
        String[] item = data.split(":");

        for(String itemOne : item) {
            System.out.println(itemOne.split(",")[0]);
        }

    }
}

