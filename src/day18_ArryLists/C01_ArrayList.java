package day18_ArryLists;

import day16_Arrays.C10_ArreyebirElementEkleme;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {

        String [] arr= {"A", "B", "T"};

        //( bu arreye element olarak C eklemek istersek

        C10_ArreyebirElementEkleme.arrayeElementEkleme(arr,"C");

        System.out.println(Arrays.toString(arr));
        // ArrayList esnek uzunluktaki bir array'dir
        // Ancak ArrayList, array altyapisini kullandigindan
        // elementleri sadece tek tek ekleyebiliriz



        List<String> harfler=new ArrayList<>();
        System.out.println(harfler);
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("K");

        System.out.println(harfler);

        harfler.add(1,"Murat");

        System.out.println(harfler);
        harfler.add(2,"Korkmaz");
        System.out.println(harfler);


        List<String> karekterler=new ArrayList<>();
        karekterler.add("*"); // araya element ekeme
        karekterler.add("#");

        harfler.addAll(karekterler);
        System.out.println(harfler);
        harfler.addAll(1,karekterler);
        System.out.println(harfler);

        karekterler.add("+");
        karekterler.add("*");

        harfler.addAll(karekterler);
        System.out.println(harfler);



    }
}
