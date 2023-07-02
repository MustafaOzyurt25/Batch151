package day35exceptions;

public class E02_Tekrar {
    public static void main(String[] args) {
        // Bir Stringdeki  karakteri index kullanarak alan bir method olusturunuz

        System.out.println(indexleKarekterAlStringden("java", 10));

    }

    public static String indexleKarekterAlStringden(String s, int idx) {

        try {
            return s.substring(idx, idx + 1);
        } catch (StringIndexOutOfBoundsException e) {

            idx = Math.abs(idx);

            return s.substring(idx % s.length(), idx % s.length() +1);
        }

    }


}



