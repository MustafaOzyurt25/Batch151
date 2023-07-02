package day38enumsitarator;

import java.util.*;

public class Iterator01_Tekrar {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);

        Iterator myItr = myList.iterator();// [Tom, Jim, Clara, Angie, Mark]

        while (myItr.hasNext()){

            myItr.next();
            myItr.remove();
        }
        System.out.println(myList);//[]


        List<String> myList1 = new ArrayList<>();
        myList1.add("Tom");
        myList1.add("Jim");
        myList1.add("Clara");
        myList1.add("Angie");
        myList1.add("Mark");

        System.out.println(myList1);//[Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> listIterator = myList1.listIterator();

        while (listIterator.hasNext()){
            String el =listIterator.next();
            listIterator.set(el+"! ");
        }


        System.out.println(myList1);// [Tom! , Jim! , Clara! , Angie! , Mark! ]

        //hasPrevious() ve previous() nasil kullanilir?


        List<String> ailemList = Arrays.asList("Isa","Musa","Giyasettin","Ferit","Nusretin");

        // 1.Yol herbir ismin sonuna ! koy ama sondan basla

        ListIterator<String> ailemIterator = ailemList.listIterator();


        while (ailemIterator.hasNext()){

           String el = ailemIterator.next();
            ailemIterator.set(el+"!");
        }

        System.out.println(ailemList);// [Isa!, Musa!, Giyasettin!, Ferit!, Nusretin!]


        while (ailemIterator.hasPrevious()){
            String el2=ailemIterator.previous();
            ailemIterator.set("?"+el2);
        }

        System.out.println(ailemList);


        //En sondan en basa nasil iterate ederiz

        LinkedList<String> ourList = new LinkedList<>(); // LinkedList olusturarak
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);// [Tom, Jim, Clara, Angie, Mark]

       Iterator<String> ourDescItr = ourList.descendingIterator(); // [Tom, Jim, Clara, Angie, Mark]


        while (ourDescItr.hasNext()){

            String r =ourDescItr.next();

            System.out.println(r);

        }













    }
}
