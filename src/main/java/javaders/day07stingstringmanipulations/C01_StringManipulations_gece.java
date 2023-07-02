package javaders.day07stingstringmanipulations;

public class C01_StringManipulations_gece {
    public static void main(String[] args) {

        /*
        bir grub datayi degistirmek iicin kullanilir

        bir grub data = Reguler Expression (regex)kullanilir
         */
/*
 1) Tum rakamalar ==> [0-9]
 2) Tum kucuk harfler ===> [a-z]
 3) Tum buyuk harfler ===> [A-Z]
 4) Tum harfler ===> [a-zA-Z]
 5) Tum  harfler Ve rakamlar         ===> [a-zA-Z0-9]
 6) Tum sesli harfler         ===> [aeiouAeiou]
 7) Tum Noktalama isaretleri          ===> \\p{Punct}
 
 
 
 
 
 1) Tum rakamalar ==> [^0-9]
 2) Tum kucuk harfler ===> [^a-z]
 3) Tum buyuk harfler ===> [^A-Z]
 4) Tum harfler ===> [^a-zA-Z]
 5) Tum  harfler Ve rakamlar  haric       ===> [^a-zA-Z0-9]
 6) Tum sesli harfler   haric      ===> [^aeiouAeiou]
 7) Tum Noktalama isaretleri   haric       ===> \\p{Punct}********** ornek uzerinde gosterecem.
 
 
 */


        // endsWith () Metnin belirli bir datayla bitip bitmedigini bize verir.
        // True yada false seklinde boolean bir deger dondurur.icerisine tek karakter
        // yada coklu karakter de koyabiliriz.

        String s = "Mehmet Fatih bey 20 yasinda QA_Developer kursunda $ dolarla maas kazanmistir...";

       // Ex: s String'inin "money" ile bitip bitmedigini kontrol ediniz

         boolean isEnd = s.endsWith("money");
        System.out.println("isEnd= " + isEnd);





        // String s  deki tum rakamalari * ile deg.
        String s1 = s.replaceAll("[0-9]", "*");

        System.out.println("s1 = " + s1);

        // String s  deki tum rakamalari ve harfleri "@" ile deg.

        String s2 = s.replaceAll("[A-Za-z0-9]", "@");
        System.out.println("s2 = " + s2);


// String s  deki tum space ler disindaki karakterleri "+" ya cev
        String s3 = s.replaceAll("[^ ]", "*");

        System.out.println("s3 = " + s3);  // s3 = ****** ***** *** ** ******* ************ ******** * ******* **** **************


// String s  deki tum kucuk harfler disindaki karakterleri "*" ya ceviriniz

        String s4 = s.replaceAll("[^a-z]", "*"); //
        System.out.println("s4 = " + s4);

        // String  s = "Mehmet Fatih bey 20 yasinda QA_Developer kursunda $ dolarla maas kazanmistir..."

// String s  deki tum sesli harfler disindaki karakterleri "$" ya ceviriniz

        String s5 = s.replaceAll("[^aeiouAEIOU]", "&"); //

        System.out.println("s5 = " + s5); // s5 = &e&&e&&&a&i&&&e&&&&&&a&i&&a&&A&&e&e&o&e&&&u&&u&&a&&&&o&a&&a&&aa&&&a&a&&i&&i&&&&


    }


}
