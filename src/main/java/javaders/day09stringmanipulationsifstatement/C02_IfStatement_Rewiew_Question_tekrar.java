package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement_Rewiew_Question_tekrar {

    public static void main(String[] args) {

        // INTERWIEW QUESTIONS USA QA
        // String str = "abbccdc" tekrarsiz karakterleri ekrana yaz
        String str = "abbccdc" ;

        System.out.println("str = " + str);

        int length_Str=str.length();
        System.out.println("length_Str = " + length_Str);

        char ch1 = str.charAt(0);
        if (str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println("ch1 = " + ch1);
        }

        char ch2 = str.charAt(1);
        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println("ch2 = " + ch2);
        }
        char ch3 = str.charAt(2);
        if (str.indexOf(ch3 )==str.lastIndexOf(ch3)){
            System.out.println("ch3  = " + ch3 );
        }
        char ch4 = str.charAt(3);
        if (str.indexOf(ch4)==str.lastIndexOf(ch4)){
            System.out.println("ch4= " + ch4);
        }
        char ch5 = str.charAt(4);
        if (str.indexOf(ch5 )==str.lastIndexOf(ch5 )){
            System.out.println("ch5 = " + ch5 );
        }
        char ch6 = str.charAt(5);
        if (str.indexOf(ch6)==str.lastIndexOf(ch6)){
            System.out.println("ch6= " + ch6);
        }





        else {
        System.out.println("tum karakterlerin tekrari var!");}












    }

}
