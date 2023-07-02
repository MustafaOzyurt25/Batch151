package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03tekrar {
    public static void main(String[] args) {
        //Kullanicidan adresini aliniz ve ekrana yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen adresinizi Giriniz... ");
        String adress = input.nextLine();
        System.out.println("Adresiniz = "+ "  " + adress);
    }
}
