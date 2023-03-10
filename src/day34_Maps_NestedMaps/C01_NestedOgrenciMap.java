package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedOgrenciMap {
    public static void main(String[] args) {

        Map<Integer,Map<String,String >> ogrenciMap= new HashMap<>();


        Map<String ,String> ogrenci101=new HashMap<>();
        ogrenci101.put("Isim","Ali");
        ogrenci101.put("Soyisim","Can");
        ogrenci101.put("Sinif","11");
        ogrenci101.put("Sube","H");
        ogrenci101.put("Bolum","MF");
        ogrenci101.put("Okul","Yildiz");

        Map<String ,String> ogrenci102=new HashMap<>();
        ogrenci102.put("Isim","Veli");
        ogrenci102.put("Soyisim","Cem");
        ogrenci102.put("Sinif","10");
        ogrenci102.put("Sube","K");
        ogrenci102.put("Bolum","TM");

        Map<String ,String> ogrenci103=new HashMap<>();
        ogrenci103.put("Isim","Ali");
        ogrenci103.put("Soyisim","Cem");
        ogrenci103.put("Sinif","11");
        ogrenci103.put("Sube","K");
        ogrenci103.put("Bolum","TM");
        ogrenci103.put("Sehir", "Ankara");

        ogrenciMap.put(101,ogrenci101);
        ogrenciMap.put(102,ogrenci102);
        ogrenciMap.put(103,ogrenci103);

        System.out.println(ogrenciMap);

        /*
        {101={Bolum=MF, Soyisim=Can, Sube=H, Sinif=11, Isim=Ali},
        102={Bolum=TM, Soyisim=Cem, Sube=K, Sinif=10, Isim=Veli},
        103={Bolum=TM, Soyisim=Cem, Sube=K, Sinif=11, Isim=Ali}}
         */


        // 101 numarali ogrencinin ismini yazdiralim

        System.out.println(ogrenciMap.get(101).get("Isim")); // Ali
        System.out.println(ogrenciMap.get(103).get("Soyisim")); //Cem
        System.out.println(ogrenciMap.get(101).get("Okul"));
        System.out.println(ogrenciMap.get(103).get("Sehir"));

        Set<Map.Entry<Integer,Map<String,String>>> ogrenciEntrySeti=ogrenciMap.entrySet();

        for (Map.Entry<Integer,Map<String,String>> eachOgrenciEntry:ogrenciEntrySeti
             ) {
            if (eachOgrenciEntry.getKey()==103){
                Map<String,String> eachOgrenciValueMap=eachOgrenciEntry.getValue();
                eachOgrenciValueMap.put("Sinif","12");
                eachOgrenciEntry.getKey();
            }
        }
        System.out.println(ogrenciMap);

    }
}
