package day10_StringManipulations;

public class C02_replace {
    public static void main(String[] args) {

        String str= "Java ogren, adana ye";

        System.out.printf("", str.replace('a', 'A'));

        System.out.println(str.replace(" ",""));

        System.out.println(str.replace("Java","Yazilim")); // Java yerine yazilim yazdir



        String sonuc="1-16 of over 100,000 results for “apple”";

        // over ile results arasinda bulabilrim

        int indexOver=sonuc.indexOf("over");
        int indexResults=sonuc.indexOf("results");

        String sonucsayisistr=sonuc.substring(indexOver+5,indexResults);
        System.out.println(sonucsayisistr);

        str=str.replace(",",""); // virgulden kurtuluyoruz


       // int sonucsayisiInt=


       // System.out.println(sonucsayisistr);




    }
}
