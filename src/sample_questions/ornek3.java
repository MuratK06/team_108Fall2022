package sample_questions;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {

        //Soru 3-)   SCANNER
        //Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
        //Ipuclari:
        //* Sayilarin ortalamasi: toplam/5

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 5 tane sayi giriniz: ");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        double sayi3= scan.nextDouble();
        double sayi4= scan.nextDouble();
        double sayi5= scan.nextDouble();

        double toplam= sayi1+sayi2+sayi3+sayi4+sayi5;

        System.out.println("Sayilarin Ortalamsi= "+ (toplam)/5);

    }
}
