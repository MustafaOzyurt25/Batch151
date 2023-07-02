package day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        /*
      ex:1
        bir Integer list teki birbirine en yakin elemanlari bulunuz. mesela listi'miz [12,23,10,19] ==> [12 10]
         */
        // elemanlari sort etmeliyiz . 10 12 19 23   sonra farklarina bakarsak. bu farklardan min olani veren iki sayiyi yazdiralim.

        List<Integer> nums = new ArrayList<>();

        nums.add(13);
        nums.add(23);
        nums.add(14);
        nums.add(10);

        System.out.println(nums);    //[13, 23, 14, 10]   ilk hal
        Collections.sort(nums);     // [10, 13, 14, 23]  sort u Collections Class dan aldik. demeki ArrayList te yok .
        System.out.println(nums);//

        int minDiff = nums.get(1) - nums.get(0);   // tahminen . dogru olmayabilir de. kiyaslamada kullanacam sadece.

                               //4
        for (int i = 1 ; i < nums.size(); i++) {
            minDiff = Math.min(minDiff , nums.get(i) - nums.get(i - 1));
        }

        System.out.println(minDiff);  // 1

        for (int i = 1; i <nums.size() ; i++) {

            if (nums.get(i)-nums.get (i-1) == minDiff){
                System.out.println(nums.get(i-1)+" and "+ nums.get((i)));  // 13 and 14
            }
        }


    }
}
