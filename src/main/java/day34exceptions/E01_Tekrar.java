package day34exceptions;

public class E01_Tekrar {

    public static void main(String[] args) {

        System.out.println(bolme(15, 6));  // 2.3076923076923075
        System.out.println(bolme(3, 0));

    }




    public  static int bolme(int a, int b){

        int result = 0;
        try {
           result= a/b;

        }catch (ArithmeticException e){

            System.out.println("Don't do like that!");
        }



return result;
    }




}
