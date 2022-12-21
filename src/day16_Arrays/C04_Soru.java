package day16_Arrays;

import java.util.Arrays;

public class C04_Soru {
    public static void main(String[] args) {

        //verilen bir String arrayde
        // istenen bir harfi iceren kelimelri silip, yerine null yazdirin


        String[] isimler= {"Huseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekharf= "u"; // istenen harf

        for (int i = 0;  i< isimler.length;i++) {

            if (isimler[i].contains(silinecekharf)){
                isimler [i]=null;

            }

        }
        System.out.println(Arrays.toString(isimler));
    }
}
