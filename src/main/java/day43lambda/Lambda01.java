package day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        //  EX1: tum average scorelarin 90 dan buyuk olup olmadigini kontrol eden methodu olusturunuz
        //  EX2: en az bir kurs isminin QA icerip icermedigini kontrol eden methodu olusturunuz

        //  EX3: En yuksek average score 'a sahip kurs ismini veren codu yaziniz
        //  EX4:  average score 'u endusuk olan ilk iki kurs disindaki tum kurslari return eden metodu olusturunuz.
        //  EX5:  average score 'u ustten 3 . olan kursu veren metodu olusturunuz.

        //  EX6:  ogrenci sayisi 150 den az olan  kurslari return eden metodu olusturunuz.


        Course turkishDay = new Course("Trkish Daytime QA",213,"Spring",97);
        Course turkishNight = new Course("Trkish Nighttime QA",245,"Winter",98);
        Course englishDay = new Course("English Daytime Java Dev",121,"Spring",91);
        Course enlishNight = new Course("English Nighttime Java Dev",137,"Spring",95);


        List<Course> courseList = new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(enlishNight);

        System.out.println(courseList);
        // [Course{courseName='Trkish Daytime QA', numOfStudents=213, season='Spring', averageScore=97.0},
        // Course{courseName='Trkish Nighttime QA', numOfStudents=245, season='Winter', averageScore=98.0},
        // Course{courseName='English Daytime Java Dev', numOfStudents=121, season='Spring', averageScore=91.0},
        // Course{courseName='English Nighttime Java Dev', numOfStudents=137, season='Spring', averageScore=95.0}]


        System.out.println(isAvgScoreGreaterThanANumber(courseList, 90));

        System.out.println(isAnyCourseNameContainQa(courseList,"QA"));

        System.out.println(getCourseBetterThanTwo(courseList));

        System.out.println(getHighstThird(courseList));

        System.out.println(getCourseWhoseRegisteredStdLessThanANumber(courseList,150));


    }
   //  EX1: tum average scorelarin 90 dan buyuk olup olmadigini kontrol eden methodu olusturunuz
    public static boolean isAvgScoreGreaterThanANumber(List<Course> courseList,int avg){

        return courseList.stream().allMatch(t->t.getAverageScore()>avg);  // avg soruda 90 ama biz genel yazdik avg olarak
    }

    //  EX2: en az bir kurs isminin QA icerip icermedigini kontrol eden methodu olusturunuz

    public static boolean isAnyCourseNameContainQa(List<Course> courseList , String word){

        return courseList.stream().anyMatch(t->t.getCourseName().contains(word));
    }


    //  EX3: En yuksek average score 'a sahip kurs ismini veren codu yaziniz

    public static String getCourseNameWhoseAvgMax(List<Course> courseList){
      Course  course= courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();

      return course.getCourseName();
    }

    //  EX4:  average score 'u endusuk olan ilk iki kurs disindaki tum kurslari return eden metodu olusturunuz.

    public static List<Course> getCourseBetterThanTwo(List<Course> courseList){

        return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());

    }

    //  EX5:  average score 'u ustten 3 . olan kursu veren metodu olusturunuz.


    public static Course getHighstThird(List<Course> courseList){

        return courseList.stream().
                sorted(Comparator.comparing(Course::getAverageScore).
                        reversed()).skip(2).
                limit(1).
                toList().
                get(0);
    }



    //  EX6:  ogrenci sayisi 150 den az olan  kurslari return eden metodu olusturunuz.


    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber(List<Course> courseList, int numOfStd){
        return courseList.stream().filter(t->t.getNumOfStudents()<numOfStd).toList();
    }



}
