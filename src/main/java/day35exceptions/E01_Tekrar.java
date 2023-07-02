package day35exceptions;

public class E01_Tekrar {
    public static void main(String[] args) {
        // Bir Stringi'i Integere ceviren method olusturunuz
        System.out.println(integereCevir("a1")+ 5);
       // System.out.println(integereCevir(""));
        //System.out.println(integereCevir(null));


    }



    public static Integer integereCevir(String s){

        try {
            return Integer.valueOf(s);

        }catch (NumberFormatException e){

            System.out.println(e.getMessage());
            s=s.replaceAll("[^0-9]","");

            return Integer.valueOf(s);
        }



    }
}
