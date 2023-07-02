package day14loops;

import java.util.Scanner;

public class Loops04_Tekrar {

    public static void main(String[] args) {

        //Kullanici username ve password'u girsin.
        //3 kereden fazla yanlis girerse "Your account was blocked" mesaji alsin
        //3 kereye kadar yanlis girerse "Invalid username or password, try again" mesaji alsin
        //Dogru girerse "Welcome to your account" mesaji alsin


        Scanner scanner = new Scanner(System.in);


        String validUsername = "ozyurdum";
        String validPassword = "5225232";


        int counter = 1;
        do {
            System.out.println("lutfen username  giriniz ");
            String username = scanner.next();
            System.out.println("lutfen password'unuzu  giriniz ");
            String password = scanner.next();


            boolean r = username.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validPassword);

            if (r) {
                System.out.println("Welcome to your account!");

                break;
            } else if (!r && counter < 4) {
                System.out.println("Invalid username or password, try again");


            } else if (!r && counter > 3) {

                System.out.println("Your account was blocked");
                break;
            }


            counter++;


        } while (counter < 5);


    }
}
