package day11_ForLoops;

import java.util.Scanner;

public class C01_forLoop {
    public static void main(String[] args) {

        // kullanicidan bir char alip o karekterden sonra gelen 10 karekteri yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karekter giriniz");

        char krk=scan.next().charAt(0);

        for (int i=1; i<=10; i++) {

            System.out.println((char) (krk + i) + " ");
        }
    }
}
