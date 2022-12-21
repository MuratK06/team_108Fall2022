package sample_questions;

import java.util.Scanner;

public class ornek19 {
    public static void main(String[] args) {

        /*Soru 19-)
        Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
                ipucu:
        Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.


*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Dogum ayinizi ay adi olarak giriniz: ");
        String ay = scan.nextLine();
        System.out.println("Dogum gununuzu rakam olarak giriniz: ");
        int gun = scan.nextInt();


        System.out.println("Burcunuz: "+ burc(ay, gun));


    }

    private static String burc(String ay, int gun) {
        String burc = "";

        switch (ay) {
            case "ocak":
                burc = gun >= 21 ? "kova" : "oglak";
                break;
            case "subat":
                burc = gun >= 21 ? "balik" : "kova";
                break;
            case "mart":
                burc = gun >= 21 ? "koc" : "balik";
                break;
            case "nisan":
                burc = gun >= 21 ? "boga" : "koc";
                break;
            case "mayis":
                burc = gun >= 21 ? "ikizler" : "boga";
                break;
            case "haziran":
                burc = gun >= 21 ? "yengec" : "ikizler";
                break;
            case "temmuz":
                burc = gun >= 21 ? "aslan" : "yengec";
                break;
            case "agustos":
                burc = gun >= 21 ? "basak" : "aslan";
                break;
            case "eylul":
                burc = gun >= 21 ? "terazi" : "basak";
                break;
            case "ekim":
                burc = gun >= 21 ? "akrep" : "terazi";
                break;
            case "kasim":
                burc = gun >= 21 ? "yay" : "akrep";
                break;
            case "aralik":
                burc = gun >= 21 ? "oglak" : "yay";
                break;
            default:
                System.out.println("Yalnis ay girisi yaptiniz");
        }
        return burc;


    }





    }



