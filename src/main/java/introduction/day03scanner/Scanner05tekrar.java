package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05tekrar {

    //Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu isteyiniz
    //i) Alanını hesaplayınız.
    //ii) Çevresini hesaplayınız.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen dikdortgenin uzun kenarini giriniz...");
        double uzunKenar =input.nextDouble();
        System.out.println("Tesekkurler. Simdi lutfen dikdortgenin kisa kenarini giriniz... ");
        double kisaKenar =input.nextDouble();
        System.out.println(" tesekkurler...");

        double dikDortgeninAlani = uzunKenar*kisaKenar;
        System.out.println("dikDortgeninAlani = " + dikDortgeninAlani);

        double dikDortgeninCevresi = 2*uzunKenar + 2*kisaKenar;
        System.out.println("dikDortgeninCevresi = " + dikDortgeninCevresi);
        System.out.println(" iyi calismalar!");





    }
}
