package day06_ifelsestatemenets;

import java.util.Scanner;

public class C04_ifelsestatemenets {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karekter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='A' && krk<='Z'){
            System.out.println("girilen karekter buyuk");}
        else {
            System.out.println("girilen karekter buyuk degil");}

    }
}
