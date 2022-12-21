package day10_StringManipulations;

public class ornek4 {
    public static void main(String[] args) {

        // Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                //         input1 : "15.30 €" , input2 : "11.40 €"
//          output : 36.70 €


        String input1="15.30 €";
        char e=input1.charAt(input1.length() - 1);
        String input2="11.40 €";
        input1=input1.replace("€","").trim();
        input2=input2.replace("€","").trim();
        System.out.println(Double.parseDouble(input1) + Double.parseDouble(input2)+" "+e);
    }
}
