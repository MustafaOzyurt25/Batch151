package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {

    public static void main(String[] args) {

        // Kullanicinin coklu datayi bir Arraya yerlestirebilmesi icin gereken kodu yaziniz
        // Scanner
        // coklu datayi olusturmak icin Array olustur
        // kullanicidan Arraya kac tane eleman koyacagini almaliyim.
        // loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediniz elmen sayisini giriniz");

        int numOfElements = input.nextInt();
        String stdNames[] = new String[numOfElements];
        System.out.println("durmak icin q ya bas");


        for (int i = 0; i < stdNames.length; i++) {
            System.out.println("Enter the " + (i + 1) + ". student name");

            String name = input.next();


            if (name.equalsIgnoreCase("q")) {
                break;

            } else {
                stdNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(stdNames));


    }
}
