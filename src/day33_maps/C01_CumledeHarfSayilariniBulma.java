package day33_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_CumledeHarfSayilariniBulma {
    public static void main(String[] args) {


        // verilen bir cumlede kullanilan her bir harfi
        // ve kacar kez kullanildigini yazdirin
        // Ornek : Java candir
        // output :  J=1, a=3, v=1, c=1, n=1, d=1, i=1, r=1

        String cumle="Java candir";

        //once bosluk ve noktalama isretlerini yok edelim

        cumle=cumle.replaceAll("\\W", "");

        String[]cumleArr=cumle.split("");

        Map<String, Integer> kullanimSayilariMap=new HashMap<>();

        for (int i = 0; i <cumleArr.length ; i++) {
            // her bir elemnti ele alip , map de key olarak yoksa value =1 olarak ekleriz
            // map de key olarak varsa value 1 artirilmali

            if (!kullanimSayilariMap.containsKey(cumleArr[i])){
                kullanimSayilariMap.put(cumleArr[i],1);

            }else{
                int eskiValue=kullanimSayilariMap.get(cumleArr[i]);
                kullanimSayilariMap.put(cumleArr[i],eskiValue+1);
            }

        }
        System.out.println(kullanimSayilariMap); //{a=3, r=1, c=1, d=1, v=1, i=1, J=1, n=1}
    }
}
