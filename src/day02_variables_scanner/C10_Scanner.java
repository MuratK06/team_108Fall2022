package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir double sayi giriniz");
        double doublesayi= scan.nextDouble();
        System.out.println("lutfen bir int sayi giriniz");
        float intsayi= scan.nextFloat();
        System.out.println("sayilarin toplami:" + (doublesayi+intsayi)+ "\nsayilarin carpimi: "+ (doublesayi*intsayi));

    }
}
