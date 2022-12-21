package day11_ForLoops;

public class ornek9 {
    public static void main(String[] args) {

        // input olarak verilen kenar uzunluklarina gore
        // asagidaki sekli cizdirin
        int kisaKenar=2;
        int uzunKenar=5;
        /*
                * * * * * * * *   // bir satiri nasil yazdiracagimizi inner loop ile belirliyoruz
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
                * * * * * * * *
             Satirda yaptigimiz islemi kac kere tekrar edecegimizi ise outer loop belirliyor
         */


        for (int i = 1; i <=kisaKenar ; i++) {
            for (int j = 1; j <=uzunKenar ; j++) {

                System.out.print("* ");

            }
           System.out.println("");
        }



    }
}
