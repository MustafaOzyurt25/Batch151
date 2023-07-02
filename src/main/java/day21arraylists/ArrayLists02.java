package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {
        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);


        Collections.sort(nums);
        System.out.println(nums);//[10, 12, 19, 23]

        int minDiff = nums.get(1) - nums.get(0);  // bu farazi en kucuk fark olsun. onemli olan mantiga uygun bir fark elimizde olsun
                              //List in length i size() methoduyla bulunur.
        for ( int i = 1 ; i <nums.size() ;  i++ ) { // neden 1 le basladik. bak asagiya.

            minDiff = Math.min(minDiff,nums.get(i)-nums.get(i-1));

        }
        System.out.println(minDiff);                      // o minDif i hangi iki sayidan buldun ey java :
        for (int i = 1; i <nums.size() ; i++) {
            if(nums.get(i)-nums.get(i-1)== minDiff){
                System.out.println(nums.get(i-1)+ " ve "+ nums.get(i));
            }
        }






//        List<Integer> list = List.of(12, 23, 10, 19);
//        Collections.sort(list);// 10, 12, 19,23
//
//        for (int w : list) {


        }

    }

