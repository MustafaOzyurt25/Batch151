package javaders.day02printmethodcreation;

import java.util.Scanner;

public class PrintPrintln {
    public static void main(String[] args) {
        /*
        \n ==> Imlecı bir alt satira goturur.
        \t ==> bir tab bosluk birakir..
        \" ==> ekrana " (cift bir adet tirnak) yazdirir.
        ctrl + alt + L ==> Sayfayi (kodu) duzenler...

         */

        // "TECHPRO EDUCATION"


        // "TECHPRO EDUCATION" yazisini yukaridan asagiya harf harf yazdiriniz

        // 1. YOL   CTRL+Exception_soru10
        System.out.println("************* 1. Yol *********************");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("IkiKrakterArasiHarfler");
        System.out.println("O");
        System.out.println(" ");//HICLIKTE OLUR
        System.out.println("E");
        System.out.println("Exception_soru10");
        System.out.println("Y");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");
// "TECHPRO EDUCATION" yazisini tek bir sout ile yukaridan asagiya harf harf yazdiriniz
        System.out.println("***************** 2. Yol **************************");
        System.out.println("T\nE\nC\nH\nP\nIkiKrakterArasiHarfler\nO\n\nE\nException_soru10\nY\nC\nA\nT\nI\nO\nN");

        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira
// yazdiran kodu tek bir sout ile yazdiriniz

        System.out.println("JAVA\nILE\nGUZEL\nDUNYA ");

        // JAVA ILE GUZEL DUNYA ifadesinin her bir  kelimesini bir tab bosluk birakarak
// yazdiran kodu tek bir sout ile yazdiriniz
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");
  // JAVA ==> 1 SPACE BOSLUK.
  // JAVA       ==> 1 TAB BOSLUK.
        System.out.println("JAVAm \tILEmm  \tGUZEL\tDUNYA");// \t de harf sayisi onemlidir.yoksa esit aralik birakmaz.
        // bu nedenle her kelimeyi 5 harfe tamamladik.

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz

        System.out.println("\"Techpro \" ile java cok ' kolay '");

        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        //SEKLINDE NOKTALI VIRGULDEN SONRA
        // 3 SATIR ALTTAN paragraf basi yaparak yazdiran kodu olusturunuz

        System.out.println("\"MAHARET\" hic " +
                "'DUSMEMEK' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

        // Print ile Println arasindaki farklar:
        // ln ==> line next bir sonraki satira gec.
        System.out.println("************** 1 *****************");
        System.out.print("Ali");
        System.out.println("Can");
        //AliCAN YAZDIRIR.
        System.out.println("*********** 2 *************");
        System.out.println("Ali");
        System.out.print("Can");
        // Ali
        // Can yazdirir.
        System.out.println("*********** 3 ***********");
        System.out.print("Ali");
        System.out.println("Can");
        // AliCan YAZDIRIR.

        // Ex) Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturun.
        /*

         A
        A A
       A A A
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char ch = input.next().charAt(1); // Ali HAKKI
        System.out.println("  "+ch+"   ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);






















































    }
}
