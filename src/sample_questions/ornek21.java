package sample_questions;

import java.util.Scanner;

public class ornek21 {
    public static void main(String[] args) {

        //Soru 21-)
        //Bir aydaki gün sayısını bulmak için bir Java programı yazın
        //(Mülakat Sorusu / Interview Sorusu / Leak Year)
        //
        //Örnek:
        //Bir ay numarası girin: 2
        //Bir yıl girin: 2016
        //
        //Şubat 2016'da 29 gün vardır
        //ipucu:
        //Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir.
        // Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!

        Scanner scan = new Scanner(System.in);
        System.out.println("bir ay numarasi girin:  ");
        int ayno = scan.nextInt();
        System.out.println("bir yil girin:  ");
        int yil = scan.nextInt();

        int kacgun=1;

        switch (ayno){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Gun saysi: "+ (kacgun = 31));break;
            case 2:
                System.out.println("Gun saysi: "+ (kacgun = 28));break;
            case 4: case 6: case 9: case 11:
                System.out.println("Gun saysi: "+ (kacgun = 30));break;
            default:
                System.out.println("gecersiz ay numarasi");
        }





    }
}
