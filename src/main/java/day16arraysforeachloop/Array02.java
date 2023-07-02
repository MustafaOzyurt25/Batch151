package day16arraysforeachloop;

import java.util.Scanner;

public class Array02 {

    public static void main(String[] args) {


        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Kullanicidan yapacagi islemi almaliyiz
            3)Kullanicidan iki tane sayi almaliyiz
            4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyim
         */
        //+, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin
        //q ya basmasi durumunda "see you again" mesaji verilerek uygulama dursun
        //kullanici hesaplama operatoru disinda bir sey girmesi durumunda
        // "Undefined operation" mesaji verilerek uygulama dursun

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter q to stop calculation");

        do {

            System.out.println("Please enter the operation among +,-,*,/,%");

            char opr = input.next().toLowerCase().charAt(0);

            if (opr == 'q') {
                System.out.println(" see you again");
                break;
            }
            boolean r = opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%';

            if (!r) {
                System.out.println("Undefined operation");
                break;
            }
            System.out.println("1.sayiyi giriniz");  // opr >>>> +
            int a =input.nextInt();

            System.out.println("2.sayiyi giriniz");
            int b =input.nextInt();



            switch (opr){
                case '+':
                    System.out.println(a +" + "+ b +" = "+(a+b));
                    break;
                case '-':
                    System.out.println(a +" - "+ b +" = "+(a-b));
                    break;
                case '*':
                    System.out.println(a +" x "+ b +" = "+(a*b));
                    break;
                case '/':
                    System.out.println(a +" / "+ b +" = "+(a/b));
                    break;
                case '%':
                    System.out.println(a +" % "+ b +" = "+(a*b/100));
                    break;


            }
        } while (true);
    }
}
