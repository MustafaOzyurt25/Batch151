package introduction.day03scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 1. : Scanner Classdan bir obje olustur.

        Scanner input = new Scanner(System.in);

        //1.Obje ismini input yaptik. cunku bu objeckt disardan bilgi alcak.
        //2. Kullaniciya  ne istediginize
        System.out.println("Lutfen gir yasini....");
       String adress = input.nextLine();
        System.out.println("adress = " + adress);

// 3. Uygun metodu kullanarak kullanicinin verdigi datayi memorye yerlestiriniz.
    }
}
