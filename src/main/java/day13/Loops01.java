package day13;

public class Loops01 {

    public static void main(String[] args) {

        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");

            }

        }


        // cift indexlerdeki karakterleri buyuk yapin.

        System.out.println();

        String s = "miami";

        for (int i = 0; i < s.length(); i++) {

            String ch = s.substring(i, i + 1);

            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());
            } else {
                System.out.print(ch);
            }


        }
        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz

        System.out.println();
        String str = "Tokaci"; // Tok

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                break;
            } else {
                System.out.print(ch);
            }

        }
//verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz

        System.out.println();

        String s1 = "Tokatci"; //ict

        for (int i = s1.length() - 1; i >= 0; i--) {

            char ch = s1.charAt(i);// i

            if (ch == 'a') {
                break;  // loop u herhengi bir sarta gore kirmak break ile olur.
            } else {
                System.out.print(ch);
            }


        }


    }

}
