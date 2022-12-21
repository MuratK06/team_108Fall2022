package day07_ternary_switckStatemenets;

public class ornek7 {
    public static void main(String[] args) {
        //kullanicidan hafta numarasini alip, yilin bitimine kac hafta kaldigini yazin
        int haftano=15;

        switch (haftano){
            case 1:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 2:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 3:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 4:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 5:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 6:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 7:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 8:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 9:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 10:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 11:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 12:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            case 13:
                System.out.println("yilin bitmesine kalan hafta= "+ ( 52-haftano));break;
            default:
                System.out.println("gecersiz haftano");}

        if (haftano>0 || haftano<53) System.out.println(" yilin bitimine kalan hafta = "+ (52-haftano));
        else System.out.println("gecersiz haftano");



    }
}
