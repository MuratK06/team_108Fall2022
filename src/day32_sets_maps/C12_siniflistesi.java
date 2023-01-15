package day32_sets_maps;

import java.util.Map;

public class C12_siniflistesi {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.siniflistesiyazdir(ogrenciMap,"11");
    }
}
