package day12_methodCreation;

public class C04_FaktoryelMethod {
    public static void main(String[] args) {


        // verilen bir sayinin 15'den kucuk bir pozitif tamsayi oldugunu kontrol edin
        // kucukse bir method olusturup, faktoryel degerini yazdirin
        // sayi istenen aralikta degilse uyari yazdirin

        int input=13;

        if (input>0 && input<15) {
            faktoryelyazdir(input);
        }else {
            System.out.println("girilen sayi 15 ' den kucuk pozitif tam sayi olamlidir");

        }


    }

    public  static void faktoryelyazdir(int sayi){

        int faktoryelsonucu=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryelsonucu*=i;

        }
        System.out.println("girilen "+sayi + " icin faktoryel: "+faktoryelsonucu);
    }
}
