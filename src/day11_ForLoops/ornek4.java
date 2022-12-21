package day11_ForLoops;

public class ornek4 {
    public static void main(String[] args) {

        // input olarak verilen sayidan bire kadar tum sayilari yazdirin

        int input=23;

        if (input>1){
            for (int i = input; i >=1 ; i--) {
                System.out.print(i+" ");
            }
        }else {
            for (int i = 1; i <=1 ; i++) {
                System.out.print(i+ " ");

            }

        }
    }
}
