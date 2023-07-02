package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        /* Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki
        basamagindaki rakamlarin toplamini yazdiran kodu yaziniz.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz...");
        int number = input.nextInt();
        // Bir sayinin son rakamini alabilmek icin o sayiyi 10'a bolup kalani
        // almaliyiz.
        /*
        % ==> modulus operator; solunda bulunan sayinin, saginda bulunan
        sayiya bolumundan kalani verir.
        Dolayisiyla %10 her zaman bize  birler basamagında bulunan sayıyı
        verir.
        Bir TAM SAYIYI BIR TAMSAYIYA bolerseniz Java sonucu kesinlikle
        tam sayi yapar.Java bu durumda yuvarlama yapmaz, ondalikli kismi
        iptal eder.Yni bu durumda bir tamsayiyi 10'a bolersek birler basama
        gini silmis oluruz.

               */

        //SON RAKAMI AL:
        int lastDigit = number % 10;
        // SAYIYI KUCULT:
        number = number / 10;

        //Sondan ikinci rakami al
        int lastSecondDigit = number % 10;
        //sayi kucult
        number = number/10;

        // Sondan 3. rakami al
        int lastThirdDigit = number % 10;
        // sayi kucult
        number=number/10;
        //sondan dorduncu rakami al
        int lastFourthDigit =  number%10;
        //sayi kucult
        number = number/10;
        //sondan besinci rakami al
        int lastFifthDigit = number%10;
        //sayiyi kucult
        number = number/10;


        System.out.println( lastDigit+lastSecondDigit+lastFourthDigit
        +lastFifthDigit);
        System.out.println(number);
        System.out.println(lastThirdDigit);



    }
}
