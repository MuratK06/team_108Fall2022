package day30_interfaces_iterator;

public interface I01_Interface {


    // INterface = Arayuz



    // Interface'lerde tum method'lar public ve abstract'tir.
    // Interface'lerde tum variable'lar public, static ve final'dir.
    // final oldugundan sonradan deger atamak mumkun olmaz, olustururken deger ATANMALIDIR



    /*
        Bir interface'e sonradan bir method eklemek istedigimizde
        o interface'i daha once implement eden tum class'lar
        yeni eklenen method'u implement etmek zorunda olur.
        Java'ya yapilan talepler sonucunda
        Java8 ile birlikte bu konuda bir istisna getirilmistir
        Eger sonradan eklenen method'un tum eski class'lar tarafindan implement edilme mecburiyeti
        olmasin istiyorsaniz
        yeni olusturdugunuz method'a DEFAULT veya STATIC keyword ekleyip
        body de olusturursaniz
        o zaman bu method'un child class'lar tarafindan
        implement edilme MECBURIYETI OLMAZ
     */

    int say=100;

    public  static final String okulismi="Yildiz koleji";

    void method1();

    int method2();
    String method3();

    public abstract void method44();


}
