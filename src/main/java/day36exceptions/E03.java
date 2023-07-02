package day36exceptions;

public class E03 {
    /*
    Soru: "throws" ile "throw" arasinaki farklar nelerdir?
            1)"throws" method signature satirinda kullanilir, "throw" ise method body icinde kullanilir.
            2)"throws" method signature satirinda bir veya birden fazla Exception ile bir kere kullanilir.
              "throw" ise method body icinde bir tane Exception ile tekrar tekrar kullanilabilir.
            3)"throws" dan sonra sadece Exception Class isimleri yazilir,
              "throw" dan sonra ise Exception Class'dan object olusturulur.
     */
    public static void main(String[] args) {

        printAge(23);
        try {
            printAge(-12);
        }catch (IllegalArgumentException e){
            System.out.println("Negatif yas olmaz");

        }
        printAge(-9);

    }
    // Ex 1: Kullanicidan alinan yasi konsola yazdiran methodu olusturunuz

    public  static  void printAge(int age){
        if(age<0){
           throw new IllegalArgumentException("Used negative integers for ages");  // kendimiz yazdigimizdan bunu biz yazdik
        } else if (age==0) {
            throw new ArithmeticException();

        }
        System.out.println(age);
    }
}

/*
Biz method olustururken bazi sartlari icine yazabiliriz. Kodumuzu negatif senaryolara gore exception almak icin
olusturabiliriz.

Kodumuzdan dolayi olusan exception'i nasil hallederiz? Kodumuz icinde throw new IllegalArgumentException yazarak javaya
olumsuz bir durum halinde exception vermesini istemis olduk. Ancak IllegalArgumentException javanin exception'i
olup biz bu exception'in verilmesini istedigimizde kodumuzla saglayabiliriz.

 */







/////////////////////////////////  Mehmet Hoca' dan/////////////////////////////////
 /*
    1) FileNotFoundException ve IOException Compile Time Exceptionlardir, yani code'u yazarken hata aliriz
    2) FileNotFoundException path'in dogrulugu ve dosyanin varligi ile ilgilidir.
       IOException tum input ve output islemleri ile ilgilidir.
    3) IOException Class, FileNotFoundException Class'in parentidir
    4) Istenirse FileNotFoundException yerine IOException da kullanilabilir
    5) IOException class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte
        IOException altta kullanilmalidir.
    */



/*
        * throw keyword bir method bodysi icinde istedigimiz yerde, istedigimiz kosullar icin,
        istedigimiz kadar Exception atmamizi saglar
        * throw keywordu yazildiktan sonra bir Exception Class Objecti olusturulur.
        * Exception class constructor inin parantez icine istedigimiz Exception mesajini yazabiliriz

        * throw ile throws keywordleri arasindaki fark nedir?
        1)"throw" method bodysi icinde, "throws" ise method parantezinden hemen sonra kullanilir.
        2) "throw" method bodysi icinde istenilen yerde istenildigi kadar kullanilabilir
            "throws" ise method parantezinden hemen sonra ve sadece 1 kere kullanilabilir.
        3) "throw" dan sonra "new" keyword ve constructor kullanilarak object olusuturulur
        *   "throws" dan sonra sadece Exception Class ismi yazilir
        4) "throw" belli sartlar icin Exception atmada kullanilir
            "throws" ise applicationu Exception attiktan sonra durdurur.
    */