package day24inheritancepoliymorphism;

public class CarRunner {
//    (Burcudan aldim!)
//    Java diyor ki once parent'i sonra child'i olustur. Burada once Car sonra Toyota'yi olusturduk.
//    Java once Car' CONSTRUCTOR i calistirir. Yani once onu yazdirir, sonra asagidaki constructorlari calistirir.
//    Biz Java'ya Toyota(); constructor'ini calistir, icinde parametre olmayani calistir dedik.
//    Bu constructor Toyota uretecek, ama once parent'i olan Car'in uretilmesi gerekir.
//    Her constructor'in ilk satirinda gorunmez ( super()  ) kodu vardir. O da super() seklindedir.
//    Super parent demektir. O yuzden once parent'e gidilir.
//    Car'in da parent'i varsa oradaki constructor da super parantez nedeniyle kendi parent'ina gider.
//    En tepeden Object Class'tan calismaya basladi asagilara kadar geldi.
//    Bizi yukariya tasiyan kod su super keyword'udur. Bu sizi parent'daki constructor'a tasir.

   /* Kisacasi her Constructorun ilk kodu super() keywordudur
   ve bu bizi Objeckt Claslarda olusan Const lara kadar goturur. Ayrica super() in icinde ki
   parametrelere gorede Const lar arasinda gezinti yapariz
    */

    public static void main(String[] args) {


        Toyota t1 = new Toyota();

        Honda h1 = new Honda();

        Volvo v1 = new Volvo();
        v1.move();


//        t1.model = "Prius";
//
//        System.out.println(t1.model);













    }
}
