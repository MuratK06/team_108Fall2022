package day29_Final_AbstractClasses;

public class EChild extends DParent{

     /*
        Klasik inheritance ile parent child iliskisi olusturdugumuzda
        Parent class'daki tum ozellikleri otomatik olarak kazaniriz
        Ancak method'lari Override etme MECBURIYETI YOKTUR
        Ister override edip kendimize ozellestiririz,
        Istersek de parent class'daki haliyle kullaniriz
     */


    @Override
    public void method1() {
        System.out.println("parent class daki mecburi overide edilecek method i override ettik");

    }

    @Override
    public void method2() {
        System.out.println("parent class daki mecburi overide edilecek method i override ettik");
    }

    public static void main(String[] args) {

        // DParent obj1= new DParent();
        // 'DParent' is abstract; cannot be instantiated
        // Abstract class'larin constructur'lari vardir ama OBJE URETILEMEZ


        EChild chld1=new EChild();
        chld1.method1();//parent class daki mecburi overide edilecek method i override ettik
        chld1.method2();//parent class daki mecburi overide edilecek method i override ettik
        chld1.method3();//parent class daki method calisti

        DParent chld2=new EChild();
        chld2.method1();//parent class daki mecburi overide edilecek method i override ettik
        chld2.method2();//parent class daki mecburi overide edilecek method i override ettik
        chld2.method3();//parent class daki method calisti
    }
}
