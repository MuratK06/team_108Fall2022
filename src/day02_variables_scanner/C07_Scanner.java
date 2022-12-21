package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz: ");
        String girilenIsim= scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz: ");
        String girilenSoyisim= scan.nextLine();
        System.out.println("lutfen yasinizi giriniz: " );
        int girilenYas= scan.nextInt();
        System.out.println("isminiz: " +girilenIsim + "\nsoyisminiz :"+ girilenSoyisim+ "\nyasiniz: "+ girilenYas+ "\nkaydiniz basariyla yapilmistir.");

    }
}
