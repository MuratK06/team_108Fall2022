package day09_stringManipulations;

public class ornek3 {
    public static void main(String[] args) {

        String str= "bitsin artik bu cile :)";

        System.out.println(str.startsWith("bitsin"));
        System.out.println(str.endsWith("bu"));
        System.out.println(str.indexOf("cile"));
        System.out.println(str.contains("bitsin"));
        System.out.println(str.contains("bitsin bu cile artik"));
        System.out.println("***************");
        System.out.println(str.substring(0,9));
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-2));
        System.out.println(str.substring(5));
        System.out.println(str.substring(3,3));
        System.out.println("======");
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('i',5));
        System.out.println(str.indexOf("cile"));
        System.out.println(str.lastIndexOf("bu"));




    }
}
