package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01_Tekrar {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add(null);
        hs.add("Haci Osman");
        hs.add("Haci Isa");
        hs.add("Haci Musa");
        hs.add("Haci Giyasettin");
        hs.add("Mustafa");
        hs.add("Mehmet");
        hs.add("Mehmet");

        hs.add(null);
        hs.add(null);
        System.out.println(hs);//[null, Mustafa, Haci Osman, Haci Musa, Haci Giyasettin, Mehmet, Haci Isa]
        // rastgele siralama.

        System.out.println(hs.hashCode()); // -1025758269

        System.out.println(hs.size());  // 7 (null i elman sayar)

       // hs.clear();
        System.out.println(hs); // [null, Mustafa, Haci Osman, Haci Musa, Haci Giyasettin, Mehmet, Haci Isa]

        System.out.println(hs.clone()); // [null, Mustafa, Haci Osman, Haci Musa, Haci Giyasettin, Mehmet, Haci Isa]

        System.out.println(hs.isEmpty()); //false
        System.out.println(hs.contains(null)); // true

        HashSet<String> hs2 = new HashSet<>();
        hs.add("Haci Osman");
        hs.add("Haci Isa");
        hs.add("Haci Musa");
        hs.add("Haci Muhteber");
        hs.add("Faruk");
        hs.add("Nurullah");
        hs.add("Osman");


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(null);
        lhs.add(442);
        lhs.add(522);
        lhs.add(52);
        lhs.add(32);
        lhs.add(null);
        System.out.println(lhs); // [null, 442, 522, 52, 32]

        TreeSet<Character> treeSet = new TreeSet<>();


        treeSet.add('M');
        treeSet.add('U');
        treeSet.add('S');
        treeSet.add('T');
        treeSet.add('A');
        treeSet.add('F');
        treeSet.add('a');
 //      treeSet.add(null); null eklenmez
        System.out.println(treeSet); // [A, F, M, S, T, U, a]  national order

        System.out.println(treeSet.subSet('A','M'));
        System.out.println(treeSet);


        System.out.println(treeSet.tailSet('T'));// [T, U, a]
        System.out.println(treeSet.headSet('M', true));  //A, F, M,

        System.out.println(treeSet.tailSet('S', true)); // [S, T, U, a]


        System.out.println(treeSet.ceiling('N'));  //a
        System.out.println(treeSet.floor('N'));













    }
}
