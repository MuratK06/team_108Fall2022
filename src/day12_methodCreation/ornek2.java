package day12_methodCreation;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {


        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan=new Scanner(System.in);
        System.out.println("baslangic ve bitis sayilarini girin: ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
       // int sayilarintoplami=1;

        System.out.println();sayilartoplami(sayi1,sayi2);




    }
    public static void sayilartoplami(int baslangic,int bitis){

        if (baslangic>bitis){
            System.out.println("baslangic degeri bitis degerinden kucuk olmali");

        }else {
            int toplam=1;

            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;


            }
            System.out.println("sayilarin toplami: "+toplam);
        }
    }


}
