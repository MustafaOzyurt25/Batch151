package practise_regular.day10practise;

public class C02_Static {
            /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım


    *** static variable'lara ayni class icerisindeki tum methodlardan direkt ulasabiliriz. Yani Class ismi yazmaya gerek yok
    farkli bir class dan ise Class ismi.variable yazarak ulasiriz.

    *** static variable'lar gokteki ay gibidir, static variable'larin degeri bir kisi tarafindan
            degistirilirse herkes icin degisiklige ugramis olur

            *** static variable'lar, Class'a baglidirlar

*/

    static String okulIsmi = "Yildiz Koleji";

    static int okulNo;
    static boolean okulAcikMi;

    static int okulKode;

    public static void main(String[] args) {


        System.out.println(okulIsmi); // Yildiz Koleji
        System.out.println(okulNo);//0
        System.out.println(okulAcikMi);//false


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        okulNo = 102;

        System.out.println(okulNo);


        staticMethod();
        System.out.println(okulNo);//200


    }// main

    private static void staticMethod() {
        okulNo = 200;
        System.out.println(okulNo);// 200
    }


}
