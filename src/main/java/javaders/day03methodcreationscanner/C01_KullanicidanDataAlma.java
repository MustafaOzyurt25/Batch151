package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_KullanicidanDataAlma {

    public static void main(String[] args) {
        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character veriniz");
        char ch = input.next().charAt(0);//talip
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);

        // Sadece char data tipi icin nextChar() diye bir method olmadigi icin
        //  kullanicidan data alip ch konteynirina yerlestirmek icin next().charAt(0);
        // methodunu kullaniriz

        // Aralarinda bir tab bosluk birakarak tek sout ile ayni sekli olusturalim:

        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t" +
                "\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);
        System.out.println()
        ;

        System.out.println("\t\t"+ch+"\t\t");
        System.out.println("\t"+ch+"\t\t"+ch);
        System.out.println(ch+"\t\t"+ch+"\t\t"+ch);




    }

    }
