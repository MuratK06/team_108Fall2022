package day05_ifstatements;

import java.util.Scanner;

public class ornek5 {
    public static void main(String[] args) {

        // kullanicidan bir sayi alip , pozitif ise , pozitif sayi degilse negatif
        // 100 ile 999 arsinda ise , pozitif uc basamakli sayi
        // 5 ile bolunebiliyorsa,  5 un kati , degilse 5 e bolunemiyor yazdir
        // birler basamagi 4 ise , cift basmakli sayi
        // seceneklerinden uygun olanlari yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen sayiyi giriniz: ");
        double sayi= scan.nextDouble();

        if (sayi>=0 ){
            System.out.println("Sayi: Pozitif.");}else{
            System.out.println("Sayi: Negatif.");}

        if (sayi>=100 && sayi<=999){
            System.out.println("Sayi: Pozitif uc basamakli sayi.");}

        if (sayi%5==0){
            System.out.println("Sayi; 5' e bolunebiliyor.");}else {
            System.out.println("Sayi: 5' e bolunemez.");}

        if (sayi%10==4){
            System.out.println("Sayi: cift basmakli bir sayi.");}

    }
}
