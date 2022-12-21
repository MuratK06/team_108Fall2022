package day12_methodCreation;

public class C03_AsalSayiMethod {
    public static void main(String[] args) {

        // verilen bir sayinin asal olup olmadigini true/ false olarak donduren bir method olusturun

        //asalsayimi methodu boolen bir sonuc dondurdugunden bu methodu ya direkt yazdirmaliyiz veya
        //method call 'un getirecegi siónucu atamamk icin bir varieble olusturabilirim.

        boolean asalsayiMi59=asalsayiMi(59);
        System.out.println("59 icin sonuc: "+asalsayiMi59);


    }

    public  static boolean asalsayiMi(int input){

        boolean asalsayiMi=true;

        for (int i = 2; i <input ; i++) {

            if (input%i==0){
                asalsayiMi= false;
                break;
            }

        }
        return asalsayiMi;
    }
}
