package day06_ifelsestatemenets;

import java.util.Scanner;

public class C08_if_else_if {
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

        if (kartvarmi=='E'&& urunadedi>10) {
            System.out.println("% 20 indirimli fayati: " +urunadedi*listefiyati*0.8);}
        else if (kartvarmi=='E' && urunadedi>0 ){
            System.out.println(" % 15 indirimli fiyati:" +urunadedi*listefiyati*0.85);}
        else if (kartvarmi=='H'&& urunadedi>10) {
            System.out.println(" % 15 indirimli fiyati: "+ urunadedi*listefiyati*0.85);}

        else if (kartvarmi=='H'&& urunadedi>0) {
            System.out.println(" % 10 indirimli fiyati: "+ urunadedi*listefiyati*0.90);}
        else {
            System.out.println("hatali giris");}



    }
}
