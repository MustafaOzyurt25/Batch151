package day37exceptionsenums;

public class IllegalGradeException extends Exception {
/*

     1) Custom Exception Class olusturmak icin Exception Class'a extends etmeliyiz
       Exception Class'a extends ederek olusturdugumuz Custom Exception "Compile Time Exception" olur
     2)Custom Exception Class olustururken "constructor" olusturmalisiniz.
           Bu constructor parent'taki consructor'u cagirmalidir.
             Bu constructor mesaj verecek veya vermeyecek sekilde olusturulabilir
     3)Custom Exception Class olusturdugunuzda ismin sonuna "Exception" kelimesini kullanmalisiniz.
             IllegalGradeException'da oldugu gibi.

 */

    public IllegalGradeException(String message) {
        super(message);
    }


    public IllegalGradeException() {
        super();
    }


}
