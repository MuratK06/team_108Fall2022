package day03_dataCasting_Matematikselislemle;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        System.out.println(28/5);
        int sayi1=25;
        int sayi2= 6;
        System.out.println(sayi1/sayi2);
        // kullanicidan 2 tamsayi alin
// 1.tamsayiyi 2.ye bolup sonucu ondalik olarak yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        int ilksayi= scan.nextInt();
        int ikincisayi= scan.nextInt();
        System.out.println("iki sayinin bolme sonucu= "+ (double)ilksayi/ikincisayi);


    }
}
