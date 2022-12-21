package day07_ternary_switckStatemenets;

import java.util.Scanner;

public class C01_if_else_if {
    public static void main(String[] args) {

        //kullanicidan bir sayi tam sayi alin, sayi rakam ise ; girilin sayi Rakam
        // sayi iki basamakli ise ; girilen sayi iki basmakli
        // sayi iki basmakdan buyuk ise ;: buyuk sayi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen bir tam sayi giriniz: ");
        int sayi= scan.nextInt();

        if (0<=sayi && sayi<=9) System.out.println("sayi rakam");
        else if (10<=sayi && sayi<=99) System.out.println("sayi iki basamakli");
        else if (sayi>=100 ) System.out.println("buyuk sayi"); {

        }
        {

        }
    }
}
