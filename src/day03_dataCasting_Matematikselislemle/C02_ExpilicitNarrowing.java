package day03_dataCasting_Matematikselislemle;

public class C02_ExpilicitNarrowing {
    public static void main(String[] args) {
        double dbl=23.5;
        int sayi= (int)dbl;
        System.out.println(sayi);
        byte byt= (byte)sayi;
        System.out.println(byt);
        sayi=130;
        byt=(byte) sayi;
        System.out.println("int 130 'un byte hali: "+byt);
        sayi=1500;
        byt=(byte) sayi;
        System.out.println("int 1500 'un byte hali: "+byt);







    }
}
