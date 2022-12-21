package sample_questions;

import java.util.Scanner;

public class ornek12 {
    public static void main(String[] args) {

        //Soru 12-)
        //Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        //Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
        //
        //Ipucu:  IF/Else kullanabilirsiniz.
        //Örnek:
        //İki tamsayı girin:
        //25  veya  4567986321453
        //46   veya 123456
        //Konsolda Çıktı :
        //Sayıların toplamı: 71  veya  Fazla Yüklenme

        Scanner scan=new Scanner(System.in);
        System.out.println(" Lutfen iki sayi giriniz: ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        double toplam=sayi1+sayi2;

        if (toplam>9999999999d){
            System.out.println("Fazla yukleme");
        }
        else {
            System.out.println("Sayilarin toplami: "+toplam);
        }

    }
}
