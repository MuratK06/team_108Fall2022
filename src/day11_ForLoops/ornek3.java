package day11_ForLoops;

public class ornek3 {
    public static void main(String[] args) {

        // input olarak verilen biir tam sayinin
        //asal sayi olup olmadigini yazdirin

        int input=29;

        String sonuc="Sayi asal";

        for (int i = 2; i <input ; i++) {
            if (input%i==0) {
                sonuc="Sayi asal degil";
                break;
            }

        }
        System.out.println(sonuc);



    }
}
