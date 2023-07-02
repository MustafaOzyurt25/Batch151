package day43lambda;

//  EX1: tum average scorelarin 90 dan buyuk olup olmadigini kontrol eden methodu olusturunuz
//  EX2: en az bir kurs isminin QA icerip icermedigini kontrol eden methodu olusturunuz

//  EX3: En yuksek average score 'a sahip kurs ismini veren codu yaziniz
//  EX4:  average score 'u endusuk olan ilk iki kurs disindaki tum kurslari return eden metodu olusturunuz.
//  EX5:  average score 'u ustten 3 . olan kursu veren metodu olusturunuz.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01_Tekrar {

    public static void main(String[] args) {

        Kurs turkishDay = new Kurs("Turkish Daytime QA", 213, "Spring", 97);
        Kurs turkishNight = new Kurs("Turkish Nighttime QA", 245, "Winter", 98);
        Kurs englishDay = new Kurs("English Daytime Java Dev", 121, "Spring", 91);
        Kurs englishNight = new Kurs("English Nighttime Java Dev", 137, "Spring", 95);

        List<Kurs> kursList = new ArrayList<>();
        kursList.add(turkishDay);
        kursList.add(englishDay);
        kursList.add(englishNight);
        kursList.add(turkishNight);

        System.out.println(kursList);

        System.out.println(isAllAvgScrGreaterThanANumber(kursList, 90));

        System.out.println(iSAtLeastACourseNameContainQa(kursList, "me"));
        System.out.println(coursNameOftheHighestaverageScore(kursList));//Turkish Nighttime QA

        System.out.println(enDusukPuanaSahipIlkIkiKursHaricDigerTumKurslar(kursList));

        System.out.println(theThirdCourseReverse(kursList));

        System.out.println(theNumberOfStdntLessThanANumber(kursList,150));

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  EX1: tum average scorelarin 90 dan buyuk olup olmadigini kontrol eden methodu olusturunuz


    public static boolean isAllAvgScrGreaterThanANumber(List<Kurs> kursList, int num) {

        return kursList.stream().allMatch(t -> t.getAverageScore() > num);

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  EX2: en az bir kurs isminin QA icerip icermedigini kontrol eden methodu olusturunuz

    public static boolean iSAtLeastACourseNameContainQa(List<Kurs> kursList, String word) {

        return kursList.stream().anyMatch(t -> t.getCourseName().contains(word));

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //  EX3: En yuksek average score 'a sahip kurs ismini veren codu yaziniz


    public static String coursNameOftheHighestaverageScore(List<Kurs> kursList) {
        return kursList.stream().
                sorted(Comparator.comparing(Kurs::getAverageScore).
                        reversed()).
                findFirst().
                get().
                getCourseName();
    }

    //  EX4:  average score 'u endusuk olan ilk iki kurs disindaki tum kurslari
    //  return eden metodu olusturunuz.


    public static List<Kurs> enDusukPuanaSahipIlkIkiKursHaricDigerTumKurslar(List<Kurs> kursList) {
        return kursList.stream().sorted(Comparator.comparing(Kurs::getAverageScore)).skip(2).toList();
    }


    //  EX5:  average score 'u ustten 3 . olan kursu veren metodu olusturunuz.

    public static List<Kurs> theThirdCourseReverse(List<Kurs> kursList) {
        return kursList.stream().
                sorted(Comparator.comparing(Kurs::getAverageScore).reversed()).
                skip(2).limit(1).toList();
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////


    //  EX6:  ogrenci sayisi 150 den az olan  kurslari return eden metodu olusturunuz.

    public static List<Kurs> theNumberOfStdntLessThanANumber(List<Kurs> kursList,int numOfStudents){

        return kursList.stream().filter(t->t.getNumOfStudents()<numOfStudents).toList();
    }



















}
