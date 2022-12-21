package day10_StringManipulations;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str="Java heyecandir";

        // eger tum a 'lari degilde ilk a' yi degistirmek isterseniz

        System.out.println(str.replaceFirst("a","A"));

        //ilk harf veya rakami * yap

        System.out.printf(str.replaceFirst("\\w", "*"));

    }
}
