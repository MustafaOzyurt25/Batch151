package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations_tekrar {
    public static void main(String[] args) {


        String s = "Java is easy to learn";


        // Bir Strinde a,i,e karakterlerinin son gorunumunun indexleri toplammini ekrana yazdirini
        //    String s ="Java is easy to learn";
        int aLastIndex = s.lastIndexOf('a');
        System.out.println("aLastIndex = " + aLastIndex);

        int iLastIndex = s.lastIndexOf('i');
        System.out.println("iLastIndex  = " + iLastIndex);


        int eLastIndex = s.lastIndexOf('e');
        System.out.println("eLastIndex = " + eLastIndex);


        // BIR STRINGDE JAVA KELIMESININ ILK OLARAK
// KACINCI INDEXDE  KULLANILDIGINI/ OLDUGUNU GOSREN KODU YAZINIZ.
        String cumle = "Ah Java vah Java sen ne guzel seysin Java";

        System.out.println("cumle.indexOf(\"Java\") = " + cumle.indexOf("Java")); // cumle.indexOf("Java") = 3
        int indexOfQWEr = cumle.indexOf("QWEr");
        System.out.println("indexOfQWEr = " + indexOfQWEr);  // indexOfQWEr = -1

        // verilen String bir datadan bir datada istenilen degerin son
        // gorunumun indexini verir. olmayan bir karakter sorgulanirsa -1 verrir


        // s Strinde a,i,e karakterlerinin ilk gorunumunun indexleri
        // toplammini ekrana yazdirini

        int aIndx = s.indexOf('a');
        System.out.println("aIndx = " + aIndx); //aIndx = 1

        int iIndx = s.indexOf('i');
        System.out.println("iIndx = " + iIndx);  // iIndx = 5

        int eIndx = s.indexOf('e');
        System.out.println("eIndx = " + eIndx);  // eIndx = 8

        System.out.println("total index = " + (aIndx + iIndx + eIndx));// total index = 14


    }

}
