package day07_ternary_switckStatemenets;

public class C10_SwitchStatemenets {
    public static void main(String[] args) {

        // Kullanicidan gun numarasini alip
        // gun ismini yazdirin


        int gunno=5;
        switch  (gunno) {
            case  1:
                System.out.println("pazartesi"); break;
            case  2:
                System.out.println("sali");break;
            case  3:
                System.out.println("carsamba");break;
            case  4:
                System.out.println("persembe");break;
            case  5:
                System.out.println("cuma");break;
            case  6:
                System.out.println("c.tesi");break;
            case  7:
                System.out.println("pazar");break;
            default:
                System.out.println("gun sayisi gecersiz");

        }
    }
}
