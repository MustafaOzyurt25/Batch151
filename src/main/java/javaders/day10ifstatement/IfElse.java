package javaders.day10ifstatement;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
       /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi gir");
        int y = scanner.nextInt();


        if (y%2==0){
            System.out.println("cift sayi");

        }else {  // geriye kalan tum ihtimaller icin burasi calisir.
            System.out.println("tek sayi");
        }
*/
        // verilen bir sayinin p.n.notr mu oldugunu yaziniz

        int number = 0;
        if(number<0){
            System.out.println("sayi negatif");

        }else if (number==0) {
            System.out.println("notr sayi");

        }else {  // geriye kalan hersey
            System.out.println("pozitif sayi");
        }
// uclu bir aradyasa dsadece bir tane calisir.
    }
}
