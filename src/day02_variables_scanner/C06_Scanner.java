package day02_variables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // kullanicidan bir sayi isteyin
        // ve sayinin karesini isteyin

        Scanner scan = new Scanner(System.in);
        System.out.println("karesini almak istediginiz sayiyi girin");
        double girilensayi= scan.nextDouble();

        System.out.println("girilensayinin karesi="  + girilensayi*girilensayi);
    }
}
