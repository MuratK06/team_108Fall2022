package Practice;

import java.util.Scanner;

public class soru5_odev {
    public static void main(String[] args) {


        //1-100 e kadar olan sayıların içinde mükemmel olanları yazdıran metodu yazınız

        //System.out.println("Bir sayı giriniz: ");
        //Scanner scan = new Scanner(System.in);
        int sayi = 100;

        if (mukemmelSayi(sayi)) {
            System.out.println(sayi + " mikemmel sayıdır.");
        } else {
            System.out.println(sayi + " mikemmel sayı değildir.");
        }
    }

    static boolean mukemmelSayi(int sayi) {
        int toplam = 0;
        for (int i = 1; i < 100; i++) {
            if (i % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayi) {
            return true;
        } else
            return false;


    }
}