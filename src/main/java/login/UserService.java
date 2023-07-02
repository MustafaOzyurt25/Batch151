package login;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class UserService implements Zorunlu {

    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();
    List<String> usernames = new ArrayList<>();
    List<String> names =new ArrayList<>();

    @Override
    public void signUp() {
        Scanner input = new Scanner(System.in);
       //1) Name
        System.out.println("Name-Surname: ");
        String name = input.nextLine();
        boolean existUsername;
        String username;
        do {
            System.out.println("Enter username: ");
            username =input.next();


            existUsername= usernames.contains(username);

            if (existUsername){
                System.out.println("daha once kullanildi");
            }


        }while (existUsername);

        usernames.add(username);

        /*
        3) Email
        must contain @
        must be inique
         */

        String email;
        boolean existEmail;
        boolean isValid;

        do {
            System.out.println("Lutfen email adresinizi girin: ");

            email=input.next();

            existEmail = emails.contains(email);

           isValid =isValidEmail(email);

            if (existEmail){
                System.out.println("Bu email daha once kullanildi tekrar deneyin");
                isValid = false;

            }

        }while (existEmail||!isValid);
        emails.add(email);

        /*
        4) password
        6 karakter enz
         */

        String password;
        boolean isValidPass;

        do {
            System.out.println("Lutfen parolaniiz giriniz");
            System.out.println("UYARI:  6 karakter enz ");
            password = input.nextLine();
            isValidPass=isValidPass(password);
        }while (!isValidPass);

        passwords.add(password);


    }

    public boolean isValidEmail(String email){

        boolean isValid = email.contains("@");
        return isValid;

    }


    public boolean isValidPass(String pass){
      boolean isValid;
       if (pass.length()>=6){
           isValid=true;

       }else {
           isValid=false;
           System.out.println("hatali password");
       }
       return isValid;
    }



    @Override
    public void logIn() {

    }




}
