package sample_questions;

import java.util.Arrays;

public class ornek33 {
    public static void main(String[] args) {

        //Soru 33-)
        //Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
        //Örnek:
        //String str=''Kodlama harika.''
        //String arr[]: ".etaerg si gnidoC"
        //İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

        String str="Kodlama harika";
        String[]ters=new String[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            ters[(str.length()-1)-i]=str.substring(i,i+1);
        }
        System.out.println(Arrays.toString(ters));
    }
}