package day20methodoverloadingarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {

    public static void main(String[] args) {

        // Arraylist nasil olusturulur?

        ArrayList<Integer> ages = new ArrayList<Integer>();

        // Arraylist nasil yazdirilir?

        System.out.println(ages);  // []


        // Arrayliste nasil eleman eklenir?

        ages.add(9);
        ages.add(12);
        ages.add(10);
        System.out.println(ages);    //  [9, 12, 10]   ekleme sirasi bizim verdigimiz siraya gore yapiliyor

        ages.add(1, 656);

        System.out.println(ages);//


        System.out.println(ages);  // [9, 656, 12, 10]

        // add() methodu elemanleri siizn verdiginiz siraya gore Liste eklenir.(>>>>insertion order)
        ages.add(888);
        System.out.println(ages);

        // Arrayliste, coklu data nasil eleman eklenir?

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        System.out.println(ages);  // sona [9, 656, 12, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);  // [9, 656, 8, 9, 10, 12, 10, 888, 8, 9, 10]
        ages.add(6,777);
        System.out.println(ages);  // [9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        int numOfElement = ages.size(); /// bir List teki eleman sayisini bize verir
        System.out.println(numOfElement);  // 12

        // Ararylistte spesifik bir eleman nasil alinir.

        // get() methodu index kullanarak istediniz elemani almaya yarar
        Integer el1 = ages.get(1);  // int de yapabilirdik Auto boxing.
        System.out.println(el1);

        // ArrayListte spesifik bir elman nasil degistirliur

        ages.set(2,313); //[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]
        ages.set(4,353);
        System.out.println(ages);

        // Bir Listteki tum elemanlari nasil silebilirz

//        ages.clear();
//        System.out.println(ages);  // []

        // Bir Listteki spesifik bir elemanin var olup olmadigini nasil silebilirz


        boolean r =ages.contains(656);
        System.out.println(r); // true


        // Bir Listin bos olup olmadigini nasil kontrol ederiz?

        boolean r2 = ages.isEmpty();
        System.out.println(r2);// false

        ages.clear();

        boolean r7 = ages.isEmpty();
        System.out.println(r7);  // true

        // EX 1 > bir listin bos olup olmadigini kontrol eden kontrol ediniz.

        ArrayList<String> names = new ArrayList<>();
        names.add("Usame");
        names.add("fatih");
        names.add("ali");
        names.add("ufuk");

        boolean r8 =names.isEmpty();

        if (names.size()==0){                                    // burada iki is var
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");  // List has at least 1 element  niye ? 4 tane isim var
        }

        names.clear();

        if (names.isEmpty()){  // // burada bir is var
            System.out.println("List is empty");
        }else {
            System.out.println("List has at least 1 element");  // List is empty
        }

        // Bir Listin baska bir list ile ayni olup olmadigini nasil kontrol edebiliriz

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Usame");
        names1.add("fatih");
        names1.add("ali");
        names1.add("ufuk");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Usame");
        names2.add("fatih");
        names2.add("ufuk");
        names2.add("ali");


        boolean r5 =names1.equals(names2);


        System.out.println(r5);  // false. iki Listin esit olmasi icin ayni index de ayni elemanlarin olmasi lazim


        // verilen iki Integer Listte tamamiyla ayni elemanlarin olup olmadigini kontroleden kodu yaziniz



        ArrayList<Integer> newAges1 = new ArrayList<>();
        newAges.add(8);
        newAges.add(10);
        newAges.add(9);

        ArrayList<Integer> newAges2 = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        Collections.sort(newAges1);  // Collections da mi sort var. Listtte yok muymus???!!!!!
        Collections.sort(newAges2);

        System.out.println(newAges1.equals(newAges2));  // true.
























    }


}
