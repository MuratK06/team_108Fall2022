package Practice;

public class soru1 {
    public static void main(String[] args) {

       // 100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
        
        

        double toplam=0;

        for (int i = 100; i >0 ; i--) {

            if (i%13==0){
                toplam+=i;

                System.out.println(" 13 e tam bolune bilir sayilar: "+ i);

            }

            
        }
        System.out.println("toplam: "+ toplam);
    }
}
