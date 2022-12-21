package day06_ifelsestatemenets;

import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        //- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen mesafeyi km olarak giriniz: ");
        double mesafe = scan.nextDouble();
        System.out.println(" istediginiz birimi giriniz: \n Metre: m \n Cantimetre: cm");

        double km= scan.nextDouble();
        double cm= scan.nextDouble();
        double m= scan.nextDouble();
        double istenenmesafe= scan.nextDouble();

         //m= mesafe/100;
         //cm=mesafe/1000;

         if (mesafe==km) {
             if (istenenmesafe==m) System.out.println("istenen mesafe:" +(mesafe/100)+"m");}
         else System.out.println("istediginiz birim sisteme kayitli degil");


        //if (istenenmesafe==cm) {System.out.println("istenen mesafe: "+(mesafe/1000)+"cm");}


    }
}
