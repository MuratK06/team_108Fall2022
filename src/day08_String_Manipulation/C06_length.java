package day08_String_Manipulation;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

        String str="Java her gecen gun daha da guzellesiyor, degil mi?";

        //sondan 3. karekteri yazdirin

        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-3));

        // rastgele bir karekterini yazdiralim

        Random rnd= new Random();  // rnd degeri icin 0 ile 1 arasinda rastgele bir deger olusturur
        int index= rnd.nextInt(str.length()); // str.length()'den kucuk rastgele bir int uretir

        System.out.println(str.charAt(index));
    }
}
