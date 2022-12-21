package day18_ArryLists;

import java.util.ArrayList;
import java.util.List;

public class C05_contains {
    public static void main(String[] args) {

        int [] arr={4,3,6,3,7,6,5,9,4,2,5,7,7,7};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);
        System.out.println();
    }
}
