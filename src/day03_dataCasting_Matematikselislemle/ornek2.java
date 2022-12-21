package day03_dataCasting_Matematikselislemle;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
       // Kullanicidan 3 double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin. sayinin ortalamsini double sayi olarak yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen sayi1 giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("lutfen sayi2 giriniz");
        double sayi2= scan.nextDouble();
        System.out.println("lutfen sayi3 giriniz");
        double sayi3= scan.nextDouble();
        System.out.println("bolme isleminin sonucu= "+ (int)(sayi1/sayi2));
        System.out.println(" sayilarin ortalamasi= "+(double)(sayi1+sayi2+sayi3)/3);

        String bugungunlerden= "carsamba";
        System.out.println("gun: "+bugungunlerden+" gule gule...");


    }
}
