package day11_ForLoops;

import java.util.Locale;

public class ornek2 {
    public static void main(String[] args) {


        //input olarak verilen bir stringde
        // indexi tek sayi olanlari buyuk harfle
        // indexi cift sayi olanallri kucuk harfle yazdirin
        // ornek: Java output: JaVa


        String input="Hayat guzeldir";

        for (int i = 0; i <input.length() ; i++) {

            System.out.print(i%2==0? input.substring(i,i+1).toLowerCase():input.substring(i,+i+1).toUpperCase());


        }
    }
}
