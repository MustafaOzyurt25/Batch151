package day22stringbuilder;

public class Sb02_Tekrar {


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is   easy");
        System.out.println(sb1.insert(8, "very"));

        System.out.println(sb1.reverse()); // ysae  yrev si avaJ

        System.out.println(sb1.deleteCharAt(sb1.indexOf("a")));

        System.out.println(sb1.delete(4, 11)); //yse i avaJ

        System.out.println(sb1.reverse());  // Java i esy
        System.out.println(sb1.replace(7, 30, "very"));
                // Java i very

        System.out.println(sb1.insert(2, 2023));

        StringBuilder s = new StringBuilder("Java");
        StringBuilder t = new StringBuilder("Zava");
        System.out.println(s.compareTo(t));  //  -16


      String str=s.toString().toUpperCase();


       System.out.println(s);


    }
}
