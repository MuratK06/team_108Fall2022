package day07_ternary_switckStatemenets;

public class C03_Ternary {
    public static void main(String[] args) {

        // input olarak verieln sayiyi kontrol edip
        // sayi cift ise; "cift sayi"
        // degilse; "tek sayi" yazdirin

        int input=34;

        // if else ile yapalim

        if (input%2==0){
            System.out.println("cift sayi");  }
        else {
            System.out.println(" tek sayi");}

            // ternary ile yapalim

            System.out.println(input%2==0 ?"cift sayi" : "tek sayi");


    }
}
