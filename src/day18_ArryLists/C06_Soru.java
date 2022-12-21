package day18_ArryLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Soru {
    public static void main(String[] args) {

        // verilen bir arreydeki tekrar eden elementleri silip
        //array i unique degerlerden olusan bir array haline getirin

        int [] arr= {4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};

        List<Integer> benzersizElementlerList=new ArrayList<>();
        
        // arraydeki tum elementleri alip listede varmi diye kontrol edelim ve olmayanlari ekleyelim

        for (int i = 0; i < arr.length ; i++) {
            if (!benzersizElementlerList.contains(arr[i])){

                benzersizElementlerList.add(arr[i]);

            }
            
        }
        System.out.println(benzersizElementlerList);

        arr=new int[benzersizElementlerList.size()];

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=benzersizElementlerList.get(i);

        }
        System.out.println("Arrayin son hali: "+ Arrays.toString(arr));
    }
}
