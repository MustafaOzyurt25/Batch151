package day37exceptionsenums;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {

/*
   1) "try" kullandiginizda her senaryo icin calismasini istedigimiz kodlari "finaly block " icine koyariz
   2) "final" , "finally" , "finalize "  aciklarmisiniz
      "final" >>> aciklandi
      "finally">>>aciklandi

      "finalize " : "Garbage Collektor" memory'i temiz tutmak icin surekli memory i tarar ve silinmesi gerekenleri siler
                     "Garbage Collektor" silmeden once silecegi datalari "finalize" eder sonra siler.silinmesi gerekenleri java cok iyi bilir
                    * "Garbage Collektor" datayi silmeden once finalize methodunu default olarak cagirir.Bizim birsey yapmamiza gerek yoktur.

 */
    public static void main(String[] args) throws IllegalGradeException {


            System.out.println(getGrades());



        try {
            printAge(-45);
        }catch (IllegalAgeException e){
            System.out.println(e.getMessage()); // Teknik mesaji verecek bu hangisi benim yazdigim mesajdir
        }finally {
            System.out.println("Ben finally black exception olsada olmasada calisirim her senaryoda ve her zaman calisirim");
        }


    }
    //Example 1: Ogrenci notlarini bir List'e ekleyen method'u olusturunuz
    public static List<String> getGrades() throws IllegalGradeException {

        List<String> grades = new ArrayList<>();
        String grade = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter the grade. To stop entering press q.");
            grade = input.next();

            int intGrade = 0;

            if(!grade.equals("q")) {
                intGrade = Integer.valueOf(grade);
            }

            if(grade.equals("q")){
                break;
            } else if(intGrade>=0 && intGrade<=100){
                grades.add(grade);
            }else{
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
            }

        }while(!grade.equals("q"));

        return grades;
    }


    //Example 2: Kullanicinin yasini console'a yazdiran method'u olusturunuz.

    public static void printAge (int age){


        if (age<0){
            throw new IllegalAgeException("Yas negatif olamaz");
        }else {
            System.out.println(age);
        }
    }


}




