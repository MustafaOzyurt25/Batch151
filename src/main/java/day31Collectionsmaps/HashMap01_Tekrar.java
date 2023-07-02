package day31Collectionsmaps;

import java.sql.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01_Tekrar {
    public static void main(String[] args) {
        // Map nasil olusturulur?

        HashMap<String,Integer> ulkeNufuslari = new HashMap<>();

        ulkeNufuslari.put("Germany", 83000000);
        ulkeNufuslari.put("Albania", 3000000);
        ulkeNufuslari.put("USA", 400000000);
        ulkeNufuslari.put("Turkiye", 83000000);
        ulkeNufuslari.put("Netherland", 18000000);
        System.out.println(ulkeNufuslari); // {Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000}

        System.out.println(ulkeNufuslari.get("Germany")); // 83000000  get() keyler ile calisir value yi verir


        System.out.println(ulkeNufuslari.values().size()); // 5

// Butun value'lari nasil alabiliriz?
        Collection<Integer> values =ulkeNufuslari.values(); // 5 tane sayi.
        System.out.println(values);  //[83000000, 18000000, 400000000, 83000000, 3000000]


// Butun key'leri nasil alabiliriz?
        Set<String> keys  = ulkeNufuslari.keySet();  // 5 tane String :  [Turkiye, Netherland, USA, Germany, Albania]



        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamasi nedir?
                        // [83000000, 18000000, 400000000, 83000000, 3000000]
//        double sum = 0;
//        for (Integer w: ulkeNufuslari.values() ) {
//            sum=sum+w;
//
//        }
//        double ort = sum/ulkeNufuslari.values().size();
//        System.out.println(ort);  // 1.174E8


        int sum2 = 0;
        for (int w: ulkeNufuslari.values() ) {
            sum2=sum2+w;

        }
        int ort2 = (int) (sum2/ulkeNufuslari.values().size());
        System.out.println(ort2);  // 117400000



        //HashMap<String,Integer> ulkeNufuslari = new HashMap<>();
        Set<Map.Entry<String,Integer>> entries  =ulkeNufuslari.entrySet(); // tum entry leri kalip olarak verir

        System.out.println(entries);  //[Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000]

        System.out.println(ulkeNufuslari);// {Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000}

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz.
        // 7+83M, 11+18M,......., 7+0.3M

        int sum = 0;
                                             //[Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000]
        for ( Map.Entry<String,Integer> w :entries ) {

            sum=sum+w.getKey().length()+ w.getValue();



        }

        System.out.println(sum); // 587000034


    }
}
