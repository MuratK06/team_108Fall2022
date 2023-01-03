package day27_Overriding;

public class CAvciKuslar extends BKuslar {

    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        CAvciKuslar krt1=new CAvciKuslar(); //krt=kartal

        krt1.hareket();// CAvcikuslar classiindan alir ucarlar
        krt1.beslenme();//CAvcikuslar classiindan alir et yerler
        krt1.pence();//CAvcikuslar classiindan alir pencelidir
        krt1.gaga();//CAvcikuslar classiindan alir sivri gagali

        krt1.kanat();//Bkuslar classiindan alir kanatlidirlar
        krt1.solunum();//Bkuslar classiindan alir akcigerle nefes alirlarc
        krt1.cogalma();//Bkuslar classiindan alir yumurtayla cogalirlar
        krt1.omur();//AHayvanlar classiindan alir yasar ve olurler

        // eger construktor ile data turu ayni ise ozelligin variable veya method olunmasina bakilmaksizin o classa gidilir ,
        // o class veya parement class larda bulunan ILK DEGER kullanilir

        BKuslar krt2= new CAvciKuslar();

        krt2.hareket();// CAvcikuslar classiindan alir ucarlar
        krt2.beslenme();//CAvcikuslar classiindan alir et yerler
        //krt2.pence();//BKuslar veya parent classda yok , CTE verir
        krt2.gaga();//CAvcikuslar classiindan alir sivri gagali

        krt2.kanat();//Bkuslar classiindan alir kanatlidirlar
        krt2.solunum();//Bkuslar classiindan alir akcigerle nefes alirlarc
        krt2.cogalma();//Bkuslar classiindan alir yumurtayla cogalirlar
        krt2.omur();//AHayvanlar classiindan alir yasar ve olurler

        AHayvanlar krt3=new CAvciKuslar();

        krt3.hareket();// CAvcikuslar classiindan alir ucarlar
        krt3.beslenme();//CAvcikuslar classiindan alir et yerler
       // krt3.pence();//AHayvanlar Classinda yok. CTE verir
       // krt3.gaga();//CAHayvanlar Classinda yok. CTE verir

        //krt3.kanat();//AHayvanlar Classinda yok. CTE verir
        krt3.solunum();//Bkuslar classiindan alir akcigerle nefes alirlarc
        krt3.cogalma();//Bkuslar classiindan alir yumurtayla cogalirlar
        krt3.omur();//AHayvanlar classiindan alir yasar ve olurler
    }
}
