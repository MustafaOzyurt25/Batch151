package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02_Tekrar {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();


        list.add("Mustafa");
        list.add("Ayse");
        list.add("Mehmet");
        list.add("Mustafa");
        list.add("Ayse");
        list.add("Mehmet");
        System.out.println(list);//  [Mustafa, Ayse, Mehmet, Mustafa, Ayse, Mehmet]
        list.set(3,"Ebrar");
        System.out.println(list);  // [Mustafa, Ayse, Mehmet, Ebrar, Ayse, Mehmet]
        System.out.println(list.remove("Ayse"));// true
        System.out.println(list);  // [Mustafa, Mehmet, Ebrar, Ayse, Mehmet]
        System.out.println(list.remove(2));  //Ebrar
        System.out.println(list);  // [Mustafa, Mehmet, Ayse, Mehmet]

        List<Integer> ages = new ArrayList<>();   // Arraylist olustururken en basa
        // Arraylist yerine sadece List yazilabilir
        // 12 elemanini List ten sil:
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //System.out.println(ages.remove(1));  // 12
        System.out.println(ages.remove((Integer) 12));
        System.out.println(ages);


    }


}
