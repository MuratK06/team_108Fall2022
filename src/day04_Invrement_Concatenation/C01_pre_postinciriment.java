package day04_Invrement_Concatenation;

public class C01_pre_postinciriment {
    public static void main(String[] args) {
        int sayi=20;
        //sayiyi 3 artirin

        // 1. yontem
        sayi=sayi+3;
        //2. yontem
        sayi +=3;
        // 3. yontem
        sayi++;
        sayi++;
        sayi++;


        System.out.println(sayi);

        // 2 azaltin
        sayi=sayi-2;
        sayi-=2;
        System.out.println(sayi);


        sayi=10;
        // sayinin degerini once 1 aertirin sonra yazdirin
        sayi--;
        System.out.println(sayi);


        sayi=10;
        // sayiyi once yazdirin , sonra 1 artirin
        System.out.println(sayi);
        sayi--;
        System.out.println(sayi);

        sayi=10;
        System.out.println(sayi++);
        // java ayni satirda iki islem oldugundan siralama yapar.
        // eger ++ variableden sonra ise artirma islemini sonra yapar
        // bu durumda once yazdirma sonra artirma yapar
        System.out.println(sayi);

        sayi=10;
        System.out.println("son:" +(++sayi));
        //++ variebleden once ise artirma islemini once yapar
        //bu durumda java once artirma sonra yazdirma yapar


        sayi++; // sayiyi 1 artirir
        ++sayi; // sayiyi 1 artirir




    }
}
