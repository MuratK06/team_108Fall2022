package day11_ForLoops;

public class ornek7 {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String str= "sorgulnmayan hayat yasamaya degmez";

        String terstenstr="";

        for (int i = str.length()-1; i >=0 ; i--) {

            terstenstr+=str.charAt(i);



        }
        System.out.println(" girilrn cumlenin tersten yazilisi: "+ terstenstr);
    }
}
