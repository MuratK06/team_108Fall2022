package day06_ifelsestatemenets;

import java.util.Scanner;

public class C10_Nested_if_else {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen urun adedini giriniz");
        int urunadedi= scan.nextInt();
        System.out.println("lutfen urunun liste fiyatini giriniz");
        double listefiyati= scan.nextDouble();
        System.out.println("musteri kartiniz varmi? \n E: Evet, H: Hayir");
        char kartvarmi=scan.next().charAt(0);

        // kart ana degisken olsun

        if (kartvarmi=='E' || kartvarmi=='e'){
            if (urunadedi<=0) System.out.println("gecersiz urun miktari");
            else if (urunadedi>10) System.out.println(" % 20 indirimli fiyati: "+ urunadedi*listefiyati*0.8);
            else System.out.println(" % 15 indirimli fiyati: "+ urunadedi*listefiyati*0.85);}

        else if (kartvarmi=='H' || kartvarmi== 'h'){ if (urunadedi<=0) System.out.println(" gecersiz urun miktari");
        else if (urunadedi>10) System.out.println(" % 15 indirimli fiyati: "+ urunadedi*listefiyati*0.85);
        else System.out.println(" % 10 indirimli fiyati: "+ urunadedi*listefiyati*0.90);}







    }
}
