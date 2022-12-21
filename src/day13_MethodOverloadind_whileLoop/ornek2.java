package day13_MethodOverloadind_whileLoop;

public class ornek2 {

    public static void main(String[] args) {


        ////Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin



        int sayi1 = 5;
        int sayi2 = 10;
        double toplam = 0;
        //toplama(9, 15);

        System.out.println(toplama(8, 11));


    }

    public static double toplama(int baslangic, double bitis) {
       // double toplama=0;

        double toplam = 0;
        if (bitis < baslangic) {
            System.out.println("baslangic degeri bitis degerinden kucuk olmali");
        }
        else {
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;

            }


        }

        return toplam;

    }


}
