package sample_questions;

public class ornek16 {
    public static void main(String[] args) {

        //Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun
        // ve konsolda yazdırın
        //                  Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        //                  Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
        //                               Loopun içerisinde StringM methodlarından  yararlanalım!



        String kelime= "sonbahar";




      String YeniKelime=(kelime.substring(kelime.length()-3)+(kelime.substring(kelime.length()-3)));




        if (YeniKelime.length()<5){
            System.out.println("lutfen yeni bir kelime girin");
        }
        else {
            System.out.println("girilen keimenin son hali:  "+ YeniKelime);
        }


    }
}
