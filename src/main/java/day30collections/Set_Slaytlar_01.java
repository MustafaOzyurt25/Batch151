package day30collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Slaytlar_01 {

    public static void main(String[] args) {
        int arr [] = {1,2,2,3,5,5};  // tekrarli elemanlara sahip olan bir arrayi tekrarsiz elemanlara
                                       // donusturen bir liste kaydediniz.

        HashSet<Integer> hs = new HashSet<>();

        for ( Integer w: arr ) {


            hs.add(w);  //[1, 2, 3, 5]

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(hs);

        Set<String> lhs1 = new TreeSet<>();
        lhs1.add("Isa");
        lhs1.add("Musa");
        lhs1.add("Giyasettin");
        lhs1.add("Ferit");
        lhs1.add("Nusrettin");
        System.out.println(lhs1);//[Ferit, Giyasettin, Isa, Musa, Nusrettin]

        Set<String> lhs2 = new TreeSet<>();
        lhs2.add("Isa");
        lhs2.add("Musa");
        lhs2.add("Esmer");


        lhs1.retainAll(lhs2);// Isa, Musa disindakileri siler
        System.out.println(lhs1);// [Isa, Musa]
        System.out.println(lhs2); //[Isa Musa Esmer]



    }




}
