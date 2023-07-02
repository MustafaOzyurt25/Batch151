package practise_regular.day14practise;

public class Child extends Parent{

    protected  void method4(){
        System.out.println("Child instance method4");
    }

    public static void main(String[] args) {

        // Static variable lari ve static methodlari farkli bir classdan cagirabilmak
        // icin class ismi kullanilir. Fakat bu iki class arasinda parent- child iliskisi varsa
       // direkt kullanabiliriz

        System.out.println(Parent.isim); // Ali

        System.out.println(isim);

        isim="Veli";
        System.out.println(isim);

        soyisim = "Tan";
        System.out.println(soyisim);

        method1(); //Parent static method1
        method2();//Parent static method2


        Child obj1 = new Child();

        System.out.println(obj1.yas);// 30

        obj1.method3();//Parent instance method3

        obj1.method4();//Child instance method4


        Parent obj2 = new Child();
        obj2.method4();  // Child instance method4

        Parent obj3 = new Parent();
        obj3.method4(); // Parent instance method4



    }
}
