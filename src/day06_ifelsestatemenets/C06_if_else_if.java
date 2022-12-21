package day06_ifelsestatemenets;

import java.util.Scanner;

public class C06_if_else_if {
    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen cinsiyetinizi giriniz\n K: Kadin, E: Erkek");
        char cinsiyet= scan.next().charAt(0);
        System.out.println(" lutfen yasinizi giriniz:");

        double yas= scan.nextDouble();

        if ((cinsiyet=='k' || cinsiyet=='K') && yas>=60) {
            System.out.println(" emekli olabilirsiniz");}
        else if ((cinsiyet=='k' || cinsiyet=='K') && yas>18) {
            System.out.println("emekli olmak icin"+ (60-yas)+ " yil daha calismalisiniz");}
        //else if ((cinsiyet=='k' || cinsiyet=='K') && yas<18 || yas>80) {
          //  System.out.println("gecersiz yas");}

        if ((cinsiyet=='e' || cinsiyet=='E') && yas>=65) {
            System.out.println(" emekli olabilirsiniz");}
        else if ((cinsiyet=='e' || cinsiyet=='E') && yas>18) {
            System.out.println("emekli olmak icin"+ (65-yas)+ " yil daha calismalisiniz");}
        //else if ((cinsiyet=='k' || cinsiyet=='K') && yas<18 || yas>80) {
            //System.out.println("gecersiz yas");}
        else {
            System.out.println("gecersiz bilgi");}




    }
}
