package day38enumsitarator;

import java.util.*;

public class Iterator01_Tekrar_slayt {
    //1. hasnext()  2. next()  3. remove()  4 . hasprevious() 5 .previous  6.descending()

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Isa");
        list.add("Musa");
        list.add("Giyasettin");
        list.add("Ferit");
        list.add("Nusrettin");

        List<Integer> list1 = (Arrays.asList(2, 13, 56, 23, 45, 14, 40)); // [23,40]

        ListIterator listIterator = list1.listIterator();




// //////////////// String bir listteki her bir ogenin sonuna X koyalim: /////////////////////////////////

            // 1 .yol for-each ile

//        for (String w : list) {
//            System.out.println(w + "X");
//        }
//        IsaX
//        MusaX
//        GiyasettinX
//        FeritX
//        NusrettinX


            // 2 .yol listiterator ile

//        System.out.println();
//       ListIterator<String> listIterator = list.listIterator();
//
//        System.out.println(list);

//        List<String> xliList = new ArrayList<>();
//
//        while (listIterator.hasNext()){
//
//            xliList.add(listIterator.next() + "X");
//        }
//
//        System.out.println(list); //   [Isa, Musa, Giyasettin, Ferit, Nusrettin]
//        System.out.println(xliList);// [IsaX, MusaX, GiyasettinX, FeritX, NusrettinX]


//        System.out.println();
//        // 3. yol
//        while (listIterator.hasNext()){   //[Isa, Musa, Giyasettin, Ferit, Nusrettin]
//
//            String el=listIterator.next();
//            listIterator.set(el+"X");
//
//
//        }
//        System.out.println(list);//[IsaX, MusaX, GiyasettinX, FeritX, NusrettinX]


            ////// 1 /////////////////////////////////////////////////////////////
//        System.out.println(list);
//
//        Iterator01_Tekrar<String> itrtr =list.iterator();//  [Isa, Musa, Giyasettin, Ferit, Nusrettin]
//
//        while (itrtr.hasNext()){
//
//            itrtr.next();
//            itrtr.remove();
//
//
//        }
//
//        System.out.println(list); // []
//

        }
    }
