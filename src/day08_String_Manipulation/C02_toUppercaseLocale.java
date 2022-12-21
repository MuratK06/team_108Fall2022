package day08_String_Manipulation;

import java.util.Locale;

public class C02_toUppercaseLocale {
    public static void main(String[] args) {


        String str= "JAVA CANDIR";

        System.out.println(str.toLowerCase());
        str= str.toLowerCase();


        str= "sevgi insani hayata bağlar";

        System.out.println(str.toUpperCase());

        str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
    }
}
