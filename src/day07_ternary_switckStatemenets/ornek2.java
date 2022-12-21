package day07_ternary_switckStatemenets;

public class ornek2 {
    public static void main(String[] args) {

        // input olarak verieln sayiyi kontrol edip
        // sayi cift ise; "cift sayi"
        // degilse; "tek sayi" yazdirin


        int sayi=70;

        // if else ile yapalim

        if (sayi%2==0) System.out.println("sayi cift");
        else System.out.println(" sayi tek");

        // termary ile yapalim

        System.out.println(sayi%2==0  ? "sayi cift" : "sayi tek")  ;
    }
}
