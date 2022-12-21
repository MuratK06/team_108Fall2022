package day18_ArryLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Soru {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.


List<String> isimlerListesi=isimlistesiolustur();
        System.out.println(isimlerListesi);

    }

    public static List<String> isimlistesiolustur(){

        List<String> isimlistesi=new ArrayList<>();
        String girilenisim="";
        Scanner scan=new Scanner(System.in);

        while (!girilenisim.equalsIgnoreCase("q")){
            System.out.println("listeye eklmek icin bir isim girin\n Bitirmek icin Q ' ya basin");
            girilenisim= scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")){
                isimlistesi.add(girilenisim);
            }
        }
        return isimlistesi;
    }
}
