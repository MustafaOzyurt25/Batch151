package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {

    public static void main(String[] args) {

        //Ex : bir Stringin hic katrakter icerip icermedigini konrol eden kodu yaziniz.

        // 1.Yol:

        String str = "";//hiclik
        boolean result1 = str.length() == 0;// javaya 2 islem yaptirdim. length metodu ve == operatoru.
        System.out.println("String bos mu? = " + result1); //String bos mu? = true

        // 2.Yol:
        //********************************************  isEmpty() *****************************\\
       /*
       isEmpty() metodu , String datanin icinde hicbirsey yoksa true dondurur.
        Java'da , space de bir karakter old.dan space varsa false dondurur.
        */
        boolean result2 = str.isEmpty(); // burada javaya bir islem yaptirdik.

        System.out.println("String bos mu? = " + result2);  // String bos mu? = true

        // bir Stringin space haric hic bir karakter icerip icemedigini gostern kodu yaziniz

        String t = "  ";
        boolean t1 = t.replace(" ", "").length() == 0;
        System.out.println("t1 = " + t1); // true

        boolean result4 = t.replace(" ", "").isEmpty(); // 2 islem yaptirdik
        System.out.println("result4 = " + result4);  //result4 = true

        // 3. yol:
        // ****************** isBlank() ****************************
        /*
        iSBlank(): String bir datanin bos mu dolu olduguna bakar.space+ hiclik
         varsa true dondurur. bos mu dolu mu oldugunu kontrol eder.
          boolean bir deger dondurur. sadece space varsa
           bosmu dolumu diye soruldugunda isBlank == true der.
        Ancak space varsa bir Stringde, isEmpty() ILE sordugumuzda False doner.
         */

        boolean result5 = t.isBlank();   // sadece 1 islem yaptirdik
        System.out.println("result5 = " + result5);

//******************* indexOf() *****************************************
        /*
        verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
        int dondurur. Tekli karakter icinde , coklu karakter icinde kullanilabilir
    Coklu datalarda String ifadenin ilk gorunumunun ilk karakterinin indexini dondurur
    Olmayan bir datanin kacinci indexde oldugunu sorgulatirsak bize -1 dondurur
         */
// Bir Strinde a,i,e karakterlerinin ilk gorunumunun indexleri toplammini ekrana yazdirini

        String s = "Java is easy to learn";
        int aIdx = s.indexOf('a');

        System.out.println("aIdx = " + aIdx);


        String s2 = "Java is easy to learn to easy ";
        int toIndex = s2.indexOf("to");
        System.out.println("toIndex = " + toIndex);

        int pIndx = s2.indexOf('p');
        System.out.println("pIndx = " + pIndx);  // pIndx = -1 olmayan bir karakterin indexini -1 veriyor

        int iIndx = s.indexOf('i');
        System.out.println("iIndx = " + iIndx);
        int eIndx = s.indexOf('e');
        System.out.println("eIndx = " + eIndx);

        System.out.println("indexler toplami = " + (aIdx + eIndx + iIndx));  // indexler toplami = 14
        // 1 + 5 + 8 = 14.
// BIR STRINGDE JAVA KELIMESININ ILK OLARAK
// KACINCI INDEXDE  KULLANILDIGINI/ OLDUGUNU GOSREN KODU YAZINIZ.
        String cumle = "Ah Java vah Java sen ne guzel seysin Java";
        int indexOfJava = cumle.indexOf("Java");
        System.out.println("indexOfJava = " + indexOfJava);

        int indexQYX = cumle.indexOf("QYX");
        System.out.println("indexQYX = " + indexQYX);

        // **********************************************  lastIndexOf() *************************************

        // lastIndexOf() Verilen bir datada karakter ya da karakterlerin
        //son gorunumunun indexlerini verir
        //olmayan bir karakter sorgulanirsa -1 verir

        // Bir Stringde a,i,e karakterlerinin son gorunumunun
        // indexleri toplamini ekrana yazdirinix
//    String s ="Java is easy to learn";


        int aLastindx = s.lastIndexOf("a");
        int eLastindx = s.lastIndexOf("e");
        int iLastindx = s.lastIndexOf("i");
        System.out.println("last indexler toplami  = " + (aLastindx + eLastindx + iLastindx));


    }
}
