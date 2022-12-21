package day03_dataCasting_Matematikselislemle;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
// Soru 5- Kullanicidan bir double, bir  tamsayi alin,
// double sayiyi ikinci sayiya bolun
// ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        System.out.println(" Lutfen bir double sayi giriniz");
        double sayidbl= scan.nextDouble();
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayiint= scan.nextInt();
        double bolum= sayidbl/sayiint;
        System.out.println("bolme isleminin sonucu= "+ ((int)bolum));


    }
}
