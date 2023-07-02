package day31Collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    /*
    *
MY NOTES:
* Map deyince akliniza sozluk gelsin.
Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.(key = value)
"key" kismi tekrarsiz, "value" tekrarli olabilir.
Mapler "key" ve "value" structur'ini kullanir.
Map'lerdeki elemanlara "Entry" denir.
Elemanlarin tamamina ise "Entryset" denilir.
"Entry" ler Tekrarsiz  oldugu icin "EntrySet"denilir(set'ler tekrarsiz olur)
"Key" ve value ler ayri ayri data type'larinda olabilir
* Map 'ler Collection degildir farkli bir yapidir

* HashMap'lar entry'leri rastgele siralar, bu yuzden en hizli map' tir.
     */


    public static void main(String[] args) {
// Map nasil olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();

// Map ' e entry nasil eklenir?
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Turkiye=83000000, USA=40000000, Netre=18000000, Germany=83000000, Albania=3000000}


       int TurkiyePopulation=  countryPopulation.get("Turkiye");
        System.out.println(TurkiyePopulation);  // 83000000

      // get() methodu "key" ile calisir ve "value" kismini verir


        // Butun key'leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();// !!! metodun ( keyset()'in ) return type'i, konteynirin (keys'in) data type'i olmali
        System.out.println(keys);//[Turkiye, USA, Netre, Germany, Albania]

        //Butun "value"lari nasil alabilirim?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);  // [83000000, 40000000, 18000000, 83000000, 3000000]

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamasi nedir?


        Collection<Integer> value = countryPopulation.values();


        int sum = 0;  // double olmali . cunku ortalama double olur.
        for (Integer w : value) {

            sum = sum + w;
        }
        System.out.println(sum / value.size()); // 45400000      ???      //117400000

        //entrySet() "entry"leri kalip halinde alip bize "Set"in icine koyarak verir
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz.

        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries); // [Turkiye=83000000, USA=40000000, Netre=18000000, Germany=83000000, Albania=3000000]
        // looplar maplarde kullanilamaz. SADECE entry'ler arasinda gezmek istedigimizde loop kullanabiliirz


        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz.


        int toplam = 0;
        for (Map.Entry<String, Integer> w : entries) {

            toplam = toplam + w.getKey().length() + w.getValue();
            System.out.println(toplam);

        }
        System.out.println(toplam);    //587000034(dersdeki)





        /*
        ZeynepK ' dan :

        Key ve valueler icin ayri ayri data tipi olur.
HashMapler, HashSetler'de oldugu gibi(elemanlari>>HashSet) entry'leri rastgele siralar.
Bu yuzden maplerde en hizli HashMap'tir.
Mapler Collection degildir, tamamiyle farkli bir yapidir.
Mapler'de {} kullanilir. Ekrana yazdirdigimizda entryleri {a=b, c=d,.....x=y} icinde gorduk.
Setler ise [] kullanir.
Map'lere eklemeyi add methodu ile degil put methodu ile yaptik.

get() methodu, key ile calisir ve value kismini verir. Integer calisir, integer verir.
Ornek getCat() bize Cat'in anlamini verir

keySet() methodu bize tum keyleri verir. Bize bir set verir. Keyler tekrarsizdir,
keyler verilirken Set'in icine konulur. KeySet methodu butun keyleri verir.
Methodun icine girdigimizde methodun return type'i bizim olusturacagimiz
conteynerin data type'idir.

Tum valueleri Integer ile aliyoruz. Keyleri alirken String kullandik.(burdaki map icin)

Ortalama nufusu alirken for each loop kullandik ve value.size'i kullandik.
Value.size'a toplami bolduk.

Mapler'de bazen sadece valueler bazen de sadece keyler ile calisabiliriz.

* entrySet() methodu entryler'i kalip halinde Set icine koyar..
Looplar Mapler'de calismaz.( {Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000} )
Map'in ismini for each loop parantezi icine koydugumuzda uyari verdi.
Bazen Mapler'deki elemanlar arasina girmek, loop ile bakmak isteriz. Tekrarli islerde loop yapmamiz gerekir.
Map'te loop kullanabilmemiz icin entrySet() methodu kullanilir. Aksi halde looplari kullanamayiz.

entrySet() bize Set verir.Yani tum entry'lerin setini (yada tekrarsiz listesini)bize verir.
 Her Set'in < > arasina data tipi yazilir. Setin elemanlarinin data tipi Map'deki
entrylerdir.ornegimizdeki  entry'lerin keyleri String, valueleri Integerdir.
         */


    }
}
