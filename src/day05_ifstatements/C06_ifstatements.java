package day05_ifstatements;

import java.util.Scanner;

public class C06_ifstatements {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz: ");
        char krk= scan.next().charAt(0);

        if (krk>='A'&& krk<='Z'){
            System.out.println("karakter: Buyuk harf");}else {
            System.out.println(" karakter: Buyuk harf degil");}

    }
}
