package day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran.

         */
        /*
       1) "if" icinde "if" kullanirsaniz, "nested if" olusturmussunuz demektir.
       2) "nested if" javayi yavaslatir bu yuzden mecbur kalmadikca kullanmayiz.
       3) "nested if" gibi javayi yavaslatan kodlar "Time Consuming" olarak adlandirilir..
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age...");
        int age = input.nextInt();

        System.out.println("Please enter your gender..."); // MALE, FEMALE

        String gender = input.next();

        if (age < 0 || age > 120) {
            System.out.println("Negative ages or ages grater than 120 are invalid");
        }else if (gender.equalsIgnoreCase("male")) {// equalsIgnoreCase : male=MALE=mAle

            if (age > 65) {
                System.out.println("Can be retired");
            } else {
                System.out.println("should work");
            }

        }else if (gender.equalsIgnoreCase("female")) {

            if (age > 60) {
                System.out.println("Can be retired");
            } else {
                System.out.println("sholud work");
            }

        }else{
                System.out.println("undefined gender");
            }

    }
}