package day08_String_Manipulation;

import java.util.Scanner;

public class C01_String_Manipulation {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var” seklinde
        // hafta sonu tatiline kac gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin



        /*
           string ifadeler case sensitive'dir
           kullanicinin Pazar, PAzar, PazaR, PAZAR ... gibi 32 farkli sekilde yazma ihtimali goz onunde bulundurulur

           kullanicinin girdigi degeri degistirmek tercih edilmez. bunun yerine kullanicinin girdigi
           degeri degistiri yeni bir variable a atama yapar ve kodlarimizda yeni varieble i kullaniriz.
           konsola yazdirdigimiz zaman , istersek kullanicin girdigi orginal metni yazdirirriz.
           istersek de bizim cevirdigimiz hali yazdiririz

         */




        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen gun ismini gririniz: ");
        String girilengun= scan.next();
        String kullanilacakgun=girilengun.toLowerCase();


        switch (kullanilacakgun){
            case "pazartesi":
                System.out.println(girilengun +" calisma zamani , tatile 5 gun var");break;
            case "sali":
                System.out.println(girilengun +" calisma zamani , tatile 4 gun var");break;
            case "carsamba":
                System.out.println(girilengun +" calisma zamani , tatile 3 gun var");break;
            case "persembe":
                System.out.println(girilengun +" calisma zamani , tatile 2 gun var");break;
            case "cuma":
                System.out.println(girilengun +" calisma zamani , tatile 1 gun var");break;
            case "cumartesi":

            case "pazar":
                System.out.println(girilengun +" simdi dinlenme vakti");break;
            default:
                System.out.println("hataligun");

        }
    }
}
