package day28_Exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {

        // kullanicidan iki tam sayi alip
        //sayilari birbirine bolup, sonucu yazdirin

        Scanner sc=new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();

        try {
            //1-try bolumu: yapmak istedigimiz ama exc. riski olusturan kodlar
            System.out.println("iki sayinin bolumu: "+ sayi1/sayi2);
        } catch (ArithmeticException e)
        //2- catch (): bekledigimiz muhtemel exception ve bu exc.  gerceklesirse hata dokumanini store edecegimiz variable
        {
            System.out.println("bolecek sayi 0 olamaz");
            e.printStackTrace();

            // 3- catch blogu: exception gerceklesirse calismasini istedigimiz kodlar burayi yazarken oncelile
            // exp/olustugunda kodlarin calismasi dursun mu? yoksa devam etsin mi?
            // karar vermeliyiz
        }
    }
}
