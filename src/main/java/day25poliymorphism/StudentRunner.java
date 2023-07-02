package day25poliymorphism;

public class StudentRunner {

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(s1.getStdId());  // AC2023102T



        System.out.println(s1.getGpa());  // 3.87


       s1.setGpa(4);
        System.out.println(s1.getGpa());  // 4.0
//        s1.setGpa(3.99);
//        System.out.println(s1.getGpa()); //  3.99


        System.out.println(s1.isSuccessful());  // false
        s1.setSuccessful(true);
        System.out.println(s1.isSuccessful());  // true

    }
}
