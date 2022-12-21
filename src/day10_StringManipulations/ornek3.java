package day10_StringManipulations;

public class ornek3 {
    public static void main(String[] args) {

        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 36.70 €


        String input1="15.30€";
        String input2="14.40€";

        char euro=input1.charAt(input1.length()-1);

        input1=input1.replace("€", "").trim();
        input2=input2.replace("€", "").trim();

        Double toplam=Double.parseDouble(input1);
        Double toplam2=Double.parseDouble(input2);


        System.out.println((toplam+toplam2)+euro);























       /* String s1="15.30 €";
        char e=s1.charAt(s1.length() - 1);
        String s2="11.40 €";
        s1=s1.replace("€","").trim();
        s2=s2.replace("€","").trim();
        System.out.println(Double.parseDouble(s1) + Double.parseDouble(s2)+" "+e);

        */








    }
}
