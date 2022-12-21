package day05_ifstatements;

import java.util.Scanner;

public class ornek6 {
    public static void main(String[] args) {

        /*
      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.

              - Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
               oldugunu yazdirin,
              sayi cift sayi ise 10’un tam kati olup olmadigini
              yazdirin

     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");

        double sayi=scan.nextDouble();

        if (sayi<0){
            System.out.println("negatif sayi");}

        if (sayi%10==1 || sayi%10==3 ){
            System.out.println("pozitif tek sayi");}

        if ( sayi%10==5 || sayi%10==7 || sayi%10==9 ){
            System.out.println("pozitif tek sayi");}

        if (sayi%10==0){
            System.out.println("10 ' nun kati bir sayi");} else {
            System.out.println(" sayi 10 ' nun katlari degil");}



    }
}
