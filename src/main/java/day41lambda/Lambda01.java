package day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));// 17548
        System.out.println(getTheSumOfSquareOfOdds2(nums));
        System.out.println(getTheSumOfSquareOfOdds3(nums));

        System.out.println();
        System.out.println(getMultiplicationOfSquareOfEvens(nums));
        System.out.println();
        System.out.println(getTheSumOfEvensMaxAndOddsMin(nums));// 15
        System.out.println();
        System.out.println(getTheSumOfEvensLessThanSevenMaxAndOddsMinGreaterThanEıght(nums));//15

    }


    //    Ex1: verilen bir listteki tek sayi olan elemanlarin kareleri toplmamini hesaplayan method olusturunu
    public static int getTheSumOfSquareOfOdds1( List<Integer> nums){

        return nums.stream().
                filter(t->t%2!=0).
                map(t->t*t).
                reduce(0,(t,u)->t+u);

        // Ne zaman coklu datayi azaltmak yada tek bir sayiya indirmek isterseniz reduce() meth. u kullanabilirisiniz.
         // toplmama , carpma, max , min islemeleriyle sonuca ulasilabilri


    }

    public static int getTheSumOfSquareOfOdds2( List<Integer> nums){

        return nums.stream().
                filter(Utils::iSOdd).
                map(Utils::getSquare).//Ihtiyacimiz olan method Java Class'larinda yoksa Utils Class olusturup icine
                                      //ihtiyacimiz olan method'u olusturunuz ve method reference kullaniniz

                reduce(0,Math::addExact);
    }


        public static int getTheSumOfSquareOfOdds3( List<Integer> nums) {

            return nums.stream().
                    filter(t -> t % 2 != 0).
                    map(t -> t * t).
                    reduce(Math::addExact).
                    get();  // reduce methodunu kullandigimizda get() methodu Optional<Integer> cikar .Bunu icinde
            // Optional<Integer>' i get() ile int e cevirdik.

        }


  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



// Ex2: verilen bir listteki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz



public static int getMultiplicationOfSquareOfEvens(List<Integer> nums){



        return nums.stream().filter(t->t%2==0).map(t->t*t).distinct().reduce(1,(t,u)->t*u); // 147456
}

// Ex3: verilen bir listteki cift sayi olan elemanlarin max degeri ile tek sayi olan elemanlarin min
// degerinin toplaminini hesaplayan metodu olusturunuz


    // note soruda tekrarsiz demedigi halde max min icin tekrar eden sayilara ihtiyac olm.dan distinci kullandik

    public static int getTheSumOfEvensMaxAndOddsMin(List<Integer> nums){

       int maxEven= nums.stream().filter(t->t%2==0).reduce((t,u)->t>u?t:u).get();







       int minOdd=nums.stream().distinct().filter(t->t%2!=0).reduce((t,u)->t<u?t:u).get() ;

       return maxEven+minOdd;
    }

// Ex4: verilen bir listteki cift sayi olan elemanlarin 7 den kucuk max degeri ile tek sayi olan elemanlarin 8den buyuk  min
// degerinin toplamini hesaplayan metodu olusturunuz.

public  static int getTheSumOfEvensLessThanSevenMaxAndOddsMinGreaterThanEıght(List<Integer> nums){

    int max= nums.stream().filter(t->t%2==0&&t<7).reduce((t,u)->t>u?t:u).get();







    int min=nums.stream().distinct().filter(t->t%2!=0&&t>8).reduce((t,u)->t<u?t:u).get() ;

    return max+min;



}






}
