package day11_ForLoops;

public class C07_forLoop {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String str= "Java ogrenmek icin cok calismak lazim";

        String terstenstr="";

        for (int i=str.length()-1; i>=0; i--) {

            //terstenstr+=str.substring(i,i+1);
            terstenstr+=str.charAt(i);

        }
        System.out.println(" girilrn cumlenin tersten yazilisi: "+ terstenstr);
    }
}
