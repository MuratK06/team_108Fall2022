package sample_questions;

public class ornek23 {
    public static void main(String[] args) {

        //Soru 23-)
        //Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
        //Örnek:
        //Girdi: 6
        //Çıktı: 6!=65432*1=720
        //ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.

        int sayi=6;
        double faktoryel=1;

        faktoryelhesapla(sayi);

    }

    private static void faktoryelhesapla(int sayi) {
        int faktoryelsonucu=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryelsonucu*=i;

        }
        System.out.println("girilen "+sayi + " icin faktoryel: "+faktoryelsonucu);

    }
}
