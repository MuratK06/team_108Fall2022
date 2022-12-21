package day10_StringManipulations;

import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degerlerini alip
        // bu sinirlar dahil olarak, bu sayilar arasinda 3'in kati olan sayilari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("baslangic degerini giriniz: ");
        int baslangic= scan.nextInt();
        System.out.println(" bitis degerini giriniz: ");
        int bitis= scan.nextInt();
        int sayilartoplami=0;

        for (int i = baslangic; i <=bitis ; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                sayilartoplami+=i;


            }

        }
        System.out.println("sayilarin toplami:" +sayilartoplami);








    }
}
