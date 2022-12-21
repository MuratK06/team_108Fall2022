package day07_ternary_switckStatemenets;

public class ornek8 {
    public static void main(String[] args) {
        //Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        int gunno= 7;

        switch (gunno){
            case 1:
                System.out.println("h.ici");break;
            case 2:
                System.out.println("h.ici");break;
            case 3:
                System.out.println("h.ici");break;
            case 4:
                System.out.println("h.ici");break;
            case 5:
                System.out.println("h.ici");break;
            case 6:
                System.out.println("h.sonu");break;
            case 7:
                System.out.println("h.sonu");break;
            default:
                System.out.println("yalnis gunno");}

        if (gunno>=1 && gunno<=5) System.out.println("h.ici");
        else if (gunno>5 && gunno<8)
            System.out.println("h.sonu");
        else System.out.println("gecersiz gunno");





    }
}
