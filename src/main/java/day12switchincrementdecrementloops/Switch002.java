package day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch002 {

    public static void main(String[] args) {
        // kullanicidan ald. charakterin sesli harf olup olmadigini kontrol edin

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a letter");

        // 1.way

        char letter = scan.next().charAt(0);

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("It is a vovel ");
                break;
            default:
                System.out.println("It is not a vovel");
        }

//*************************************************************************************

                System.out.println("enter a letter");
                String letter2 = scan.next().substring(0, 1).toLowerCase();

                switch (letter2) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":

                        System.out.println("It is a vovel ");
                        break;
                    default:
                        System.out.println("It is not a vovel");


                }

                System.out.println("enter a letter");
                String letter3 = scan.next().substring(0, 1).toLowerCase();

                switch (letter3) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":

                        System.out.println(letter3 + " is a vovel ");
                        break;
                    default:
                        System.out.println(letter3 +  "is not a vovel");


                }


        }
    }
