package practise_regular.day_01_practise;

import java.util.Scanner;

public class C07_ifElse {

    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner scanner = new Scanner(System.in);


        System.out.println("Lutfen Ilk Sayiyi   Giriniz");
        int ilkSayi =scanner.nextInt();

        System.out.println("Lutfen ikinci Sayiyi   Giriniz");
        int ikinciSayi = scanner.nextInt();


        if (ilkSayi>ikinciSayi){
            System.out.println("ilk sayi ikinci sayidan buyuk");
        }else {
            System.out.println("ilk sayi ikinci sayidan buyuk degil");
        }










    }


}
