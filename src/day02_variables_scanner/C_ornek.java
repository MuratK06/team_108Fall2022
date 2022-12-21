package day02_variables_scanner;

import java.util.Scanner;

public class C_ornek {
    public static void main(String[] args) {
        // kulanicidan bir ucgenin iki kenarin uzunlugunu alip , hipotenusu hesaplatin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen uzun kenarin degerini giriniz");
        int uzunkenar= scan.nextInt();
        System.out.println("lutfen kisa kenarin degerini giriniz");
        int kisakenar= scan.nextInt();
        int hipotenus;
        hipotenus= (uzunkenar*uzunkenar)+(kisakenar*kisakenar);

        System.out.println("ucgenin hipotenusun uzunlugu: "+(hipotenus));
    }
}
