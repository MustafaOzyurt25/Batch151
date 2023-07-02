package practise_regular.day02practise;

import java.util.Scanner;

public class C01Scanner {

    public static void main(String[] args) {

        // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.

        Scanner input = new Scanner(System.in);


        System.out.println("Adinizi, ikinci adinizi ve soyadinizi arasinda bosluk olacak sekilde giriniz");
        String str =input.nextLine().toUpperCase().trim(); // Burak Can TAN
        char adIlkKarakter= str.charAt(0); // B

        char ikinciAdIlkKarakter= str.charAt(str.indexOf(" ")+1); // C
        char soyadIlkKarakter = str.charAt(str.lastIndexOf(" ")+1);// T

        System.out.println(adIlkKarakter+""+ikinciAdIlkKarakter+soyadIlkKarakter);





    }
}
