package day05_ifstatements;

import java.util.Scanner;

public class C04_ifstatements {
    public static void main(String[] args) {

        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun

        Scanner scan= new Scanner(System.in);
        System.out.println(" lutfen yazdirmak istediginiz ayin ilk harfini giriniz: ");
        char ilkharf=scan.next().charAt(0);

        if (ilkharf=='o') {
            System.out.println(" Ocak");}
        if (ilkharf=='s') {
            System.out.println(" Subat");}
        if (ilkharf=='m') {
            System.out.println(" Mart veya Mayis");}
        if (ilkharf=='n') {
            System.out.println(" Nisan");}

        if (ilkharf=='h') {
            System.out.println(" Haziran");}
        if (ilkharf=='t') {
            System.out.println(" Temmuz");}
        if (ilkharf=='a') {
            System.out.println(" Agustos veya Aralik");}
        if (ilkharf=='e') {
            System.out.println(" Eylul veya Ekim");}
        if (ilkharf=='k') {
            System.out.println(" Kasim");}





    }
}
