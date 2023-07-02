package day42lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02_Tekrar {
    public static void main(String[] args) {


        System.out.println(getsumOfaRangeOfInteger(10, 7));// 34

        System.out.println(getMultiplicationOfaRangeOfInteger(10, 7));  // 5040

        System.out.println(getsumOfDigitsofARangeOfInteger(45, 47));
    }
    public static List<Integer> swap(int starting, int ending) {
        List<Integer> swapIkilisi = new ArrayList<>();
        if (starting > ending) {
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;

        }
        swapIkilisi.add(starting);
        swapIkilisi.add(ending);

        return swapIkilisi;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Ex1: 7 den 10 a kadar tamsayilarin toplamini hesaplayan metodu olusturunuz

    public static int getsumOfaRangeOfInteger(int starting, int ending) {
        System.out.println("ikili "+swap(starting, ending));
        swap(starting,ending);
        return IntStream.rangeClosed(swap(starting,ending).get(0), swap(starting,ending).get(1)).sum();
    }


////////////////////////////////////////////////   Ex2:    /////////////////////////////////////////////////////////////

    //Ex2: 7 den 10 a kadar tamsayilarin carpimini hesaplayan metodu olusturunuz

    public static int getMultiplicationOfaRangeOfInteger(int starting, int ending) {

        swap(starting, ending);

        return IntStream.
                rangeClosed(swap(starting,ending).get(0), swap(starting,ending).get(1)).
                reduce(Math::multiplyExact).getAsInt();


    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //Ex3: 45 den 47 a kadar tamsayilarin rakamlari  toplamini hesaplayan metodu olusturunz

    public static int getsumOfDigitsofARangeOfInteger(int starting, int ending) {
        swap(starting, ending);
        return IntStream.
                rangeClosed(swap(starting,ending).get(0),swap(starting,ending).get(1)).
                map(myUtils_Tekraren::getsumOfDigits).
                reduce(Math::addExact).getAsInt();
    }



}