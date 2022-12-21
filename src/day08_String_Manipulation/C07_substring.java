package day08_String_Manipulation;

public class C07_substring {
    public static void main(String[] args) {


        String str = "Java ogren, isi kap"; // karekter sayisi :19

        System.out.println(str.length());

        // metnin tam ortasindaki karekter nedir

        System.out.println(str.charAt(str.length()/2));

       // str.substring(str.charAt(str.length()-1));

        // Bir karakteri degil de verilen String'in icerdigi bir metin parcasini elde etmek istersek
        // ornegin "ogren" kelimesini yazdiralim

        System.out.println(str.substring(5, 9));

        // substring(bas,bitis) method'unda
        // baslangic olarak yazilan index dahil(inclusive)
        // bitis olarak yazilan index haric(exclusive)'dir

        System.out.println(str.substring(5,10));

        // str'dan "Java" kelimesini yazdiralim


        System.out.println(str.substring(0,4));

        // str'dan "kap" yazdiralim



        System.out.println(str.substring(19-3));

        System.out.println(str.substring(16));

        System.out.println(str.substring(16,19));

        // substring le sadeve J yazdirialim

        System.out.println(str.substring(0,1));

       // substring le 9. index deki harfi buyuk yazdiralim

        System.out.println(str.substring(9,10).toUpperCase());

        // chartAt() kullanmak yerine substring kullanmak daha avantajli olabilir
        // cunku substring kullaninca ifade hala string oldugundan
        // method kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5)); // burda hiclik yazdirir (0 karekter)


        System.out.println("===========");

        //System.out.println(str.substring(4,3)); // hata verir

        //System.out.println(str.substring(25,28)); //  sinirlarin disina cikildigi icin hata verir

        System.out.println(str.substring(str.length())); //yine hiclik yazdirdi. length en sona gidiyor

        System.out.println("===========");

    }
}
