package day22stringbuilder;

import day23inheritance.Animal;
import day23inheritance.Cat;

public class StudentRunner extends Animal {

    public static void main(String[] args) {

        Student std1 = new Student();
        System.out.println(std1.stdName);

        System.out.println(std1.age);  // 23

        Cat c2 =new Cat();

        c2.eat();




    }
}
