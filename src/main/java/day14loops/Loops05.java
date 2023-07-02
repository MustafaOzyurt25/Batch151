package day14loops;

public class Loops05 {
    public static void main(String[] args) {

  /*      //         //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //        //"Pwd12?Ab" ==> P12?A

        String s = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);


            if (ch >= 'a' && ch <= 'z') {
                continue;

            } else {
                System.out.print(ch);
            }


        }
// break ile continue : break loopu kirmak icin; continoue ise bazi elemanlari isleme sokmamak icin kullanilir

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      //1.yol:

        System.out.println();
        // bir stringi ters cevirin. java>>>>>>>>>>> avaj

        String t = "Java";
        for (int i = t.length() - 1; i >= 0; i--) {
            String ters = t.substring(i, i + 1);
            System.out.print(ters);
        }



        System.out.println();

// 2.yol :

        System.out.println();
        // bir stringi ters cevirin. java>>>>>>>>>>> avaj

        String u = "Java";

        for (int i = .length() - 1; i >= 0; i--) {

            char ters = u.charAt(i);
            System.out.print(ters);



        }

   */

        // bir tamsayinin rakamlarinin toplamini veren kodu yaziniz.. 578  >>>>>>>>>>> 5 + 7 + 8

        // ne zaman sifirdan yeni bir data olusturusak looplarda, mutlaka( uygun bir data type'nda)  yeni bir etkisiz variable olustururuz.
          // ki yeni elde ettimiz datayi yada data asamalarini icine koyalim ve yeni datamiz havada kalmasin. isimiz kolaylassin


        int sayi =- 578;

       sayi= Math.abs(sayi);

        int rakamlarToplami = 0;

        for (int i = sayi; i > 0; i = i / 10) {

            rakamlarToplami = rakamlarToplami + i % 10;


        }

        System.out.println(rakamlarToplami);


    } // main

} // Class
