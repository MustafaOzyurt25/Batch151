package day16;

import java.util.Scanner;

public class Array02 {

    public static void main(String[] args) {
        // +,-,*,/,% islemlerini yapabilen bir hesap makinesini yapiniz
        //kullaniic q ya basmadikca islem secmeli
        /*
        Scanner
        kullaniicdan yapacagi islemi almaliyiz
        2 sayi
        loop
         */

/*
        char opr ='';
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen yapmak istedigin islemi gir: +,-,*,/,% ");

            opr =  input.next().charAt(0);

            System.out.println("1. sayiyi gir");
            int number1 = input.nextInt();
            System.out.println("2. sayiyi gir");
            int number2 = input.nextInt();

            switch (opr) {
                case '+':
                    System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
                    break;
                case '-':
                    System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
                    break;

                case '*':
                    System.out.println(number1 + "*" + number2 + "=" + number1 * number2);
                    break;

                case '/':
                    System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
                    break;
                case '%':
                    System.out.println(number1 + "%" + number2 + "=" + (number1 * number2)/100);
                    break;


            }


        } while (opr != 'q');


 */

    }


}
