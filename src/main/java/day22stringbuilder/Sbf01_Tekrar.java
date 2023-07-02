package day22stringbuilder;

public class Sbf01_Tekrar {

    public static void main(String[] args) {

        StringBuffer m = new StringBuffer("Mustafa Ozyurt");

        System.out.println(m.reverse().append("M").charAt(14));
        System.out.println(m.reverse());  // truyzO afatsuM




    }
}
