package day11_ForLoops;

public class ornek8 {
    public static void main(String[] args) {

        // verilen input'a gore carpim tablosu olusturun
        // Java'da ic ice yapilara nested denir
        // burada sadece farkli olan i'nin katsayisi oldugundan onun icin de bir loop olusturalim
        /*
             1 2  3  4
             2 4  6  8
             3 6  9 12
             4 8 12 16
         */

        int imput=4;

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j+ " ");

            }
            System.out.println("");

        }

    }
}
