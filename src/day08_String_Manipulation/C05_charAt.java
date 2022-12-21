package day08_String_Manipulation;

public class C05_charAt {
    public static void main(String[] args) {

        String str= "Java guzeldir"; // 13 tane karekter barindirir

        // java'da index 0'dan baslar
        // J==> 0.index, r==>12
        // charAt(index) ile istedigimiz index'deki char'a ulasabiliriz


        // ilk 'a' yi yazdiralim

        System.out.println(str.charAt(1)); // index 0 dan baslar!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     // sondan 2. karekteri yazdiralim

        System.out.println(str.charAt(13-2));

        //sondan 4. karekteri buyuk harf olarak yazdiralim

        System.out.println(str.toLowerCase().charAt(13-4));

        //System.out.println(str.charAt(18)); // eger index olarak karekter sayisi yada daha buyuk deger girersek ,
        // o indexi bulamayacagi icin hata verir

    }
}
