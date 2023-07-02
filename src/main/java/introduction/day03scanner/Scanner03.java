package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {
    // Kullanicidan adres al ve ekrana yaz

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adresinizi giriniz...");

       String adress = input.nextLine();
        System.out.println("adress = " + adress);
    }


}
