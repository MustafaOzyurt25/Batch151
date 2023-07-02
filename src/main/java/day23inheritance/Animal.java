package day23inheritance;

public class Animal {

    /*
    1) eat() methodu gibi bir cok classin kullanmasi gereken methodleri ayri ayri yazarsak ;
       i) tekrar olmus olur. Oysa ideal kod'da tekrar olmamalidir.
       ii) Zaman kaybi: eat() methodunu, Bir kere yazip bircok class icin ortak
                  kullanmak varken herbir Class icin tek tek yazmak zaman kaybidir.
       iii) tekrar be tekrar yazilan meythodun tamiri cok zaman alir.
       \4  tekrar be tekrar  yazilan methodun  gelistirilmesi cok zaman alir.
       \5  tekrar be tekrar yazilan method "atomik yapiya" terstir.


   2) private Class memberler child classlar tarafindan kullanilamazlar.
     public Class memberler child classlar tarafindan kullanilabilir.
     default Class member'lar ayni package'de child classlar tafindan kullanilabilirler
     protected class memberlar farkli package da olsalarda child classlar tarafindan
      kullanilabilirler.

   3) java'da bir Classin sadece bir tane parent i olabilir. Coklu parent'a multiple - inheritance derler.
   tekli parent'a single inheritance derler. Java multiple inheritance'i desteklemez. Single Inheritance'i kullanir.

    4)Apartman seklindeki inheritance yapisina multi- level inh. denir. Java "multi-level inheritance" i destekler */


  public void  eat(){
     System.out.println("Animals eat ...");
 }
  public   void drink (){
    System.out.println("Animals drink ...");
}












}
