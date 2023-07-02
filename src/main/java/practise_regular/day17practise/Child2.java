package practise_regular.day17practise;

/*
extends yapilan classlardaki tum constructorlarin ilk satirinda
 biz gormesek bile super() constructor call vardir.
 Dolayisiyla once Parent classdaki constructor calisir
 */
public class Child2  extends Parent2{


    public Child2(int i) {
        super();
        System.out.println("Child Class Tek Parametreli Constructor");
    }

    public Child2() {
       super();
        System.out.println("Child Class Parametresiz Constructor");
    }

    public Child2(int a, int b) {
        super(5,10,15);
        System.out.println("Child Class iki Parametreli Constructor");
    }


    // Parent2 isminde bir class olusturunuz
    // Child2 class'ı, Parent2 class'a extends ediniz
    // Child2 class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent2' den ekran cıktısı alınız

    public static void main(String[] args) {

        Child2 obj1 = new Child2();

//        Child2 obj2 = new Child2(1);
//
//        Child2 obj3 = new Child2(2,3);

    }



}
