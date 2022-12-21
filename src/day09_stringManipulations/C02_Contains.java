package day09_stringManipulations;

public class C02_Contains {
    public static void main(String[] args) {

        String str="Java ogren mutlu ol";

        // str  mutlu iceriyor mu?

        System.out.println( str.contains("mutlu"));

        //charSequence : char dizisi


        System.out.println(str.contains("j"));
        System.out.println(str.contains("J"));

    }
}
