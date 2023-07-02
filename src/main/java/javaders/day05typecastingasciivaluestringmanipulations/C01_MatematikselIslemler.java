package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {
    public static void main(String[] args) {

        /*

        Javada farkli data type'lari arasinda islem yapiliyorsa sonuc buyuk
         olan data type' in turunde olur.
        - Karsilastirma operatorlerinde sonuc hep boolean doner.

        <   : kucuktur
        >   : buyuktur
        ==  : esittir
        !=  : Esit degildir.
        <=  : kucukesitir
        >=  : buyukesitir
        &&  : and ( ve ) operatoru
        ||  : or ( veya ) operatoru

         */

        System.out.println(4*(5+2)/3);   // 9  int/int sonuc int olacagi icin 9.3333 un 9 unu alir.

        System.out.println(6*16/8); // 12
        System.out.println(4*(2+5)/3); // 9

          double sonuc = 4*(2+5)/3;
        System.out.println("sonuc = " + sonuc); // 9.0

        double sonuc2 = 4.0*(2+5)/3;
        System.out.println("sonuc2 = " + sonuc2); // 9.3333333333334


        System.out.println(4*(1+5)/3);
       
       int sayi1 = 5;
        int sayi2 = 2;
        double sayi3 =2;
        System.out.println(sayi1/sayi2); // 2 normalde 2.5 anca int/int = int olacagi icin int olur
        System.out.println(sayi1/sayi3); // 2.5.
        System.out.println(sayi1+sayi3/sayi2);//6.0

        boolean first = 2<4;     // t
        System.out.println("first = " + first);
        boolean second = 2+6 !=8;// f
        System.out.println("second = " + second);
        boolean third = true; // t
        System.out.println("third = " + third);


        System.out.println(first&&second); // f


        boolean b = first||second || third; // true
        System.out.println("b = " + b);

        System.out.println(first||second || third); //true
















    }  //main
}//  Class
