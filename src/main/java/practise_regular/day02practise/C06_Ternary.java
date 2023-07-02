package practise_regular.day02practise;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 2 sayi girin");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println(sayi1==sayi2?("Sayılar Birbirine Esit"):(sayi1>sayi2?("buyuk sayi: "+sayi1):("buyuk sayi: "+sayi2)));

    }

}
