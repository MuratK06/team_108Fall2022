package day07_ternary_switckStatemenets;

public class C07_sorular {
    public static void main(String[] args) {
        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.


        int input=54;

        System.out.println(input>=50 ? "sinifi gectin" : "malesef kaldin");


        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        //harf olarak yazdirin, yoksa girilen harfi yazdirin

        char krk='c';

        System.out.println(krk>='a' && krk<='z' ? (char)(krk-32) :krk);


        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        input=15;

        //       |5|=>5


        System.out.println(input>0 ? input : (-1)*input);
    }
}
