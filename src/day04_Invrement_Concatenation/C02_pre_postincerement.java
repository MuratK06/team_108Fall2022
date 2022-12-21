package day04_Invrement_Concatenation;

public class C02_pre_postincerement {

    public static void main(String[] args) {
        int a= 10;
        int b=a++;
        int c=++a;
        System.out.println(a+ ","+b+ ","+c);

        int x= 20;
        int y= ++x;
        int z= y++;
        System.out.println(x+ ","+y+ ","+z);

        int k=30;
        System.out.println(k++); //30 once yazdirir
        System.out.println(++k); // 32 once artirir
        System.out.println(k++); // 32 once yazdirir
        System.out.println(k);  //33 son halini yazdirir

        int sayi1= 40;
        int sayi2= sayi1++;
        int sayi3= --sayi2;
        int sayi4= --sayi1;
        System.out.println(sayi1+ ","+sayi2+ ","+ sayi3+ ",");



    }}
