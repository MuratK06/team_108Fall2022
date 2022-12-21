package day07_ternary_switckStatemenets;

public class C04_ternary {
    public static void main(String[] args) {

        // kullanicidan alinan deger
        // 100' den buyukse ; sayiyi 2 ile carpin
        // 100 ' e esit veya  kucuk ise sayiya 10 ekleyin

        int input=45;


        if (input>100) {input*=2;}
            else {input+=10;}
        System.out.println("if_ else ile:"+input);


            input=45;

            input=input>100 ?input*2 : input+10;

        System.out.println("ternary ile" + input);


        /* verielen input u inceleyin eger 100 ' den buyukse, bunu 5 ' e bolup , bolumun tek sayi olup
        olmadigini kontrol edin
        eger 100 ' den buyuk degilse , 10 ile bolumunden kalani bulup , bu kalani 5 artirin


        bu tur kompleks islemleri ternary ile yapmayiz
         */



    }
}
