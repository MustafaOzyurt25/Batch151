package javaders.day06typecastingstringmanipulation;

import java.util.Locale;

public class C01_StringManipulation {
    private static final String yA = "YA!";

    public static void main(String[] args) {


        String a = "Benim Tek Rakibim Dunku Ben. ";

        //************ a.toUpperCase()  *********************\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);
        //aUpper = BENIM TEK RAKIBIM DUNKU BEN.

        String aaUpper = a.toUpperCase(Locale.ROOT);
        System.out.println("aaUpper = " + aaUpper);

        //************ a.toLowerCase() *********************\\

        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);
        //aLower = benim tek rakibim dunku ben.

        //************ charAt()  *********************\\

        // a Stringindeki ilk karakteri aliniz

        System.out.println("a.charAt(0) = " + a.charAt(0));
          //a.charAt(0) = B

        System.out.println(a.charAt(10)); // indeksdeki 10. harf yani "m" harfini

        char firstChar = a.charAt(1);
        char secChar = a.charAt(19);

        // a Strindeki bastan 2. ile sondan 2. karakterleri yanyana yaziniz.
        System.out.println("firstChar+secChar = " + firstChar + secChar);

        // a Stringindeki karakter sayisini bulunuz.
        //************ length()  *********************\\

        System.out.println("a.length() = " + a.length());

        //************  substring() *********************\\
        // a Strindeki ilk 4 karakteri alinip yaziniz

       // String a = "Benim Tek Rakibim Dunku Ben. ";


        System.out.println("a.substring(0,4) = " + a.substring(0, 4)); //a.substring(0,4) = Beni
        //0 dahil  4 haric  [0,4)==> 0 .index, 1.index,2.index,3.index==> alinir
        // 4.indexden itibaren alinmaz

        System.out.println("a.substring(4) = " + a.substring(4));

        //a String'indeki 4.index dahil 7.index haric yazdiriniz:

        System.out.println("a.substring(4,7) = " + a.substring(4, 7));//a.substring(4,7) = m T
        System.out.println("a.substring(4,16) = " + a.substring(4, 16));// m Tek Rakibi


        System.out.println("a.substring(3) = " + a.substring(3));

        // s Stringindeki rakibim kelimesini yazdirmak icin:
        System.out.println("a.substring(10,17) = " + a.substring(10, 17));

        System.out.println("a.substring(10) = " + a.substring(10));

        // a Striginde "bim" kelimesinin olup olmadigini kontrol ediniz.
        //************  substring() *********************\\
        System.out.println("a.contains(\"bim\") = " + a.contains("bim"));

        //************  startsWith*********************\\
        // a Stringinin "T" harfiyle baslayip baslamadigini kontrol ediniz.
        // t ile basliyor mu baslamiyor mu
        System.out.println("a.startsWith(\"T\") = " + a.startsWith("T")); // false

        // ilk 6 karakteri at sonrasi Tek kelimesiyle baslar mi

        System.out.println("a.startsWith(\"Tek\",6) = " + a.startsWith("Tek", 6));

        // universite numaralari yil + bolum kodu+ kacinci sirada o bolume girdigi
        // ne gore ogrenci numaraalri olusturuluyor . buna gore Umran' NIN HUKUK FAKULTESINDE
        // OKUYUP OKUMADIGINI GOSTEREN KODU YAZINIZ


        String str = "20105501";
        System.out.println("str.startsWith(55,4) = " + str.startsWith("55", 4));

        System.out.println("a.concat(yA) = " + a.concat(yA));


    }// Main
}  // Class
