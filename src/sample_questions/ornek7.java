package sample_questions;

import java.util.Scanner;

public class ornek7 {
    public static void main(String[] args) {

        //Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
       // (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        //ipuclari:
        //Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim. (bearbeitet)


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir  sayi giriniz: ");
        double sayi= scan.nextDouble();
        System.out.println("Girilen sayinin tam sayi hali: "+ (int)sayi);





    }



}
