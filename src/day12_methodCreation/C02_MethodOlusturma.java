package day12_methodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        // verilen iki sayiyi carpip sonucu yazdiran bir method olusturun

        // bir method ancak method call yapildiginda calisir
        // method call icin method adi ve paremetrelere gore uygun argument yazilmalidir
        //method call icerisine yazilan variable veya degerlere argument denir

      carpyazdir(5,8);
      carpyazdir(7.4,8.6);

      // carpyazdir ("ali","veli") ; argument ve paremetreler uyumlu degilse CTE olur

    }



    public static void carpyazdir(double sayi1, double sayi2){

        System.out.println(sayi1 * sayi2);

    }
}
