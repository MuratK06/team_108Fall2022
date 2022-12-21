package sample_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ornek37 {
    public static void main(String[] args) {

         /*Soru 37-)
        --BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
                (Eliminate duplicates)
        ENG:
        Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
        Write a test program that reads in ten integers, invokes the method, and displays the result.
        (Tekrarlananları çıkar)
        TÜR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
                On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
                ---->>>
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5*/

        Integer [] list= {1,2,3,2,1,6,3,4,5,2};

        List<Integer> yeniList= Arrays.asList(list);

        System.out.println("bir birinden farkli girilen sayilar: ");

        System.out.println(eliminateDuplicates(yeniList));
    }

    public static ArrayList<Integer> eliminateDuplicates(List<Integer> list) {
        ArrayList<Integer> yeniList = new ArrayList<>();
        for (Integer each : list) {
            if (!yeniList.contains(each)) {
                yeniList.add(each);
            }
        }
        return yeniList;
    }
}
