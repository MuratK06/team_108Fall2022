package sample_questions;

public class ornek17 {
    public static void main(String[] args) {

        //Soru 17-)
        //Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        // ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
        //Örnek:
        //char ch1=            'a'
        //String name =     "Ali bakkala geç gitti."
        //Beklenen Çıktı=    a sayısı = 3
        //Ipucu:
        //Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
        // Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!





        String isim ="Sorgulanmayan hayat yasamaya degmez";

        char krk='n';
        int sayac=0;
        for (int i = 0; i <isim.length() ; i++) {
            if (isim.charAt(i)=='n' || isim.charAt(i)=='A' ){
                sayac=sayac+1;
            }

        }System.out.println( sayac+ " defa kullanilmis.");
    }
}
