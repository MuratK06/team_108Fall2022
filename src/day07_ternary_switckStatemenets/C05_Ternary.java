package day07_ternary_switckStatemenets;

public class C05_Ternary {
    public static void main(String[] args) {




        //int sayi=2;

        //System.out.println(sayi>10 ? "buyuk sayi" : sayi+2);

       // int b=sayi>10 ? "buyuk sayi" : sayi+2; // int a String atanamaz

       // String c=sayi>10 ? "buyuk sayi" : sayi+2; // String e int atanamaz

        /*
           Ternary isleminin sonucunu yazdiracaksak
            boolean sartin true veya false olmasi durumunda yazdiracagimiz datalar farkli data turunde olabilir
           Ancak atama yapacaksak
           true veya false olmasi durumunda alacagi degerler
           atayacagim variable'in data turune uygun olmalidir
         */
        int sayi= 2;
        System.out.println(sayi>10 ? "buyuk sayi" : sayi+2);
        // int b = sayi>10 ? "buyuk sayi" : sayi+2;
        // String c= sayi>10 ? "buyuk sayi" : sayi+2; String int atanamaz
    }
}
