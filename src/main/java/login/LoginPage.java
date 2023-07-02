package login;

import java.util.Scanner;

public class LoginPage {

    /*
    Design a signup and LoginPage page for a site.

menu: the user is shown the menu for action selection.

register: get name-surname, username, email and password information from the user.
username, email and password are kept in a list.
same username or email is not accepted.

LoginPage: username/email and password are entered.
If the username or email is not found, it is not registered, sign up warning is given.
If the username/email and the password registered in the same index are verified, the site will be logged.

email validation: must not contain spaces
: must contain @


password validation:
: must be at least 6 characters
     */

    public static void main(String[] args) {
        start();
        UserService userService = new UserService();
        userService.signUp();

    }



    public static void start(){
        Scanner input = new Scanner(System.in);
        int secenek;
        UserService service = new UserService();

        do {
            showMenu();
             secenek = input.nextInt();
            switch (secenek){
                case 1:
                   service.signUp();
                    break;
                case 2:
                    // LoginPage
                    break;
                case 0:
                    // Q
                    break;
                default:
                    System.out.println("Yanlis deger girdiniz.tekrar deneyiniz");


            }


        }while (secenek!=0);

    }

    private static void showMenu() {
        System.out.println("TECHPRO");
        System.out.println("1-sign Up");
        System.out.println("2-Log in");
        System.out.println("0-Quit");
        System.out.println("Secimiz");

    }


}
