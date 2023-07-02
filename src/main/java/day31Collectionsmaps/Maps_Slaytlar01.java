package day31Collectionsmaps;

import java.util.HashMap;
import java.util.Map;

public class Maps_Slaytlar01 {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(100,"Ali, Can, Math");
        map.put(101,"Veli, Kan, Geoph");
        map.put(103,"MAli, Ucan, Math2");

        System.out.println(map.keySet());//[100, 101, 103]
        System.out.println(map);

        System.out.println(map.get(100));//Ali, Can, Math
        System.out.println(map.containsKey(100));// true

        System.out.println(map.entrySet());//[100=Ali, Can, Math, 101=Veli, Kan, Geoph, 103=MAli, Ucan, Math2]

        System.out.println(map.values());//[Ali, Can, Math, Veli, Kan, Geoph, MAli, Ucan, Math2]


    }
}
