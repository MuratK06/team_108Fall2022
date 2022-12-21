package day02_variables_scanner;

import java.util.Scanner;

public class C_ornek2 {
    public static void main(String[] args) {
        //Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
        //yazin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen sayi1 giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen sayi2 giriniz");
        int sayi2= scan.nextInt();
        System.out.println("lutfen sayi3 giriniz");
        int sayi3= scan.nextInt();
        //double ortalama= scan.nextDouble();
        System.out.println("ortalama= "+(double)(sayi1+sayi2+sayi3)/2);
    }
}
