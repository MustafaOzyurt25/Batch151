package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation_tekrar {
    public static void main(String[] args) {
        String a = "Benim Tek Rakibim Dunku Ben. ";


        //+ a String'indeki bastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yazdiriniz.             e .
        //+ a String'inde bulunan karakter sayisini bulunuz                                             29
        // a String'indeki ilk 4 karakteri aliniz                                         // a.substring(0,4) = Beni
        // Stringin 9. karakterini al.                                                           //a.charAt(8) = k

        //a String'indeki 4.index dahil 7.index haric yazdiriniz.                           a.substring(4,7) =           m T
        //"Benim Tek Rakibim Dunku Ben* ."
        // a String'indeki "Rakib" kelimesini aliniz                                             // a.substring( 10,15) = Rakib
        //a String'inde "bim" kelimesinin olup olmadigini kontrol ediniz      //  a.contains("bim") = true
        // a String'inin "T" harfiyle baslayip baslamadigini kontrol ediniz    //a.startsWith("T") = true
        //true  ilk 6 karakateri at; sonrasi "Tek " kelimesiyle basliyor mu ?         // a.startsWith("Tek",6) = true
/*
 // Universite numaralari yil+BolumKodu+GirisSirasi  olarak duzenlenen bir okulda
        //ogrenci Umran'in Hukuk Fakultesinde okuyup okumadini gosteren kodu yaziniz         oNumarasi.contains("06") = true
 */
           String oNumarasi = "04060076";
        System.out.println("oNumarasi.contains(\"06\") = " + oNumarasi.contains("06"));  // oNumarasi.contains("06") = true
        // String str kelimesini al.Rakibim

        System.out.println("a.startsWith(\"Tek\",6) = " + a.startsWith("Tek", 6));
        System.out.println("a.startsWith(\"T\") = " + a.startsWith("B"));  //a.startsWith("T") = true


        System.out.println("a.contains(\"bim\") = " + a.contains("bim"));

        System.out.println("a.substring( 10,15) = " + a.substring(10, 15));  // a.substring( 10,15) = Rakib


        System.out.println("a.substring(4,7) = " + a.substring(4,7));//a.substring(4,7) = m T


        System.out.println("a.charAt(8) = " + a.charAt(8));


        System.out.println("a.substring(0,4) = " + a.substring(0, 4));//a.charAt(8) = k
        System.out.println("length of a = " + a.length());// 29

        char ch1 =  a.charAt(1);
        char ch2 =  a.charAt(27);
        System.out.println(ch1+" "+ch2);  //e .













































    }
}
