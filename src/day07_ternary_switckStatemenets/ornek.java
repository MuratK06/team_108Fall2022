package day07_ternary_switckStatemenets;

public class ornek {
    public static void main(String[] args) {

        //kullanicidan iki sayi alin ve
        //        // kullaniciya istedigi islemi sorun
        //        // +,-,*,/ isaretlerinden hangisini girerse
        //        // iki sayi icin o islemi yapin
        //        // bu isaretlerden birisini girmezse
        //        // yalnis islem yazdirin


        int sayi1= 10;
        int sayi2=5;
        char islem='+';

        switch (islem) {
            case '+':
                System.out.println("sayilarin toplami:" + (sayi1+sayi2));break;
            case '-':
                System.out.println("sayilarin farki:" + (sayi1-sayi2));break;
            case '*':
                System.out.println("sayilarin carpimi:" + (sayi1*sayi2));break;
            case '/':
                System.out.println("sayilarin bolumu:" + (sayi1/sayi2));break;
            default:
                System.out.println("gecersiz islem");

        }
    }
}
