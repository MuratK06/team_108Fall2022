package day03_dataCasting_Matematikselislemle;

public class C07_Modulus {
    public static void main(String[] args) {
        // %= modulus bolme isleminde kalan sayiyi verir
        System.out.println("sonuc= " +15%4);
        System.out.println(45%4);
        int girilensayi=3426;
        int birlerbasamagi= 3426%10;
        System.out.println("birler basamagi= "+ birlerbasamagi);

        girilensayi= girilensayi/10;
        System.out.println(girilensayi);


    }
}
