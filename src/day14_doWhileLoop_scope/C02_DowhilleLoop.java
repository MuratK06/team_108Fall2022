package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DowhilleLoop {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin


        int girilenSayi = 10;
        int toplam = 5;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Lutfen toplanmak icin tamsayi giriniz");
            girilenSayi= scan.nextInt();
            toplam += girilenSayi;

        }
        while(girilenSayi!=0);
        System.out.println("Girilen sayilarin toplami : " + toplam);



        /*
           While loop'da ilk sart saglanmazsa loop body hic CALISMAZ
           Do-While Loop'da once body calisdigi icin, sart yanlis olsa bile
           loop body'si en az 1 kere calismis olur
         */

    }
}
