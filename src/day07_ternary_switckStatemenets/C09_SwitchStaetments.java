package day07_ternary_switckStatemenets;

public class C09_SwitchStaetments {
    public static void main(String[] args) {

        //kullanicidan iki sayi alin ve
        // kullaniciya istedigi islemi sorun
        // +,-,*,/ isaretlerinden hangisini girerse
        // iki sayi icin o islemi yapin
        // bu isaretlerden birisini girmezse
        // yalnis islem yazdirin

        int sayi1=20;
        int sayi2=10;
        char islem= '+'; // islemi degistirdigimizde sonucta degisir

        // if else ile yapalim

        if (islem=='+') {
            System.out.println("sayilarin toplami: "+ (sayi1+sayi2));}
        else if (islem=='-') {
            System.out.println("sayilarin farki:" +(sayi1-sayi2));}
        else if (islem=='*') {
            System.out.println("sayilarin carpii:" +(sayi1*sayi2));}
        else if (islem=='/') {
            System.out.println("sayilarin bolumu:" +(sayi1/sayi2));}
        else  {
            System.out.println("yalnis islem tercihi");}

        System.out.println("********************************************************");


        //Switch stament ile yapalim

        switch (islem) {
            case '+':
                System.out.println("sayilarin toplami: "+ (sayi1+sayi2)); break;
            case '-':
                System.out.println("sayilarin farki: "+ (sayi1-sayi2)); break;
            case '*':
                System.out.println("sayilarin carpimi: "+ (sayi1*sayi2));break;
            case '/':
                System.out.println("sayilarin bolumu: "+ (sayi1/sayi2));break;
            default:
                System.out.println("yalnis islem tercihi");
        }

    }
}
