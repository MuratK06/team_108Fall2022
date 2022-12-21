package sample_questions;

import java.util.Scanner;

public class ornek28 {
    public static void main(String[] args) {

        //Soru-28)
        //Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        //Örnek:
        //      Sayı: 1238
        //      Sayının Tersi: 8321
        //İpucu:  Loop kullanabilirsiniz.



        
        tersecevir();


    }

    private static void tersecevir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Terse cevirmek istediginiz sayiyi girirniz: ");
        int sayi = scan.nextInt();

        String sayistr=""+sayi;
        String terssayi="";

        for (int i = sayistr.length()-1; i >=0 ; i--) {
            terssayi=terssayi+sayistr.charAt(i);


        }
        System.out.println("girilen sayinin tersi: "+terssayi);

    }


}