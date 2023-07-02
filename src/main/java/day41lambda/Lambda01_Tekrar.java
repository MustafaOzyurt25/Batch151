package day41lambda;

import java.util.ArrayList;
import java.util.List;







public class Lambda01_Tekrar {
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

        System.out.println(nums);  // [8, 9, 7, -4, 9, 2, 4, 6, 15]
        System.out.println();
        System.out.println(getSumOfSquareOfOdds(nums));// 436
        System.out.println();
        System.out.println(getMultiplicationOfDistincSquareOfEvens(nums));// 147456
        System.out.println();
        System.out.println(getSumOfMaxOfEvensAndMinOfOdds(nums)); // 15
        System.out.println();
        System.out.println(sumOfMaxEvensLessThanSevenAndMinOddsGreaterThanEight(nums));// 15


    }//main
//////////////////////////////////////////////// 1  /////////////////////////////////////////////////////////
//    Ex1: verilen bir listteki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz


    public static int getSumOfSquareOfOdds(List<Integer> nums){

       return nums.stream().filter(MyUtils_Tekrar::iSOdds).map(MyUtils_Tekrar::getSquare).reduce(Math::addExact).get();

    }
///////////////////////////////////////////////  2   ////////////////////////////////////////////////////////////////

// Ex2: verilen bir listteki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz

    public static int getMultiplicationOfDistincSquareOfEvens(List<Integer> nums1){
      return nums1.stream().filter(MyUtils_Tekrar::iSEven).map(MyUtils_Tekrar::getSquare).distinct().reduce(Math::multiplyExact).get();//147456

    }
///////////////////////////////////////////  3    //////////////////////////////////////////////////////////////////

    // Ex3: verilen bir listteki cift sayi olan elemanlarin max degeri ile tek sayi olan elemanlarin min
    // degerinin toplaminini hesaplayan metodu olusturunuz

public static int getSumOfMaxOfEvensAndMinOfOdds(List<Integer> list){

        int maxOfEvens =list.stream().filter(MyUtils_Tekrar::iSEven).reduce(Math::max).get();
        int minOfOdds  =list.stream().filter(MyUtils_Tekrar::iSOdds).reduce((Math::min)).get();

        return maxOfEvens+minOfOdds;

}
/////////////////////////////////////////////  4   ////////////////////////////////////////////////////////////////////
// Ex4: verilen bir listteki cift sayi olan elemanlarin 7 den kucuk max degeri ile tek sayi olan elemanlarin 8den buyuk  min
// degerinin toplamini hesaplayan metodu olusturunuz

    public static int sumOfMaxEvensLessThanSevenAndMinOddsGreaterThanEight(List<Integer> list){

        int maxEvensLessThanSeven = list.stream().filter(t->t%2==0&&t<7).reduce(Math::max).get();
        int minOddsGreaterThanEight = list.stream().filter(t->t%2!=0&&t>8).reduce(Math::min).get();

        return maxEvensLessThanSeven+minOddsGreaterThanEight;

    }





}//Class
