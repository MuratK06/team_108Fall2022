package sample_questions;

import java.util.Scanner;

public class ornek8 {
    public static void main(String[] args) {

        //Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        //               Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        //ipuclari:
        //Matematiksel Islemler konusuna bakalim. Bölme islemi kullanarak sayinin basamaklarini alalim ve
        // toplam adli bir konteynira (Variable) atalim.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi girin: ");
        int sayi= scan.nextInt();

        int birlerbasamagi=0;
        int rakamlartoplami=0;


        //sayi=sayi/10;
        birlerbasamagi= sayi%10;
        rakamlartoplami=rakamlartoplami+birlerbasamagi;

        sayi=sayi/10;
        birlerbasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+birlerbasamagi;

        sayi=sayi/10;
        birlerbasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+birlerbasamagi;

        sayi=sayi/10;
        birlerbasamagi=sayi%10;
        rakamlartoplami=rakamlartoplami+birlerbasamagi;
        sayi=sayi/10;

        System.out.println(" sayinin rakamlarinin toplami= "+ rakamlartoplami);
    }
}
