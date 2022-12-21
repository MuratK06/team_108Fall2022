package day05_ifstatements;

import java.util.Scanner;

public class C03_ifstatements {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        // if cumlelerinde sart parantezinden sonra body kullanmaszsak, ilk noktalivirgule kadar olan jismi bady olarak kabul eder
        //yani sadece 1 satir kodu body olarak kbul eder.
        // eger if body si icin yazilacaka kod 1 satirdan fazlaysa mutlaka {} kullanilir


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");

        int sayi= scan.nextInt();

        if (sayi%3==0){
            System.out.println("sayi: 3 ile bolunebilen sayi");}

        if (sayi%5==0) {
            System.out.println(" sayi: 5 ile bolunebilen sayi");}


    }
}
