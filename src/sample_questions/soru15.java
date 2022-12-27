package sample_questions;

import java.util.Scanner;

public class soru15 {
    public static void main(String[] args) {

        /*Soru 4- Kullanicidan bir cumle ve bir harf alin, eger
         harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
         kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir harf giriniz:  ");
        String harf=scan.nextLine();

        String [] cumleArr=cumle.split(""); // cumleyi tek tek harflere ayiririr


        int sayac=0;

        for (String eachharf:cumleArr
        ) {
            if (eachharf.equals(harf)){
                sayac++;

            }
        }
        if (sayac==0){
            System.out.println(harf+ " harfi cumlede kullanilmamis.");

        }else {
            System.out.println(harf+ " harfi cumlede " + sayac + " defa kullanilmis.");

        }

    }
}
