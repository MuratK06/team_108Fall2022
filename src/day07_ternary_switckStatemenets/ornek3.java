package day07_ternary_switckStatemenets;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        //kullanicidan bir sayi tam sayi alin, sayi rakam ise ; girilin sayi Rakam
        // sayi iki basamakli ise ; girilen sayi iki basmakli
        // sayi iki basmakdan buyuk ise ;: buyuk sayi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz: ");
        int sayi= scan.nextInt();


        if (sayi>0 && sayi<=9)
            System.out.println("sayi rakam");
        else if (sayi>=10 && sayi<=100) {
            System.out.println(" iki basamakli sayi");}
            else System.out.println(" buyuk sayi");



    }
}
