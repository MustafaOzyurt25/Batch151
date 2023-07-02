package practise_regular.day02practise;

import java.util.Scanner;

public class C07_Ternary {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */

        Scanner input = new Scanner(System.in);


        System.out.println("bir karakter giriniz");
        char ch  =input.next().charAt(0);

        System.out.println(('A'<=ch && ch<='z')?((ch>='A'&&ch<='Z')?("BUYUK HARF"):("KUCUK HARF")):("HARF DEGIL"));




























    }
}
