package day12_methodCreation;

import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {


        //kullanicidan iki sayi ve isledigi islemi alin (+-/*)
        //bir method olusturup sayialra istene islemi uyugulayip sonucu bize dondurun
        // kullanici islemi yalnis secmisse sifir dondurun

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("bir islem secin : +,-,/,*");
        char islem=scan.next().charAt(0);

        System.out.println(hesapmakinesi(sayi1, sayi2, islem));
    }
    public  static double hesapmakinesi(double sayi1, double sayi2, char islem) {

        switch (islem){
            case '+':
                return sayi1+sayi2;
            case '-':
                return sayi1-sayi2;
            case '/':
                return sayi1/sayi2;
            case '*':
                return sayi1*sayi2;
            default:
                return 0;
        }
    }
}
