package day18_ArryLists;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler.remove("Z"));
        // true  Z'yi bulup siler ve gorevi tamamladigi icin true doner
        System.out.println(harfler);

        System.out.println(harfler.remove(0));
        // 0.index'deki elementi siler ve gorevi tamamlayip silinen elementi bize dondurur
        System.out.println(harfler);

        List<String> yenilist=new ArrayList<>();

        yenilist.add("C");
        yenilist.add("D");
        yenilist.add("T");

        System.out.println(yenilist.removeAll(harfler));

        // harfler listesindeki tum elementleri yeniList'den siler
        // gorevi tamamlarsa true, yoksa false doner

        System.out.println(yenilist);
        System.out.println(harfler);



    }
}
