package day19_arrayList_forEachloop;

import java.util.ArrayList;
import java.util.List;

public class C08_Constructor {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        // sayilar arraysölist class dan olusturdugumuz bir objedir
        // ve olusturuldugu class daki tum ozelliklere (method ve variable lar) sahiptir


        /*
            Bir class'dan bir obje olusturdugumuzda
            o class'daki tum instance variable'larin bir kopyasi olusturulup
            objemizle iliskilendirilir
            ayrica o class'da bulunan tum method'lar da objemizle ilisiklendirilir
            Bu islemleri saglayan java yapisi CONSTRUCTOR'dir
            bu isleme de initialize (ilk deger atamasi) denir
            new keyword ile obje olusturulurken
            esitligin saginda new ile birlikte classIsmi() yazilir
            iste bu classIsmi() o class'in constructor'idir
            constructor, bugune kadar gordugumuz yapilardan farklidir
            Constructor, bir obje olusturmak istedigimizde devreye girer
            ve ilgili sinifin tum ozelliklerini obje ile ilisiklendirir (initialize)
         */

    }
}
