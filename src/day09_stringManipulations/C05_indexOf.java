package day09_stringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";

        // str cok iceriyor mu ?


        System.out.println(str.contains("cok"));

        // kullanicidan aldigimiz cumle"cok" ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.endsWith("cok")); // bu olmaz

        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("v"));

        System.out.println(str.indexOf("cok"));

        System.out.println(str.indexOf("a",5)); // 5. indexden sonraki ilk 'a' nin indexini yazdirir

        //2. O nun indexini yazdirin
        // once ilk o nun indexini bulurum
        // sonra o indexden sonrasinda 2. o yu arariz


        int ilkOindexi=str.indexOf("o");
        int ikinciOindexi=str.indexOf("o",ilkOindexi+1);

        System.out.println(ilkOindexi+" "+ ikinciOindexi);


    }
}
