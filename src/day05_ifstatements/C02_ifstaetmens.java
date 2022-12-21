package day05_ifstatements;

import java.util.Scanner;

public class C02_ifstaetmens {
    public static void main(String[] args) {

        // kullanicidan bir sayi alip , pozitif ise , pozitif sayi
        // 100 ile 999 arsinda ise , pozitif uc basamakli sayi
        // 3 ile bolunebiliyorsa,  3 un kati
        // birler basamagi 7 ise , mukemmel
        // seceneklerinden uygun olanlari yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println(" Lutfen sayiyi giriniz: ");
        double sayi= scan.nextDouble();

        if ( 0<sayi ) {
            System.out.println("sayi: pozitif ");}

            if (100<=sayi && sayi<=999) {
                System.out.println("sayi: pozitif uc basamakli sayi");}

            if (sayi%3==0) {
                System.out.println("sayi: 3 un katlari");}

            if (sayi%10==7 || sayi%10==-7) {
                System.out.println("sayi: mukemmel");}


    }
}
