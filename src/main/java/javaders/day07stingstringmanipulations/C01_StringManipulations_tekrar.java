package javaders.day07stingstringmanipulations;


public class C01_StringManipulations_tekrar {

    public static void main(String[] args) {

        String s = "Learn Java earn money";



        /*
         ********************  endsWith()  **************
         endsWith () Metnin belirli bir datayla bitip bitmedigini bize verir
                      True yada false seklinde boolean bir deger dondurur.
                      Icerisine tek karakterde coklu karakterde koyabilirsiniz
         */

        String s1 = "Learn   money Java earn ";
        boolean isEnd = s1.endsWith("money");
        System.out.println("isEnd = " + isEnd);

        boolean isIceriyormu = s1.contains("money");

        /*
        contains() methodu cumlenin hrhangi bir yerinde istenilen datayi bulursa true dondurur.
        Ancak task'in bizden istedigi "money" kelimesiyle bitip bitmedigi oldugu icin
        endsWith() kullanmaliyiz.
         */

        //************************  replace  **************

        // ex: s Stringindeki "money" kelimesini "dolar" ile degistiriniz

        //  String s = "Learn Java earn money";

        String sn = s.replace("money", "dollar");
        System.out.println("sn = " + sn);

          // s Stringindeki earn yerine win yaziniz.

        String s3= s.replace("earn", "win");
        System.out.println("s3 = " + s3);


        String s4 = s.replace('a','*'); // makbul olan 
        System.out.println("s4 = " + s4);

        String s5 = s.replace("a","*"); // makbul olmayan 

        // ex: s Stringindeki L  harfini  ***  ile degistiriniz
        
        String s6 =s.replace("L","***");
        System.out.println("s6 = " + s6);     // s6 = ***earn Java earn money
        // ex: s Stringindeki tum e harfini  siliniz.
        String s7 = s.replace("e", "");
        System.out.println("s7 = " + s7);
        
        String s8 = s.replace("e"," "  );
        System.out.println("s8 = " + s8);  // s8 = L arn Java  arn mon y     (space silmiyor)
        
        String s9 = s.replace("earn", "");
        System.out.println("s9 = " + s9);   // s9 = L Java  money
        
        String t ="Dolma Kalem";

        String t1 = t.replace("Dolma","Biber");
        System.out.println("t1 = " + t1);


        //******************   replaceAll   ********************************

        

        
        
        
        
        
        
        
        
        
        
        
        
        
        


    }


}
