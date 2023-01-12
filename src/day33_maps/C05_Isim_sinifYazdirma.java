package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_Isim_sinifYazdirma {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.SinifYazdir(ogrenciMap,"11");
    }
}
