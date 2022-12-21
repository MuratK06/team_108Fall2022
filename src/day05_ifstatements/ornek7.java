package day05_ifstatements;

public class ornek7 {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        int urunadedi=15;
        boolean kartvarmi=true;
        double listefiyati=12.5;
        double toplamfiyat=0;

        if (kartvarmi && urunadedi>=10)
            toplamfiyat=urunadedi*listefiyati*(0.8);{
        System.out.println("urunun % 20 indirimli fiyati: "+ toplamfiyat);}

        if (!kartvarmi && urunadedi>=10)
        toplamfiyat=urunadedi*listefiyati*(0.85);{
        System.out.println(" urunun % 15 indirimli fiyati: "+ toplamfiyat);}

         if (!kartvarmi && urunadedi<10){
        toplamfiyat=urunadedi*listefiyati*(0.9);} {
        System.out.println(" urunun % 10 indirimli fiyati: " + toplamfiyat);}


    }
}
