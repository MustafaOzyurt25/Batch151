package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {
    //Kullanicidan aldiginiz 5 basamakli bir sayinin ilk 2 ve son iki basamagindaki rakamlarim toplamini yazdiran
    // kodu olusturunuz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //38671
        System.out.println("Lutfen 5 basamakli bir sayi giriniz..");
        int number =input.nextInt();

        // 38671

        int lastDigit= number%10; // 1
        number = number/10; // sayi artik 4 basamakli : 3867

        int lastSecondDigit= number%10; // 7 rakamini aldik.
        number = number/10; // sayi artik 3 basamakli 386

        int lastThirdDigit= number%10;// 6
        number = number/10; // sayi artik 2 basamakli 38

        int lastfourthDigit= number%10;// 8
        number = number/10; // sayi artik 1 basamakli 3

        int lastFifthDigit = number%10;// 3


        System.out.println(lastDigit+ lastSecondDigit+lastfourthDigit+lastFifthDigit);













    }
}
