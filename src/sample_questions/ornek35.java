package sample_questions;

import java.util.Arrays;

public class ornek35 {
    public static void main(String[] args) {

        //Soru 35-)
        //Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
        //		--> toCharArray() yöntemini kullanmayın
        //Örnek:
        //		String isim:    Yakup
        //		char arr[]:     [Y,a,k,u,p]
        //İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
        // Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

        String isim = "Yakup";
        System.out.println(Arrays.toString(charArray(isim)));
    }public static char[] charArray(String isim){
        char[]caryeni=new char[isim.length()];

        for (int i = 0; i < caryeni.length; i++) {
            caryeni[i]=isim.charAt(i);
        }
        return caryeni;


    }
}
