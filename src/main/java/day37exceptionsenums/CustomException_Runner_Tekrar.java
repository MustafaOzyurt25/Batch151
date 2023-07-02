package day37exceptionsenums;

import java.util.ArrayList;
import java.util.List;

public class CustomException_Runner_Tekrar {
    //Example 1: Ogrenci notlarini bir List'e ekleyen method'u olusturunuz

    public static void main(String[] args) throws IllegalGradeException_Tekrar {


        System.out.println(addGradeToTheList(80));
        age(-10);
    }

    private static List<Integer> addGradeToTheList(int not) throws IllegalGradeException_Tekrar {
        List<Integer> list = new ArrayList<>();

        if (not > 100) {
        throw new IllegalGradeException_Tekrar("100 den buyuk not olmaz");
        }
     else{

        list.add(not);

    }

        return list;
}

 public static void age(int a){
        if (a>200 || a<0){
            throw new IllegalAgeException_Tekrar("200den buyuk o dan kucuk yas olmaz");
        }else {
            System.out.println(a);
        }
 }




}