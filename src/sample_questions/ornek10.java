package sample_questions;

import java.util.Scanner;

public class ornek10 {
    public static void main(String[] args) {


        //Soru 10-)  Klasik Soru :leichtes_lächeln:
        //                    Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
        //
        //                    **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) ***
        //                   Kullanıcıya aşağıdaki gibi mesaj verin:
        //
        //                    Eğer VKİ 18.5'ten az ise --> zayıfsınız
        //                    Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        //                    Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        //                    VKİ 30'a eşit veya daha fazlaysa --> obez
        //
        //                ÖRNEK :
        //
        //		 Ağırlık : 71
        //		 Yükseklik : 1,72
        //
        //		ÇIKTI :
        //
        //                 VKİ değeriniz : 23.99945916711736 Kilonuz ideal


        Scanner scan=new Scanner(System.in);
        System.out.println(" Lutfen kilonuzu giriniz: kg");
        double agirlik= scan.nextDouble();
        System.out.println(" Lutfen boyunuzu giriniz: m");
        double boy= scan.nextDouble();

        double vki=agirlik/(boy*boy);
        System.out.println("Vucut kitle Endeksiniz: "+vki+ " 'dir");

        if (vki>=30){
            System.out.println("Obezsiniz");
        } else if (25<=vki && vki<30) {
            System.out.println("Sismansiniz");
            
        }
        else if (18.5<=vki && vki<25) {
            System.out.println("Kilonuz idealdir");
        }
        else if (vki<18.5) {
            System.out.println("Zayifsiniz");
        }


    }
}
