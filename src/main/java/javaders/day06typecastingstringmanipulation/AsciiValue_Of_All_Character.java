package javaders.day06typecastingstringmanipulation;

import java.util.Scanner;

public class AsciiValue_Of_All_Character {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ASCII Degerini Hesaplamak Icin Herhangi Bir Karakter Girin Lutfen:");
        char ch = input.next().charAt(0); // ch konteynirinda bir karakter var. Ayni zamanda ch kontenirinda girilen
        // karakterin bir saisal karsiligini da kullanmak mumkun. bunun icin de int bir variable olusturmaliyiz:

        int ascii = ch;
        System.out.println(ch + " 'in ASCII değeri: " + ascii);
    }
}

