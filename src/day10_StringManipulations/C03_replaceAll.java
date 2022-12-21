package day10_StringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str="Java 56Guz,zel-dir";
        // bu metindeki sayilardan kurtulun

        System.out.println(str.replace("1","")
                .replace("5","")
                .replace("6",""));

        str="Ja1va4 56G7u,z9el-d0ir8";

        /* replace() metodu zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar
        eger genellmeyi butun sayilari, butun spaceleri, butun ozel karekterleri gibi genisletmek istersek
        replece metodunun yerine replaceAll() kullaniriz

        java bu genellemeleri yaza bilmemiz icin , regex(regular expressions) tanimlamistir
         */

        str=str.replaceAll("\\d","");// sayilardan kurtulduk
        System.out.println(str);

        // ozel karekterlerden de kurtulalim
        // space de ozel karekter oldugundan bu durumda space nin yok olmamaasi icin
        // once spacenin yerine meznde olmayan bir deger atayalim


        str=str.replaceAll(" ","5");

        str=str.replaceAll("\\W","");

        str=str.replaceAll("5"," ");

        System.out.println(str);





    }
}
