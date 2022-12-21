package sample_questions;

import java.util.Scanner;

public class ornek6 {
    public static void main(String[] args) {

        //Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        // 1 şeker = 1.5 gr
        //1 kg = 1000 gram      olarak hesaplayınç
        //
        // Ipuclari:
        //·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Gunluk kac bardak cay tuketiyorsunuz ? ");
        int caymiktari= scan.nextInt();
        System.out.println("Gunluk kac adet seker tuketiyorsunuz? ");
        int sekermiktari= scan.nextInt();
        double sekermiktariGr=sekermiktari*1.5;

        double yillikcaymaiktari=caymiktari*365;
        double yilliksekermiktari=sekermiktariGr*365;

        System.out.println("yillik ictiginiz cay miktari: "+ (yillikcaymaiktari+" bardak"));

        System.out.println("yillik kullandiginiz seker miktari: "+ (yilliksekermiktari/1000)+" kg");




    }
}
