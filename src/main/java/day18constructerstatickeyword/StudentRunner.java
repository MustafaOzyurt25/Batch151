package day18constructerstatickeyword;

import java.util.Arrays;

public class StudentRunner {


    public static void main(String[] args) {


        // static olan  numOfRegisteredStd i cagirmak icin object uzerinden de ulasabilirsiniz ama HATADIR.

        // static olan  numOfRegisteredStd i cagirmak icin sadece Class ismini kullandik.object olusturmadik.
        System.out.println(Student.numOfRegisteredStd);

        // static olmayan num i cagirmak icin object olusturduk.
        Student s1 = new Student();

        System.out.println(s1.num);



















    }
}
