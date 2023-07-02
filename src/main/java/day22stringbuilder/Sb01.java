package day22stringbuilder;

import day23inheritance.Animal;
import day23inheritance.Cat;

public class Sb01 {

    // String uretir. StringBuilder bir classtir. degistirilebilir bir Clastir.(mutable)

    // immutable olmak demek , orjinal degerin korunmasi demek . Degistirilemez olmasi demek
    // mutable olmak demek orj degerin degistirilebilir olmasi demektir.

    // capacity javanin size verdigi data depolama yer sayisidir.
    // Length ise size verilen data depolama yerinin kullanilan kismidir.
    // Java baslangic olarak size kapasiteyi 16 olarak verir.
    // Siz verilen kapasiteyi asarsaniz; java yeni capasiteyi var olanin 2 katinin 2 fazlasi olacak sekilde degistirir.

    // Default capacity i degistirebilir miyiz?


    public static void main(String[] args) {


//        StringBuilder x = new StringBuilder("musatafa");




        String s = "Java";

        s = s+"!";  // s Stringi ; istersek kasti olarak ancak degisir. atama yaptik. Atama yapmak gerkir kasti olarak
                                                        // s konteynirinin icindeki datayi degistirmek demek.

        String u ="Apex";
        String v = "Apex";
        String y = "C++";

        // StringBuilder  nasil olusturulur
        StringBuilder t = new StringBuilder("Python");  // Bu yolla ; orjinal data degistirilebilir
                                                       // ama memoyr'de de  tasarruf saglamis oluruz. (Cunku yeni yer
                                                                                                     // acmamis oluruz)

        StringBuilder m =new StringBuilder("MUSTAFA OZYURT");

        System.out.println(t);

        m.append(" / Erzurum");  // degisiklikten sonra atama yapmaya gerek yok. cunku degistirilmis oldu zaten kod yazarak

        System.out.println(m);
        t.append("!");
        System.out.println(t);  // Sb larda atama yapmadan degistirdik
        t.append("1").append("...,;"); // method zinciri

        System.out.println(t);



        StringBuilder r = new StringBuilder();

        System.out.println(r);//hic birsey gorduk. Yani r StringBuilderi olusturduk aslinda ama icine birsey koymadik.
        System.out.println(r);//hic birsey gorduk
        r.append("c");
        System.out.println(r);//r StringBuilder'e  "c" nin eklenmis halini gorduk.

        StringBuilder sb1 = new StringBuilder("Money");
        int capacity =sb1.capacity();
        int leng  =sb1.length();
        System.out.println("cap "+capacity);  //cap 21(5 + 16 yani 5 moneyden geliyor 16 da java veriyor.bedavadan!)
        System.out.println("leng " +leng);// length 5 (money 5 karakterli)

        sb1.append("!").append(".................");// 17 nokta ( "Money!"  (append yapmadan once kapasite 21 idi ekleme
                                                   // olunca asim oldu java da var olan kapasitenin iki katindan 2 fazla verdi(44)
        int c = sb1.capacity();
        int l = sb1.length();

        System.out.println(c);  // 44
        System.out.println(l);  // 23(money+!+ 17 nokta ==>toplam 23 karakter.


        StringBuilder sb2 = new StringBuilder(2);   // integer girersek direkt kapasite girmis/ belirlemis oluyoruz
       StringBuilder sbg = new StringBuilder(7);
      sbg.append("mustafa kemal");
        System.out.println(sbg);
        System.out.println(sbg.capacity());  // 16 ( 7 idi once "sbg StringBuilder"da.
                           // sonra artirim olunca icine koydugumuz String den dolayi 2*7+2= 16 yapti
        System.out.println(sb2.capacity());

        sb2.append("...");   // var olanin 2 kati

        System.out.println(sb2.capacity());   // 6  (2 yer acmistik var olanin 2 kati +2= 6)
    }

}
