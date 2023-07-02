package day12switchincrementdecrementloops;

public class IncrementDecrement {

    public static void main(String[] args) {
        int age = 12;
        System.out.println(age); //12

        age = age++;  // Post increment

        age = ++age;   // Pre increment

        System.out.println(age);//12

        // ++ age; burda artar direk

        int salary =40;
        salary =  salary--;  // post decrement

        salary  = --salary; // pre decrement



    }
}
