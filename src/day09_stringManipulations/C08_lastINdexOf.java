package day09_stringManipulations;

public class C08_lastINdexOf {
    public static void main(String[] args) {

        String str= "Javayi iyi ogrenmek icin cok calismam lazim cok";

        // ilk 'a' nin indexini yazdiralim

        System.out.println(str.indexOf("a"));

        // son 'a' nin indexini yazdirin

        System.out.println(str.lastIndexOf("a"));

        // veriln str da cok kelimesini kullanimini kontrol edip,
        // - cok kelimesi kulanilmamis
        // -bir kere kullanilmis
        //-  bir den fazla kullanilmis
        // sonuclarindan uygun olani yazdirin


         int ilkCokindexi=str.lastIndexOf("cok");
        int sonCokindexi=str.lastIndexOf("cok");

        if (!str.contains("cok")){
            System.out.println("cok kelimesi kullanilmamis");}
        else if (ilkCokindexi==sonCokindexi) {
            System.out.println("cok kelimesi bir kere kullanilmis");}
        else {
            System.out.println(" cok kelimesi bir den fazla kullanilmis");}




    }


    }

