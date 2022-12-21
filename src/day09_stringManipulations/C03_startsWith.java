package day09_stringManipulations;

public class C03_startsWith {
    public static void main(String[] args) {

        String str= "Java mutludur";

        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("j"));
        System.out.println(str.startsWith("Java mutluluktur"));
        System.out.println(str.startsWith(""));

        System.out.println(str.contains("mutlu")); // mutlu iceriyor mu?
        System.out.println(str.startsWith("mutlu"));// mutlu ile mi basliyor?

        System.out.println("===========");

        System.out.println(str.startsWith("mutlu" ,5)); // 5. index  den sonrasi mutluyla  mi baslar?

        System.out.println(str.startsWith("va" ,2)); // 2. index ve sonrasi va ile mi basliyor?"

    }
}
