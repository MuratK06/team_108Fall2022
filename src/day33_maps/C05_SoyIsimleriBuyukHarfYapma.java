package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyIsimleriBuyukHarfYapma {
    public static void main(String[] args) {

        // Mp deki soyisimleri buyuk harfe ceviren bi rmethod olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);




    }
}
