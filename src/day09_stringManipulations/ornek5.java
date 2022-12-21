package day09_stringManipulations;

import java.util.Scanner;

public class ornek5 {
    public static void main(String[] args) {

        //: Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        //icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.

        Scanner scan=new Scanner(System.in);

        String str="gelsin hayat bildigi gibi gelsin";
        System.out.println("lutfen cumle giriniz");
        String girilencumle= scan.nextLine();

        System.out.println(str.contains("girilencumle"));















    }
}
