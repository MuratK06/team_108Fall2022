package day16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {

        // Kullanıcıdan yeni isimler alıp, var olan bir array'e ekleyen bir method oluşturun.
        //Kullanıcı yeni değer verdiği müddetçe, C10'daki methodu kullanarak eklemeye devam edin,
        // kullanıcı Q'ya bastığında array'in son halini döndürün.


        Scanner scan=new Scanner(System.in);
        String[] mevcut={"Tugba","Murat","Vedat","Busra"};
        String eklenecekIsim= scan.nextLine();
        mevcut=arrayeElementEkleme(mevcut,eklenecekIsim);
        System.out.println(Arrays.toString(mevcut));
        

    }

    public static String[] arrayeElementEkleme(String[] eklenilecekArray, String eklenecekElement) {
        String[] temp = new String[eklenilecekArray.length + 1];
        for (int i = 0; i < eklenilecekArray.length; i++) {
            temp[i] = eklenilecekArray[i];
        }
        temp[temp.length - 1] = eklenecekElement;
        return temp;
    }
}
