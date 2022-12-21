package day11_ForLoops;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner sacn=new Scanner(System.in);
        System.out.println("lutfen baslangic be bitis degerleri icin iki pozitif tam sayi giriniz");

        int baslangic= sacn.nextInt();
        int bitis= sacn.nextInt();

        if (bitis<baslangic) {
            System.out.println("baslangic degeri bitis degerinden kucuk olmali");
        }
        else {
            int toplam = 0;

            for (int i = baslangic; i <= bitis; i++) {
                toplam += i; // tum sayilari sirasi ile toplam'a ekledik
            }
            System.out.println(baslangic + " ile " + bitis + " arasindaki sayilarin toplami : " + toplam);
        }

    }
}
