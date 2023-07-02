package day12switchloops;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

      // Ex1: Ay numarasini soyleyince, numarasi verilen aydan baslayip 12. aya kadar tum aylarin
      //  isimlerini yazdiran kodu yaziniz.  8 ==> Augst   Semptember October November

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangic ayinin kacinci ay oldugunu girin");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){
            case 1 :
                System.out.println("January");
            case 2 :
                System.out.println("February");
            case 3 :
                System.out.println("March");
            case 4 :
                System.out.println("April");
            case 5 :
                System.out.println("May");
            case 6 :
                System.out.println("june");
            case 7 :
                System.out.println("july");
            case 8:
                System.out.println("August");
            case 9 :
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11 :
                System.out.println("November");
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Gecerli Ay numarasi veriniz...");
        }
        // Note:"switch" condition parantezi icerisinde : 1 String   2 byte   3  int    4 char  5 short

        // NOTE!! :"switch" condition parantezi icerisinde : 1 long  2 boolean  3 float  4 double kullanamayoruz.
             // kullanirsaniz hata alirsiniz












    }
}


