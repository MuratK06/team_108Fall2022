package sample_questions;

public class a {
    public static void main(String[] args) {

        /*Soru 15-)
Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
-> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
-> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
Örn:
     isim1= masa
         isim2= ali
     Konsol => maalisa */
        String isim1="java";
        String isim2="guzeldir";
        if (isim1.length()%2==0){
            String yeniIsim=isim1.substring(0,isim1.length()/2)   .concat(isim2).   concat(isim1.substring(isim1.length()/2,isim1.length()));
            System.out.println(yeniIsim);
        }else System.out.println("isim2, isim1'e eklenemez");
    }
}
