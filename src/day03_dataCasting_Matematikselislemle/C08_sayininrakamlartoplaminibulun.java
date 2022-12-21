package day03_dataCasting_Matematikselislemle;

import java.util.Scanner;

public class C08_sayininrakamlartoplaminibulun {
    public static void main(String[] args) {
// 4 basamakli bir tam sayiyi alin, sayinin rakamlarinin toplamini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi girin= ");
        int sayi= scan.nextInt();
        //variableleri hazirlayalim
        int birlerbasamagi=0;
        int rakamlartoplami=0;
        //sirasiyla her bir basamagi ek´lde edip rakamlar toplamina ekleyelim

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
