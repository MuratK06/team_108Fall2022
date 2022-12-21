package sample_questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ornek31 {
    public static void main(String[] args) {

        //Soru 31-)
        //Kullanıcıdan Arrayin uzunlugunu isteyin.
        //Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        //İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt




        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen liste uzunlugunu giriniz");
        int arrayUzunlugu= scan.nextInt();

        int[]kullaniciArrayi=new int[arrayUzunlugu];



        for (int i = 0; i <arrayUzunlugu ; i++) {
            System.out.println("listenin  " + (i+0)+ ". index degerini giriniz");
            int elementler =scan.nextInt();

            kullaniciArrayi[i]= elementler ;
        }
        System.out.println("Listenin son hali = " + Arrays.toString(kullaniciArrayi));









    }
}
