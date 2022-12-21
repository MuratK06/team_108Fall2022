package sample_questions;

import java.util.Scanner;

public class ornek5 {
    public static void main(String[] args) {

        //Soru 5-)   SCANNER
        //Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
        //Ipuclari:
        //Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)

        Scanner scan=new Scanner(System.in);
        System.out.println("Karenin kenar uzunlugunu giriniz: ");

        int kenaruzunlugu= scan.nextInt();

        System.out.println("Karenin alani= "+ (kenaruzunlugu*kenaruzunlugu));
        System.out.println("Karenin cevresi= "+ (4*kenaruzunlugu));



    }
}
