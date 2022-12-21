package day16_Arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {

        //  binary tree javanin kullandigi ozel bir siralama yontemidir
        //binarySearch method binaryTree ozelligini lullandigindan
        // sirali olmayan arreylerde dogru sonuc dondurmeyebilir
        //eger binarySearch() kullanilacaksa
        // oncxesinden MUTLAKA sort() kullanilmalidir

        int[] arr={2,6,9,3,15,1,7};

        Arrays.binarySearch(arr,15);



        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));




    }
}
