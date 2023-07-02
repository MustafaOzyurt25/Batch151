package day34exceptions;

public class E03_Tekrar {


    // Bir Stringdeki character sayisini veren method olusturunuz

    public static void main(String[] args) {

        String s = null;
        System.out.println(getNumberOfCharacterOfString(s));

    }


    public static int getNumberOfCharacterOfString(String c) {
       int res ;

        try {

            res=c.length();
        }catch (NullPointerException e){

            System.out.println(e.getMessage());
            res=0;
        }


        return res;
    }
}
