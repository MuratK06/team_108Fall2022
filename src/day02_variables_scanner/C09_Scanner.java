package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
        /* kullanicinin girdigi degerler
        sayi1= 10   sayi2= 20 ise
        siz kod ile bunlarin degerlerini degistirin
       sayi1=20   sayi=10
         */
        Scanner scan= new Scanner(System.in);
        System.out.println(" lutfen sayi1 giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen sayi2 giriniz");
        int sayi2= scan.nextInt();
        int bos;
        bos=sayi2;
        sayi2=sayi1;
        sayi1=bos;
        System.out.println("sayilarin degerlerinin yerini degistirdim" + "\nsayi1'in yeni degeri: "+ sayi1 +"\nsayi2'nin yeni degeri: "+sayi2);

    }
}
