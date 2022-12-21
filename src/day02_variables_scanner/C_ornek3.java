package day02_variables_scanner;

import java.util.Scanner;

public class C_ornek3 {
    public static void main(String[] args) {
       //Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi1 giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("lutfen sayi2 giriniz");
        double sayi2= scan.nextDouble();
        //int bolum= scan.nextInt();
        System.out.println("iki sayinin bolumu= "+ (int)(sayi1/sayi2));



    }
}
