package day19_arrayList_forEachloop;

public class ornek2 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

        String cumle="Java ogrenmek cok guzel";
        String harf="a";

        String[] cumlearr=cumle.split("");

       int sayac=0;

        for (String eachharf:cumlearr
             ) {
          if (eachharf.equals(harf)){
              sayac++;
          }
        }
        if (sayac==0){
            System.out.println(harf +" cumlede kullanilmamis");
        }else {
            System.out.println(harf + " cumlede "+ sayac+ " adet kullanilmis");
        }
    }
}
