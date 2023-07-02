package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {


        // INTERWIEW QUESTIONS USA QA
        // String str = "abbccdc" tkrarsiz karakterleri ekrana yaz

        /*
         *********************** if(){} **********************\\
         * Kodlarin calismasi bazi kodlara baglidir. Mesela: cok calisirsam , java ogrenecem.
         * java ogrenme eylemi cok calismaya baglidir.
         * 1. eylem gerceklesmeden ikinci eylem gerceklesmez.
         * if(){}
         * () paramntez icine sart yazilir. eger true dondururse { } body arasindaki kod calisir.
         * aksi halde if body disina cikar.....
         */

        String str = "aac";// soru cozumu cok uzmamasi icin boyle alindi

        char ch = str.charAt(0);
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {

            System.out.println(ch);// calismaz
        }// if body: iki curly braces arasi
        char ch1 = str.charAt(1);
        if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }
        char ch2 = str.charAt(2);
        if (str.indexOf(ch2) == str.lastIndexOf(ch2)) {
            System.out.println(ch2);

        }

// verilen sayi pozitif ise ekrana pozitif yazan kodu yaziniz.

        int num = -20;
        if (num > 0) {
            System.out.println("pozitif");

        }
        System.out.println("***********");


        // EX: sayi -1 ila  10  arasindaysa ekrana "Rakam" yaz

        int sayi = 6;

        if (sayi > -1 && sayi < 10) {
            System.out.println("Rakam");

        }

/// sayi uc basamakli ise ekrana "verilen data uc basamaklidir"
// yazdiran kodu yaziniz


        int number = -900;

        number = Math.abs(number);
// 1. yol
        if (number > 99 && number < 1000) {
            System.out.println("Sayi uc basamaklidir");
        }
// 2.yol:

            if (number > 99 && number < 1000 || number < -99 && number > -1000) {
                System.out.println("***sayi uc basamaklidir.");

            }
// eger Math Classindan abs() metodunu kullanmak istemezseniz
        // asagidaki gibi iki kez if statement yazabiliriz
        // 3.yol:
        int number1 = -900;
        if(number1>99 && number1<100){
            System.out.println("****sayi uc basamaklidir.");}
        if(number1>-1000 && number1<-99){
            System.out.println("****sayi uc basamaklidir.");
            }




    }
}





















