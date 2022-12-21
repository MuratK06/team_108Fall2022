package day03_dataCasting_Matematikselislemle;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="Java Candir";
        Integer sayi2= 20;
        String str2="123";
        String str4= "456";


        int str2Int= Integer.parseInt(str2);// str2 yi Integer e ceviriyor
        int str3Int= Integer.parseInt(str4);
        System.out.println("toplama sonucu= "+ (str2Int+str3Int) + ". :)");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        char krk1= '$';
        System.out.println(Character.isDigit(krk1));
        System.out.println(Character.isAlphabetic(krk1));
        System.out.println(Character.isLetter(krk1));

        short sayi3=4;
        int sayi5= sayi3;










    }
}
