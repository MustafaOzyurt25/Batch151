package day42lambda;

public class myUtils_Tekraren {

    // girilen sayinin rakamlarinin toplamini veren kod:

    public static int getsumOfDigits(int a){
       int sum =0;
        while (a>0){
           sum =sum+a%10 ;

           a=a/10;
        }

        return sum;
    }





}
