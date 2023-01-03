package day28_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int girilenSayi=0;
        int sayiAdedi=0;
        int sayilarToplami=0;

        while (sayiAdedi<10000) {

            try {

                System.out.println("toplamak icin tam sayi girin" + "\nBitirmek icin Q' ya basin");
                girilenSayi = sc.nextInt();
                sayilarToplami += girilenSayi;
                sayiAdedi++;

            } catch (InputMismatchException e) {

                String girilenDeger = sc.nextLine();
                if (girilenDeger.equalsIgnoreCase("q")) {
                    System.out.println("Girilen" + sayiAdedi + " sayinin toplami : " + sayilarToplami);break;
                } else {
                    System.out.println("gecersiz input");
                }

            }
        }
    }
}
