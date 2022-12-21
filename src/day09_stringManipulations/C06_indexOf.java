package day09_stringManipulations;


import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {

        // kullanicidan aldimiz cumlede cok ile baslayan ilk kelimeyi yazdirin
        // cumlede cok yoksa "cumlede cok ile baslayan kelime yok " yazdirir


        // Sinavlarimizda cokdan secmeli sorular kullaniyoruz
        // javayi cok seviyoruz
        // bu kadar coklu secenek olur mu ?


        Scanner scan=new Scanner(System.in);

        System.out.println("bir cumle giriniz");

        String girilencumle= scan.nextLine();

        if (!girilencumle.contains("cok")) {
            System.out.println("cumlede cok ile baslayan kelime yok");}
        else {
            int cokIndexi=girilencumle.indexOf("cok");
            int boslukIndexi=girilencumle.indexOf(" ",cokIndexi+1);

            System.out.println (girilencumle.substring(cokIndexi,boslukIndexi));}




    }
}
