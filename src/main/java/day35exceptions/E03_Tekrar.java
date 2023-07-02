package day35exceptions;

public class E03_Tekrar {
//     1)try block'dan sonra coklu catch block kullanilabilir.
//            catch block'lar arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
//            catch block'lar arasinda parent-child iliskisi varsa child ustte olmalidir.
//
//            2)"Exception Class" tum Exception'larin parent'idir.
//            Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
//    tek catch block'i "Exception Class" ile kullanabilirsiniz
//
//            3)"try + 1 catch" olur - "try + cok catch" olur - "try" tek basina kullanilamaz
//
//            4)"try", "catch block" olmadan kullanilabilir mi?
//                       ~ evet : --->  "try + finally" olabilir.
//
//     */


    //EX1: bir Stringi Integer a ceviren ve bu Integeri Stringin lengthinin 1 eksigine bolen methodu olusturunuz
    public static void main(String[] args) {


        System.out.println(stringdenIntegereCevir("a11")+5);
        System.out.println(stringdenIntegereCevir2("mm10")+7);
    }

    public static Integer stringdenIntegereCevir(String s) {

             try {
                 return Integer.valueOf(s)/(s.length() -1);
             }catch (ArithmeticException e){

                 System.out.println(e.getMessage());
                 return Integer.valueOf(s)/s.length();             // "1" icin ArithmeticException
             }catch (NumberFormatException e){
                 System.out.println(e.getMessage());                // s:"a1"  icin NumberFormatException
                s= s.replaceAll("[^0-9]","");

                 return Integer.valueOf(s)/(s.length() -1);
             }



    }

    public static Integer stringdenIntegereCevir2(String s) {

        int result = 0;
        try {
            return Integer.valueOf(s)/(s.length() -1);
        }catch (ArithmeticException e){


            return Integer.valueOf(s)/s.length();             // "1" icin ArithmeticException

        }catch (Exception e){
            System.out.println(e.getMessage());                // s:"a1"  icin NumberFormatException



            return result;

        }



    }













}
