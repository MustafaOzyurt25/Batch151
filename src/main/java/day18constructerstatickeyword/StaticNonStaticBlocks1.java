package day18constructerstatickeyword;

/*
1) "Static blockl"lar static variable'lara "ilk degerlerini atamak"(initialize) icin kullanilir
2) "static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
3) "static" bir variable'a deger atamak iicn yazilmasi gereken kod main method icine de yazilabilir
 ama
 "static block" icine yazilan kod "main method " icine yazilan koddan once calistirilir,
bir Classda birden dazla static blok varsa ustteki once calistirilir.
4)Bir classda birden fazla static blok varsa once ustteki calistirilir.
 */


import java.time.LocalDate;

public class StaticNonStaticBlocks1 {


    // Static variable'lar static blocklar kullanilmadan da ilk deger atanabilir.
    public static double pi = 3.14;      // kod yazmak gerekmiyorsa bu sekilde degeri ata ve gec.

    public static double price;


    public static void main(String[] args) {
        System.out.println("hey I am  a main Method");
    }

    static {
        System.out.println("hey  I am a static block2");
    }

    static  {
        System.out.println("hey  I am a static block1");

        LocalDate d = LocalDate.now();
        if (d.getDayOfMonth() == 3) {            // bura gibi static variable ' e deger atamak icin kod
                                                // yazmaniz gerekirse static blok kullaniriz.
            price = 1000;
        } else {
            price = 1200;
        }

    }


}