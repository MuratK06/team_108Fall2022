package day09_stringManipulations;

public class C07_ilkTest {
    public static void main(String[] args) {

        // gittigimiz web sayfasindan aldigimiz String aarma sonuclarinda arama sayisinin
        // 50 den fazla oldugunu test edin

        String input="1-48 of 87 results for \"nutella\"";

        int indexOf=input.indexOf("of");
        int indexResults=input.indexOf("results");
        String sonucSayisiString=input.substring(indexOf+3,indexResults-1);

        //arama sayisinin 50 den fazla oldugunu test edin

        int sonucSayisiInt=Integer.parseInt(sonucSayisiString);

        if (sonucSayisiInt>50){
            System.out.println(" nutella arama testi PASSED");}
        else  {
            System.out.println("istenen kadar sonuc yok, Nutella arama testi FAILLED ");
        }






    }
}
