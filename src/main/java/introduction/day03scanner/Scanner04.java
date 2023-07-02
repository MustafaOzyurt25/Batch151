package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Iki Sayi Giriniz Lutfen....");
        double firstNumber =input.nextDouble();
        double secondNumber =input.nextDouble();
        System.out.println(firstNumber+secondNumber);
    }
}
