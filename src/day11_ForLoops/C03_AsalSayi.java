package day11_ForLoops;

public class C03_AsalSayi {
    public static void main(String[] args) {

        // input olarak verilen biir tam sayinin
        //asal sayi olup olmadigini yazdirin


        int input=29;
        String sonuc="Sayi asal";

        for (int i=2; i<input;i++) {
            if (input%i==0) {
                sonuc="Sayi asal degil";
                break; // java bir Loop' un icerisinde  'break' gorurse o Loop 'u bitirir
            }
        }

        System.out.println(sonuc);

    }
}
