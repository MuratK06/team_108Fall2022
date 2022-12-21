package day06_ifelsestatemenets;

import java.util.Scanner;

public class C09_Nested_if_else {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen cinsiyetinizi giriniz\n K: Kadin, E: Erkek");
        char cinsiyet= scan.next().charAt(0);
        System.out.println(" lutfen yasinizi giriniz:");
        int yas= scan.nextInt();

        if (cinsiyet=='K' || cinsiyet=='k'){
            if (yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=60) System.out.println("emekli olabilirsin");
            else System.out.println(" emekli olmak icin " +(60-yas)+ " yil daha calismalisin");{

            }
        }

        else if (cinsiyet=='E' || cinsiyet=='e') {
            if (yas<18 || yas>80) System.out.println("gecersiz yas");
        else if (yas>=65) System.out.println("emekli olabilirsin");
        else System.out.println(" emekli olmak icin " +(65-yas)+ " yil daha calismalisin");

        }
    }
}
