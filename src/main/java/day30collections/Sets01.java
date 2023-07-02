package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
        /*
        1)Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir.
        2) 3 tane Set Class var
          i) HashSet Class:(Benzersiz id olusturma teknigidir.Bu teknige "Hashing Technique" denir
           "HashSet" , elemanlari rastgele siralar
           "HashSet", elemanlari rastgele siraladigindan cok hizli calisir. Yere dokulen kitaplari alfabetik siraya gore
            degilde kucagina doldurup kitapliga koymak gibidir. HashSet'ler null'i eleman olarak kabul eder
           HashSet'ler tekrarsiz eleman depolamak icindir

          ii)LinkedHashSet:
       LinkedHashSet'ler elemanlari sizin verdiginiz siraya gore dizdiklerinden HashSetlere gore yavastirlar
      LinkedHashSet'ler tekrarsiz eleman depolamak icindir


          iii)TreeSet Class
          TreeSet'ler elemanlari national order' a gore dizerler
          TreeSet'ler elemanlari national order' a gore dizdiklerinden cooooooook yavastirlar.
          En yavas set "TreeSet"tir

          3) TreeSet cok yavas old.dan mumkun oldigu kadar kullnmamaya calisiriz
         */


        HashSet<String> hs = new HashSet<>();


        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");  // tekrarli eleman koydugumuzda hata vermez ama tekrarli elemani sadece bir kere ekler
        hs.add(null);  // [null, Zeki, Ajda, Cuneyt, Esra, Ezel]  null enbasta olur, cunku null degeri yoktur

        hs.add(null);

        System.out.println(hs);  // [Zeki, Ajda, Cuneyt, Esra, Ezel]  rastgele siralama

        System.out.println(hs);  // [null, Zeki, Ajda, Cuneyt, Esra, Ezel]


        System.out.println(hs.hashCode());  // 2038751948


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println(lhs);  // [234, 87, -32, 124]

        lhs.add(null);
        System.out.println(lhs);// [234, 87, -32, 124, null]  sona koydu bunda boyle!!!!!!!


        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        System.out.println(ls);

        lhs.retainAll(ls);


        System.out.println(lhs); // [87, 124]==> ilk LinkHashSet' teki farkli elemanlari sildi
        System.out.println(ls); // [451, 87, 231, 124]

        // Insanlar.retainAll(suclular)==> Suclular
        // Insanlar-suclular=sucsuzlar


        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
        //    ts.add(null);  ====> TreeSet'Lre null eklenemez
        System.out.println(ts);  // [A, G, R, U, Z]

        System.out.println(ts.first());  // A
        System.out.println(ts.last()); // Z

        System.out.println(ts.lower('R')); // G  verilen eleman olan R den bir onceki elemani verir

        System.out.println(ts.lower('D')); // A olmayan eleman icinde calisir dikkat
        System.out.println(ts.lower('A'));// null
        ts.higher('K'); // R===> Verilen K den sonraki elemani verir


        System.out.println(ts.headSet('R'));  // [A, G]  +++>>parantez icindeki dahil degil enbastan alir

        System.out.println(ts.tailSet('G')); // [G, R, U, Z] +++>>parantez icindeki dahil

        System.out.println(ts.headSet('R', true));  // [A, G, R] bak R yi de dahil eddebilieiz

        System.out.println(ts.tailSet('G', false)); // [R, U, Z]  bak normalde dahildi
        // de Java biz uzulmeyeli diye dahil etme yada etmeme yolunu da bulmus!!

        System.out.println(ts.ceiling('R')); // R . R nin catisi yine R
        // eleman set 'in icinde varsa elemanin kendisi return eder. Eleman set'in icinde yoksa sonraki eleman return eder


        System.out.println(ts);        // [A, G, R, U, Z]

        System.out.println(ts.floor('G'));// G           // eleman set 'in icinde varsa elemanin kendisini return eder.
                                                                // Eleman set'in icinde yoksa onceki elemani return eder.

        System.out.println(ts.floor('S')); // R


        System.out.println(ts.subSet('G', 'Z'));//[G, R, U] ==> ilk eleman dahil son eleman haric
//        ts.subSet()


    }
}
