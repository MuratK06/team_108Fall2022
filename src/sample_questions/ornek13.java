package sample_questions;

public class ornek13 {
    public static void main(String[] args) {

        //Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
        //Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
        //Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
        //Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
        //Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
        //Ipucu:
        //Switch konusunu hatırlayalım!

        char cevab='c';

        switch (cevab){
            case 'a':
                System.out.println("Istediginiz isleniyor");break;

            case 'b':
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");break;

            case 'c':
                System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");break;

            default:
                System.out.println("Geçersiz giriş");


        }
    }
}
