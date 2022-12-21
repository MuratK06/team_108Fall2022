package day12_methodCreation;

public class ornek3 {
    public static void main(String[] args) {


        String str1 = "Ali";

        String str2 = "ali";


        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str2.equalsIgnoreCase(str1));


        String str = "Java code yaz";
        System.out.println(str.substring(5));
        System.out.println(str.substring(12));
    }
}
