package day16_Arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {

        //verielen bir Arrayi Natural Order a siralayip yazdirin

        String[] isimler={"Huseyin","Yusuf", "Mehmet", "Akile", "Said", "Mahmut", "ahmet","adnan"};

        System.out.println(Arrays.toString(isimler));
        Arrays.sort(isimler);//harflere gore siralama yapar
        System.out.println(Arrays.toString(isimler));

        // eger buyukten kucuge sirilamak istersek once sort kullanarak natural order a gore sirlar
        //sonra gecici bir array kullanarak siralamayi terse ceviririz


    }
}
