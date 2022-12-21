package day13_MethodOverloadind_whileLoop;

public class C02_MethodOverloading {
    public static void main(String[] args) {

        String str="Java cok guzel";

        System.out.println(str.substring(5));

        System.out.println(str.substring(3, 5));

        // eger sectigimiz isimde birden fazla method varsa buna Overloading denir.
        //ve ayni isimdeki isimdeki metodlarin hangisinin calsisacagina argument/parametre uyumu karar verir

        toplama(5,6);
        toplama(6,3,8);
        toplama(5.5,6);



    }

/*
           java ayni class icerisinde ayni isim
           ve ayni data turunden parametre sayisi ile 2 method olusturmaniza izin vermez
           1- ismini degistirebiliriz, ancak bu durumda overloading olmaz
              overloading ayni isimde ama farkli isleve sahip methodlar olusturmak demektir
           2- parametre sayisini degistirebiliriz
           3- ayni sayida parametre yazip, parametrelerin data turunu degistirebiliriz
              veya farkli data turundeki parametrelerin yerini degistirebiliriz
         */



    public static void toplama(int sayi1, int sayi2){
        System.out.println("2 tam sayinin toplami: "+(sayi1+sayi2));
    }

    public static void toplama(int sayi1,int sayi2,int sayi3){ //2. madde

        System.out.println("3 tam sayinin toplami: "+(sayi1+sayi2+sayi3));
    }

    public static void toplama(double sayi1,int sayi2){ //3. maadee

        System.out.println("double ve int toplami: "+(sayi1+sayi2));
    }

    public static void toplama(int sayi2 ,double sayi1){ //3. madde

        System.out.println("int ve double toplami: "+(sayi1+sayi2));

    }

    public static void toplama(double sayi1,double sayi2){ //

        System.out.println("2 double sayinin toplami: "+(sayi1+sayi2));
    }
}
