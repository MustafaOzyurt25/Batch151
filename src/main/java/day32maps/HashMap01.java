package day32maps;

import java.util.HashMap;

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<String,Integer>  stdAges = new HashMap<>();

        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);
        stdAges.put("Tom",83);  // key i tekrarli kullandigimizda hata vermez,en son verilen entry'nin degerini kabul eder.
        // bu yontem value guncellemede kullanilabilir. buna "overwrite" denir
        // Hashmap'lar HashSet lerde oldugu gibi random olarak entry leri siralar.bu yuzden cok hizli calisir
        // Map' ler entryleri siralarken key'lere bakarak sirala yapar.

        System.out.println(stdAges);  // {Tom=76, Angelina=58, Ajda=77, Brad=58, Ezel=38}


        stdAges.replace("Ezel",39); // replace() methodu; "key'"leri kullanarak "value"lari update
        System.out.println(stdAges);

        stdAges.replace("Angelina",58,61);// stdAges.replace("Angelina",58,61) methodu "Angelina" nin value si 58 ise
         // degistirir.
        System.out.println(stdAges);



        stdAges.putIfAbsent("Brad",60);  // Brad yoksa ekler
        System.out.println(stdAges);// eklemedi cunku var


        // stdAges.putIfAbsent("Ali",60): methodu Map de "Ali" key olarak yokasa
        stdAges.putIfAbsent("Ali",60);  // Ali key olarak yoksa ekler
        System.out.println(stdAges);// ekledi cunku Map te yoktu

        System.out.println(stdAges.get("Ayse")); //null

        System.out.println(stdAges.getOrDefault("Ayse", 0));//0

        // getOrDefault("Ayse", 0) Mapde varolan key'ler icin , get("Ayse") methodu ile ayni ciktiyi vrir
        // getOrDefault("Ayse", 0) Mapde varolmayan key'ler icin , ikinci parametreye koydugunuz degeri verir/ get("Ayse") isde null verir


        System.out.println(stdAges.containsValue(77));// true . Map'de valuelarin arasinda 77 varmi diye bakar
        System.out.println(stdAges.containsValue(99));  // false

        System.out.println(stdAges.containsKey("Ali"));  // true. Map'de key'lerin arasinda Ali varmi diye bakar.



        // remove("Ali") methodu entry i kullanarak entry i siler.value ye bakmaz bile
        stdAges.remove("Ali");
        System.out.println(stdAges); // {Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}


        // stdAges.remove("Tom",83); methodu Map de keysi "Tom", value'si 83 olan bir entry varsa onu siler, yoksa silmez
        stdAges.remove("Tom",83);
        System.out.println(stdAges); // {Angelina=61, Ajda=77, Brad=58, Ezel=39}

        System.out.println(stdAges.size()); // 4 kac tane entry oldugunu soyler.

        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John",12);
        kidsAge.put("Jim",22);
        kidsAge.put("Jack",32);



      //  stdAges.putAll(kidsAge); methodu kidsAge i stdAge 'in icine rastgele sokar. kidsAge degismez ama
        stdAges.putAll(kidsAge);

        System.out.println(stdAges); // {Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}

        System.out.println(kidsAge); // {John=12, Jack=32, Jim=22}  ikincisi degismez







    }
}
