package day30_interfaces_iterator;

public class M01_Child0finterface implements I01_Interface,I02_Interface{

    // Bir class baska bir class'i extends keyword ile parent edinebilir
    // Ancak birden fazla class'i parent EDINEMEZ
    // Interface'ler icin boyle bir sinirlama yoktur
    // Bir class istedigi kadar Interface'i implement edebilir

    @Override
    public void method1() {
        // I01_Interface.SAYI=25;
        // Cannot assign a value to final variable 'SAYI'

        // Interface'de olusturulan static veya default olarak isaretlenen method'larin farki
        // static olana interfaceIsmi.staticMethodIsmi seklinde ulasabilirken
        // default olana child class'dan olusturulacak obje uzerinden erisilebilir.


        // Eger birden fazla interface implement edildiginde
        // Ayni isimde method'lar farkli Interface'lerde varsa
        // return type'a bakilir.
        // return type ayni ise sorun olmaz, cunku ikisini de implement edebiliriz
        // ancak return type'lari farkli ise birini tercih ettigimizde digeri CTE verir
        // Bu durumda parent interface'lere mudahale etmek mumkunse mudahale edilebilir
        // veya bu interface'lerden birini implement etmekten vazgecebiliriz

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method44() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }

    public static void main(String[] args) {

    }
}
