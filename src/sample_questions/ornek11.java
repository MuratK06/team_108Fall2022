package sample_questions;

import java.util.Scanner;

public class ornek11 {
    public static void main(String[] args) {

        //Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        //                 Ad ve soyadın baş harfleri büyük olmalıdır
        //                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        //                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
        //	Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        //Giriş :
        //		 > Gandalf Grey 563245879632
        //Çıktı :
        //		 > İsim : G****** G***
        //		 > CCN : **** **** 9632


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen  isim soyisim ve kredi karti numaranizi  giriniz: ");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        String kkartino= scan.nextLine();



        if (kkartino.length()==16) {
            System.out.println(isim.substring(0, 1).toUpperCase() +
                    isim.substring(1).replaceAll("\\w", "*") +
                    " " + soyisim.substring(0, 1).toUpperCase() +
                    soyisim.substring(1).replaceAll("\\w", "*"));


                System.out.println(kkartino.substring(0, 4).replaceAll("\\d", "*") + " " +
                        kkartino.substring(4, 8).replaceAll("\\d", "*") + " " +
                        kkartino.substring(8, 12).replaceAll("\\d", "*") + " " + kkartino.substring(12, 16));


            } else {
                System.out.println("gecersiz islem");
            }





    }
}
