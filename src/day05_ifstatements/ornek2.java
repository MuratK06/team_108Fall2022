package day05_ifstatements;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz: kg ");
        double kilo= scan.nextDouble();
        System.out.println("lutfen boyunuzu giriniz: cm");

        double boy= scan.nextDouble();
        double kitleendeksi=(kilo*10000)/(boy*boy);

        System.out.println("kitle endeksi:" + kitleendeksi);


        if (kitleendeksi>30){System.out.println("obez");}else
        if (kitleendeksi>25){System.out.println("kilolu");}else
        if (kitleendeksi>20){System.out.println("normal");}else
        if (kitleendeksi>0){System.out.println("zayif");}




    }
}
