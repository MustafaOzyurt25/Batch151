package day16;

import java.util.Scanner;

public class Array02_Tekrar {

    public static void main(String[] args) {


        // +,-,*,/,% islemlerini yapabilen bir hesap makinesini yapiniz
        //kullaniic q ya basmadikca islem secmeli
        /*
        Scanner
        kullaniicdan yapacagi islemi almaliyiz
        2 sayi
        loop
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cikmak icin Q' ya basiniz");
        do {
            System.out.println("Lutfen kullanmak istediginiz islemi secin: + , - , * , / , % ");
            char islem = scanner.next().charAt(0); //  +
            if (islem=='Q'||islem=='q'){
                System.out.println("Gorusmek uzere!");
                break;
            }
            boolean t = islem == '+' || islem == '-' || islem == '*' || islem == '/' || islem == '%';
            if (!t) {
                System.out.println("Lutfen gecerli islem karakterini giriniz:+ , - , * , / , % ");
            } else {
                System.out.println("Lutfen islem yapilacak iki sayi giriniz");
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                switch (islem){

                case '+':
                    System.out.println(a + " + "+ b + " = " + ( a + b ));
                    break;
                case '-':
                    System.out.println(a + " - "+ b + " = " + ( a - b ));
                    break;
                case '*':
                    System.out.println(a + " * "+ b + " = " + ( a * b ));
                    break;

                case '/':
                    System.out.println(a + " / "+ b + " = " + ( a / b ));
                    break;

                case '%':
                    System.out.println(a + " % "+ b + " = " + ( a * b )/100);
                    break;
            }

            }



        } while (true);


    }// main

}//Class
