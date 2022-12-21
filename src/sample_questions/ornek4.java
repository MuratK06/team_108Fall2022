package sample_questions;

import java.util.Scanner;

public class ornek4 {
    public static void main(String[] args) {

        //Soru 4-)   SCANNER
        //Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
        //Ipuclari:
        //* Sayinin küpü: sayi*sayi*sayi

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");

        double sayi= scan.nextDouble();

        double sayininküpü= sayi*sayi*sayi;

        System.out.println(" Sayinin küpünün yarisi= "+ (sayininküpü/2));
    }
}
