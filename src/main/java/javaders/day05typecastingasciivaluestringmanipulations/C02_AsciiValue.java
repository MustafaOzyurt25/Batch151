package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {

    public static void main(String[] args) {


     // 'A' karakterinin Ascii degerini hesaplatan kodu yaziniz

        int asciiA = 'A';
        System.out.println("asciiA = "+asciiA);
        
        int asciia = 'a';
        System.out.println("asciia = " + asciia);

        char adIlkHarf = 'a';
        System.out.println("adIlkHarf  = " + adIlkHarf );


        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);

        int ascii5 = '5';
        System.out.println("ascii55 = " + ascii5);

        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);

        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);
        byte ascii7 = '7';
        System.out.println("ascii7 = " + ascii7);
        // Java' da char data type 'ini matematiksel islemlerde
        // kullanirsaniz ASCII table deki sayisal degerleri alir.
        // Numeric Data typelari: byte, short, int, long, float, double.
        // char variable'lar  ise hem say hem de resim karakteri barindirir.
        // boolean ise sayisal deger barindirmaz.Numerik olmayan data type' dir
        // java da char data type'ina int deger de atanabilir sembol, harf vs de atanabilir.
        // cunku char data type'nin ascii'den gelen bir sayisal ( numeric) bir degeri bir de
        // resim karakteri vardir.
        String hiclik ="";

        char ch = '*';
        char h = '9';
        char space = ' ';
        char sj = '$';
        char rakam = '0';
        int ascii9 = '9';
        System.out.println("ascii9 = " + ascii9);

        int deger = 20;
        char s = '$';
        System.out.println(deger + s);

        System.out.println("s+deger = " + (s + deger));

        int deger2 = 0;
        char smb2 = '+';
        System.out.println(deger2 + smb2);

        String name = "123";
        int number = 45;
        System.out.println(name + number); // 12345 buna concatination denir.

        String str1 = "java";
        char ch3 = 'G';
        int sp = 5;
        System.out.println(ch3 + sp + str1);
        String sayiStr5 = "123";
        String sayiStr6 = "189522";
        System.out.println("sayiStr6+sayiStr5  = " + sayiStr6 + sayiStr5);
        System.out.println(sayiStr5 + sayiStr6);

        char rakam1 = '1';
        char rakam2 = '2';
        char rakam3 = '3';
        char rakam4 = '4';
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1 + rakam2 + rakam3 + rakam4);  //  1234
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + (rakam1 + rakam2 + rakam3 + rakam4)); // 202 islem oceligine gore once parantez icini yapti. bu durumda ascii table daki degerlerini topladi. sonra da Concatinaion yapti.

        //    ***********ASCII degerlerinden yararlanilarak neler yapilabilir***************

        byte b = 5;
        char ch2 = 'h';

        int asciih = 'h';
        System.out.println("asciih = " + asciih);//104
        int ascii8 = '8';
        System.out.println("ascii8 = " + ascii8);//56


        long l = 542168784L;
        System.out.println(ch2 > l); // false

        float f = 2.45852f;
        double d = 2.1698;
        System.out.println("f>d :" + (f > d)); // true
        System.out.println("b<f : " + (b < f)); // false

        System.out.println("b>ch2= " + (b > ch2));//false

        int sayiInt = 100;
        long sayiLong = 100L;
        System.out.println("sayiInt == sayiLong : " +( sayiInt == sayiLong));




        int sayiint3 = 9;
        char sayiChar = '9';
        System.out.println(9 > '9');// false

        String df = "9";
        System.out.println("df = " + df);

        int asciiDell ='␡';
        System.out.println("asciiDell = " + asciiDell);








    }


}
