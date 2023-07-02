package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02tekrar {
    public static void main(String[] args) {
        //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen ilk isminizi giriniz...");
        String ilkIsim = input.next();
        System.out.println(" Lutfen Soyisminizi giriniz...");
        String soyIsim = input.next();
        System.out.println("Isminiz ve Soyisminiz : " + ilkIsim+" "+soyIsim);

    }
}
