package day07_ternary_switckStatemenets;

import java.util.Scanner;

public class C02_i_else_if {
    public static void main(String[] args) {


        //kullanicidan bir sayi tam sayi alin, sayi negatif ise ; girilin sayi negatif
        // sayi iki basamakli ise ; girilen sayi iki basmakli
        // sayi iki basmakdan buyuk ise ;: buyuk sayi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen bir tam sayi giriniz: ");
        int sayi= scan.nextInt();

        if (sayi<0) System.out.println("negatif sayi");
        else if (sayi<9) System.out.println(" sayi rakam");
        else if (sayi<=99) System.out.println("girilen sayi iki basamakli");
        else System.out.println("buyuk sayi");
        {

        }
        {

        }
    }
}
