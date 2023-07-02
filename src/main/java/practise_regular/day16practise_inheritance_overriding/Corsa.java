package practise_regular.day16practise_inheritance_overriding;

/*
inherutance variable:
Olusturdugumuz objenin data turu hangi classa aitse oradan
baslayarak bakar yoksa parentine gider ilk buldugu yerden alir.


inheritance method:
Olusturdugumuz objenin data turu hangi classa aitse oradan
baslayarak bakar, yoksa parentine gider ilk buldugu yerden hemen almaz.Override edilmismi diye bakar.
(Constructor class'ina kadar ayni isimde method varmi diye kontrol eder) Override edileni alir.
 */
public class Corsa extends Opel {


   // protected String hiz = "Corsa max 200 km hiz yapar";

    protected String yakit = "Corsa benzinli veya elektrikli";

    protected String model = "Corsa";


//    protected void motor() {
//
//        System.out.println("CORSA ARABALAR CEVRECI MOTOR KULLANIR");
//
//    }


    protected void yakitTuketimi() {

        System.out.println("CORSA 5.6 Lt YAKIT TUKETIR");


    }

    protected void vitesSayisi() {

        System.out.println("CORSA 5 VITESLIDIR ");
    }

    public static void main(String[] args) {
//
//        Corsa arab1 = new Corsa();
//        System.out.println(arab1.hareket);  // Arabalar teker ile hareket eder
//
//        System.out.println(arab1.hiz);// Corsa max 200 km hiz yapar
//
//        System.out.println(arab1.sirketMerkezi); // Almanya
//
//        arab1.motor();// CORA ARABAALR CEVRECI MOTOR KULLANIR

        Araba arb3 = new Corsa();

        Opel arb2 = new Corsa();
        System.out.println(arb2.hareket); // Arabalar teker ile hareket eder

        System.out.println(arb2.hiz);// Opel arabalar max 220 km hiz yapar

        System.out.println(arb2.yakit);//Arabalar farkli yakitlar kullanabilir

        System.out.println(arb2.marka);  // Opel

        System.out.println(arb2.sirketMerkezi);// Almanya

       // System.out.println(arb2.model); // CTE

        arb2.motor();

        arb2.garanti();  // OPEL ARABALAR 2 YIL GARANTILIDIR

        arb2.yakitTuketimi();

       //arb2.vitesSayisi();







        System.out.println(arb3.hareket);  // Arabalar teker ile hareket eder

        System.out.println(arb3.hiz); //  Arabalar motor gucune gore hiz yapar

        System.out.println(arb3.yakit); //Arabalar farkli yakitlar kullanabilir

        System.out.println(arb3.marka); //   Arabalar uretildikleri markaya sahiptir

        System.out.println(  ((Corsa) arb3).sirketMerkezi); // type casting


        arb3.yakitTuketimi(); // CORSA 5.6 Lt YAKIT TUKETIR

        arb3.motor();  // CORSA ARABALAR CEVRECI MOTOR KULLANIR

       // System.out.println( arb3.garanti());


        arb3.motor();

        System.out.println(new Corsa().toString());

        System.out.println(  ((Corsa) arb3).hiz); // type casting


    }

    @Override
    public String toString() {
        return "Corsa{" +
                "yakit='" + yakit + '\'' +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", sirketMerkezi='" + sirketMerkezi + '\'' +
                ", hareket='" + hareket + '\'' +
                ", hiz='" + hiz + '\'' +
                ", yakit='" + yakit + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }
}






//METHODLAR ILE ILGILI ISLEMLER

//objectimiz ile method cagiralim
 // arb2.motor();
/*
Object data type'i Opel classindan, Constructor ise Corsa(child) classindan olusturuldu.
Objectimiz Opel classindan olustugu icin basta Opel classina gelip motor methodu var mi diye bakar.
Opel classinda bu method olsa da hemen almaz onu. Once bu method child tarafindan override edilmis mi diye bakar. Orada override edildigini gorunce parent Opeldekini degil Corsa classindaki override edilen motor
methodunu alip onu yazdirir. Eger Corsa class'inda motor methodu olmasaydi, o zaman Opel classindaki motor methodunu alir ve yazdirirdi.
Corsa classinda motor methodu override edildigi icin bize Corsa classindaki degeri yazdiracak.
"CORSA ARABALAR CEVRECI MOTOR KULLANIR"
 */