package javaders.day07stingstringmanipulations;

public class C01_StringManipulations_gunduz {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

       // s Stringinin money ile bitip bitmedigini kontrol ediniz

        System.out.println("s.endsWith(\"money\") = " + s.endsWith("money"));  // veya

        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);

        // endsWith(): s Stringinin belirli bir karakter ile bitip bitmedigini bize verir.
              //         boolean return eder. tek karakter ve coklu karakter ile kullanilabilir



        // replace(): s Stringinin belirli bir karakterinin/lerinin ile istenen karakter/ler ile yer
        // degistirilmesini saglar.
        //        String return eder. tek karakter ve coklu karakter ile kullanilabilir
        // tekli karakter ile de calisir.
                    
        // Ex : s String'indeki "money" kelimesini "dolar" kelimesi ile yer degistiriniz


        System.out.println("s.replace(\"money\",\"$dolar\") = " + s.replace("money", "$dolar"));


   // veya:
        
        String s1 = s.replace("money", "dolar");
        System.out.println("s1 = " + s1);


        System.out.println("s.replace(\"earn\",\"win\") = " + s.replace("earn", "win"));
        //Lwin Java win money


     //
        System.out.println(s.replace("a", "*"));

        // veya

        System.out.println(s.replace('a', '*'));


        System.out.println(s.replace("n", "***"));

        System.out.println(s.replace("e", ""));


       // String s = "Learn Java earn money";

        String s6=s.replace("e", "");
        System.out.println(s6);  // char variable icine hiclik olmaz. mutlaka bir(only one) karakter yazmaliyiz.
        //space javada char degiskeni icin kullanilabilir. Bu nedenle silme yapmak icin mutlaka String kullanmailiyiz.

        String t = "Yucel 25 ya$indadir sandik ama 30'mus!.";

        /*
        replaceAll () : Bir grupp datayi degistirmek icin kullanilir.
                   Bir grup data'yi ifade edebilmek icin Regular Expression (Regex) kullanilir.*/


        String t1= t.replaceAll("[0-9]" ,"*");
        System.out.println(t1);

        /*
        en cok kukkanilan regex exp


        Tum rakamlar ==> [0-9]
        Tum kucuk harfler ==>[a-z]
        Tum buyuk harfler ==>[A-Z]
        Tum harfler ==>[a-zA-Z]
        Tum  harfler VE Tum rakamlar  ==>[a-zA-Z0-9]
        Tum Noktalama Isaretleri ===> \\p{punct}
        Tum  Sesli harfler ===> [aeiouAEIOU]

        ^ ===> den farkli, haricinde.

        /*
        en cok kukkanilan regex exp
        Tum rakamlar Haric ==> [^0-9]
        Tum kucuk harfler Haric ==>[^a-z]
        Tum buyuk harfler Haric ==>[^A-Z]
        Tum harfler Haric ==>[^a-zA-Z]
        Tum  harfler VE Tum rakamlar Haric ==>[^a-zA-Z0-9]
        Tum Noktalama Isaretleri Haric ===> \\p{punct}
        Tum  Sesli harfler Haric ===> [^aeiouAEIOU]

*/

        //String t = "Yucel 25 ya$indadir sandik ama 30'mus!.";

        String t2 =t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2); //!!!!! !! !!$!!!!!!! !!!!!! !!! !!'!!!!.

        String t3 = t.replaceAll("[^ ]", "+");
        System.out.println(t3);//+++++ ++ ++++++++++ ++++++ +++ ++++++++

        String t4=t.replaceAll("[^a-z]","?");
        System.out.println(t4);  // ?ucel????ya?indadir?sandik?ama????mus??
        
        String t5=t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t5 = " + t5);

    }
}
