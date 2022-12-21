package day05_ifstatements;

import java.sql.ClientInfoStatus;
import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("alinan urun adedi: ");
        double adet= scan.nextDouble();
        System.out.println("liste fiyatini girin: ");
        double listefiyati= scan.nextDouble();
        System.out.println("kartiniz varmi: ");
        boolean kartvarmi=true;
        double toplamfiyat= listefiyati*adet;




        if (kartvarmi && adet>10) {
            System.out.println("%20 indirimli fiyati: "+ (toplamfiyat*0.8));}else {
            System.out.println("%15 indirimli fiyati: "+ (toplamfiyat*0.85));}

        if (!kartvarmi && adet>10) {
            System.out.println("%15 indirimli fiyati: "+ (toplamfiyat*0.85));}else {
            System.out.println("%10 indirimli fiyati: "+ (toplamfiyat*0.9));}




    }
}
