package day35exceptions;

public class E01 {
    public static void main(String[] args) {
        // Bir Stringi i Integere ceviren method olusturunuz
        System.out.println(convertStringToInt("123" )+ 2); // ispatlamak icin +2 yi koyduk    125
        System.out.println(convertStringToInt("12abA"));  //NumberFormatException: valueOf() method'u non-digit
        //System.out.println(convertStringToInt(""));      // character iceren bir String ile kullanildiginda atilir.

    }




    public  static int convertStringToInt(String str){

        System.out.println(str);
       try {
          return Integer.valueOf(str);
       }catch (NumberFormatException e){
           System.out.println("Do not use non-digit characters");
           str=str.replaceAll("[^0-9]","");
       }
       return Integer.valueOf(str);
    }
}
