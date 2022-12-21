package day23_dataTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        // verilen 2 sayiyi toplayip yazdiran bir method olusturun
        topla(5,8); // 13
        topla(5,7,3); // 15
        topla(8,3,2); // 13
        topla(7,3,4,6); // 20
        topla(2,6,5,1,8,2);
    }

    private static void topla(int i, int i1, int i2, int i3, int i4, int i5) {
        System.out.println("6 sayinin toplami: " +(i+i1+i2+i3+i4+i5));
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }
    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("Uc sayinin toplami : " + (sayi1+sayi2+sayi3));
    }
    private static void topla(int sayi1, int sayi2) {
        System.out.println("Iki sayinin toplami : " + (sayi1+sayi2));
    }
}
