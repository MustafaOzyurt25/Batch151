package day12switchloops;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {
        // KUl.dan bir ukl ismi

                /*
            Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the ocuntries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ulke ismi GIRINIZ : America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France ");
        String countryName = input.nextLine();

        switch (countryName.toLowerCase()) {
            case "america":
                System.out.println("US");
                break;

            case "england":
                System.out.println("UK");
                break;

            case "germany":
                System.out.println("DE");
                break;

            case "turkey":
                System.out.println("TR");
                break;

            case "spain":
                System.out.println("UK");
                break;

            default:
                System.out.println("Bu ulke tanimli degil");

        }


    }
}
