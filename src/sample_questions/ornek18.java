package sample_questions;

import java.util.Scanner;

public class ornek18 {
    public static void main(String[] args) {

       /* Soru 18-)
        Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
         Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        İpucu:
        yol=Hız*zaman

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Mesafeyi km olarak giriniz: ");
        double yol= scan.nextDouble();
        System.out.println("Aracin hizini giriniz: ");
        double hiz= scan.nextDouble();

        varissuresi (hiz,yol);




    }

    private static void varissuresi(double hiz, double yol) {
        double sure=1;

        System.out.println("Varis suresi: "+ (yol/hiz)+ " saat");
    }


}
