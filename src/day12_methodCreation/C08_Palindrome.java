package day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

        //verilen bir stringin Palindrome olup olmadigini yazdirin
        //Palindrome:duz okunusu ile tersten okunusu birbirine ayni olan

        String str="Bu methodlar ne guzelmis";

        String tersStr=C07_TersecevirmeMethod.metnitersecevir(str);

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("verilen metin Polindrome");


        }else {
            System.out.println("verilen metin Palindrome degil");
        }


    }
}
