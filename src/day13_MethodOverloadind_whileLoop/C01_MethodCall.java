package day13_MethodOverloadind_whileLoop;

import day12_methodCreation.C03_AsalSayiMethod;
import day12_methodCreation.C07_TersecevirmeMethod;
import day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {


        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);


        String str="Bir kere yaparim, yan gelir yatarim";
        //cumleyi tersine cevirin

        String tersStr= C07_TersecevirmeMethod.metnitersecevir(str);


        System.out.println("");
        System.out.println(tersStr);



        // asagidaki cumlenin Plindrome olup olmadigini yazdirin
        str="Jva Candir";

        tersStr=C07_TersecevirmeMethod.metnitersecevir(str);

        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome degil");
        }

        // asal sayi olup olmadigini yazdirin

        int sayi=23;

        System.out.println(C03_AsalSayiMethod.asalsayiMi(sayi));

        // kullanici true /false den bisey ankmaz. acik yazalim

        boolean sonuc=C03_AsalSayiMethod.asalsayiMi(sayi);



        if (sonuc){
            System.out.println("Girilen "+sayi+ " asal. ");
        }else {
            System.out.println("Girilen "+sayi+ " asal degil.  ");
        }


    }
}
