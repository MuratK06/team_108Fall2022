package day07_ternary_switckStatemenets;

public class C12_SwitchStametements {
    public static void main(String[] args) {
        //Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin
        //I : International S : Software T : Testing Q : Qualifications B: Board

        char harf='S';

        switch (harf) {
            case 'I' :
            case 'i' :
                System.out.println("international"); break;
            case 'S':
            case 's':
                System.out.println("software");break;
            case 'T':
            case 't':
                System.out.println("testing");break;
            case 'Q':
            case 'q':
                System.out.println("Qualification");break;
            case 'B':
            case 'b':
                System.out.println("software");break;
            default:
                System.out.println("yalnis harf");

        }
    }
}
