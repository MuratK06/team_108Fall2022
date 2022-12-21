package day13_MethodOverloadind_whileLoop;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {

//Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        System.out.println(ucgenkenarlari(3, 4, 5));
    }

    public static int ucgenkenarlari(int kenar1, int kenar2, int kenar3) {
        int ucgenkenarlari = 0;

        if (kenar1 == kenar2 && kenar1 == kenar3) {
            System.out.println("eskenar ucgen");
        } else if (kenar1 == kenar2 || kenar1 != kenar3) {
            System.out.println("ikiz kenar ucgen");

        } else {
            System.out.println(("ucgen ikiz kenar veya eskenar degil"));

        }
return ucgenkenarlari;

    }
}