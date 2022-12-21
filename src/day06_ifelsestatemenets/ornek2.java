package day06_ifelsestatemenets;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {

        //kullanicidaan yasini isteyin
        // kullanicidan cinsiyetini isteyin
        // eger kiz ve 18-25 yas arasinda ise % 50 indirim uygulayin
        // eger kiz ve 26-50 yas arasinda ise %25 uygulayin
        // eger erkek ve 18-25 yas arsinda ise %40
        // eger erkek ve 26-50 yas arasinda ise %20 indirim uygulayin
        // diger yas gruplarina indirim yok

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz: ");
        int yas= scan.nextInt();
        System.out.println("lutfen cinsiyetinizi giriniz: \n Erkek: E \n Kadin: K");
        char cinsiyet=scan.next().charAt(0);
        System.out.println(" lutfen urun fiyatini griniz: "+"tl");
        double urunfiyati= scan.nextDouble();


        if (cinsiyet=='K' || cinsiyet=='k') {
             if (yas<18 || yas>50) System.out.println("indirim hakkiniz yok");}
            if (yas < 25) {
                System.out.println(" %50 indirimli fiyati: " + urunfiyati * 0.5 + "tl");
            } else if (yas > 26) {
                System.out.println(" % 40 indirimli fiyati: " + urunfiyati * 0.6 + "tl");
            }


            if (cinsiyet == 'E' || cinsiyet == 'e') {
                if (yas < 18 || yas > 50) System.out.println("indirim hakkiniz yok");
            } else if (yas < 25) {
                System.out.println(" % 40 indirimli fiyati: " + urunfiyati * 0.6 + "tl");
            } else if (yas > 26) {
                System.out.println(" % 20 indirimli fiyati: " + urunfiyati * 0.8 + "tl");
            }



        }
}
