package day03_dataCasting_Matematikselislemle;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        System.out.println('a'+'b');// 97+98=195 (ascii table)
        System.out.println('a'-32);
        System.out.println((char)'a'-32);// ascii table a=97, A=65
// kullanicidan bir char alip
// ascii table'dan kullanicinin girdigi char'in sonrasindaki
// 3 karakteri yazdirin
// ornek input : a output : b,c,d

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir karekter giriniz");
        char girilenkarakter= scan.next().charAt(0);//0 ilk harfin index numarasi
        System.out.println((char) (girilenkarakter+1)+","+(char)+(girilenkarakter+2)+","+(char)(girilenkarakter+3));




    }
}
