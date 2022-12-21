package day04_Invrement_Concatenation;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        // kullanicidan bir sayi alin , one 2 artirin , sonra 3 azaltin ve yazdirin
        System.out.println(" lutfan bir sayi giriniz: ");

        Scanner scan= new Scanner(System.in);
        int sayi= scan.nextInt();
       sayi= sayi+2;
        System.out.println("sayinin 2 artirilmis hali: " +sayi);
        sayi= sayi-3;
        System.out.println("sayinin 3 azaltilis hali: "  +sayi);


    }
}
