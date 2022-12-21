package sample_questions;

import java.util.Scanner;

public class ornek22 {
    public static void main(String[] args) {

        //Soru 22-)
        //Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        //Giriş :
        //30 ve 40
        //
        //Beklenen Çıktı:
        //30 ve 40 için EBOB= 10
        //30 ve 40 için EKOK= 120
        //ipucu:
        //Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int ebob = 1;
        int ekok = 1;
        int kucukSayi = sayi1<sayi2 ? sayi1 : sayi2;
        for (int i = 1; i < kucukSayi; i++) {
            if (sayi1%i==0 && sayi2%i==0)
                ebob = i;
        }
        System.out.println( sayi1 + " ve " + sayi2 + " için EBOB= " + ebob);
        System.out.println( sayi1 + " ve " + sayi2 + " için EKOK= " + (sayi1*sayi2/ebob) );

    }
}
