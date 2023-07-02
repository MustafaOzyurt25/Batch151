package day13incrementdecrementloops;

public class ForLoop02 {

    public static void main(String[] args) {

/*
        // Ex ; verilen bir stringde ilk 'a' harfinden onceki tum karakterlri konsola yaziniz

        String str = "I love Java";  // I love J

        for (int i =0; i<str.length();i++ ){

            if(str.charAt(i)=='a'){


            }


            System.out.print(str.charAt(i));
        }

*/
        String str = "Tramway";


        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i) == 'a') {
                break;


            }


            System.out.print(str.charAt(i));
        }


        // ex : verilen bir stringde son 'a' dan sonraki tum karakterleri ters sirada yazdiriniz

        // germany ==> yn
        System.out.println();


        String t = "Germany";

        for (int i = t.length() - 1; i >= 0; i--) {
            char ch = t.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }


    }
}
