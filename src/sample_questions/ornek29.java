package sample_questions;

public class ornek29 {
    public static void main(String[] args) {

        //Soru29-)
        //1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
        //İpucu: Loop kulanabilirsiniz

        int sayi=1;

        System.out.println("Sayilarin toplami: "+sayilarintoplami(sayi));


    }
    public static Integer sayilarintoplami(int sayi){

        int toplam=1;

        for (int i = 1; i <100 ; i++) {

            toplam+=i;


        }

        return toplam;
    }
}
