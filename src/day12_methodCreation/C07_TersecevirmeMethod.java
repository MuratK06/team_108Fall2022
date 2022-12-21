package day12_methodCreation;

public class C07_TersecevirmeMethod {
    public static void main(String[] args) {


        //verilen bir stringi terse cevirip o halini bize donduren bir method olusturun


        System.out.println(metnitersecevir("Sorgulanmayan Hayat Yasamaya Degmez"));
    }

    public static String metnitersecevir(String str){

        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {

            tersStr+=str.charAt(i);

        }
        return  tersStr;
    }
}
