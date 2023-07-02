package day18constructerstatickeyword;

public class MethodOverloading {
/*
bir method ayni isim ve farkli parametrelerle
 olusturulursa buna "method overloading" denir.
 "method overloading" javada iyi organizasyon icin onemlidir.

"method overloading" yaparken parametre uc sekilde degistirilebilr
 /1 parametrelerin sayilari degistirilebilir.
 /2 parametrelerin data tiplerini degistirebiliriz.
 /3 parametrelerin data tipleri farkli ise yerleri degistirilebilir.
 /4 bir classin icinde olusur.(method overloading)
 "Method Overloading" bir class'in icinde olusur bu yuzden "private" method'lar da overload edilebilir.
          "Method Overloading" butun access modifier'larda kullanilabilir.
        5)"static" method'lar "overload" edilebilirler.

 */

    public static void main(String[] args) {

        System.out.println(add(3, 5)); // 8 (8.0 DEGIL)
    }


 //  private static int add(int a, int b) {
 //       return a + b;
 //   }
    public static int add(int a, int b,int c) {
        return a + b + c;
    }


                             //AW  3, 5 ICIN
 //  private static double add(double a, int b) {
 //       return a + b;
  //  }
                                       //AW
    public static double add(int a, double b) {
        return a + b;
    }

}