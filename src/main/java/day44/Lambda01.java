package day44;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

        //Ex1: verilen tex file icindeki text'i consol'a yazdiran code u yaziniz
        //Ex2: verilen bir text file icindeki text'i buyuk harflarle  consol'a yazdiran code u yaziniz
        //Ex3: verilen bir text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden   code u yaziniz
        //Ex4: verilen bir text file icindeki text'lerde Kullanilan farkli kelimeleri bir list icinde return ediniz
        //Ex5: verilen bir text file icindeki text'de toplam kac harf kullanildigini gosteren kodu return ediniz


        //Ex6: verilen bir text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin icinde
        //  return eden kodu yaziniz
        Files.
                lines(Paths.get("day44/mytxt.txt")).forEach(System.out::println);



        //Ex2: verilen bir text file icindeki text'i buyuk harflarle  consol'a yazdiran code u yaziniz


        Files.lines(Paths.get("day44/mytxt.txt")).map(String::toUpperCase).forEach(System.out::println);


        //Ex3: verilen bir text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden   code u yaziniz

        boolean r1 =Files.lines(Paths.get("day44/mytxt.txt")).anyMatch(t->t.contains("Java"));

        System.out.println(r1);// true


        //Ex4: verilen bir text file icindeki text'lerde Kullanilan farkli kelimeleri bir list icinde return ediniz

        List<String> words =Files.
                lines(Paths.get("day44/mytxt.txt")).
                map(t->t.replaceAll("\\p{Punct}","").split(" ")).
                flatMap(Arrays::stream).distinct().toList();

        System.out.println(words);


        //Ex5: verilen bir text file icindeki text'de toplam kac harf kullanildigini gosteren kodu return ediniz

        long numOfLetters=Files.lines(Paths.get("day44/mytxt.txt")).map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")). flatMap(Arrays::stream).count();

        System.out.println(numOfLetters);



        //Ex6: verilen bir text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin icinde
        //  return eden kodu yaziniz


      List<String> list=Files.lines(Paths.get("day44/mytxt.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).toList();


        System.out.println(list);

    }

}
/*
Example 4: Text icinde kullanilan farkli kelimeleri bir list icinde return edecegiz.

Oncelikle String bir List olusturduk. text'imiz files.lines ve devamini assign ettik. files.lines kismi ile biz
file'a ulasiriz. Bu satir yanina sirasiyla map methodunu yazdik. Map icinde once noktalama isaretlerini silmemiz
ve sonrasinda split metodu ile kelimeleri almamiz lazim. Once replaceAll metodu icine {"\\p{Punct}" yazarak noktalama
isaretlerini sildik ve yine map icinde split metodunu kullandik. split metodu
icine " " yazarak bosluklar cikarilinca bize kelimeler kaldi. Istersek map'i bir kerede istersek iki kez kullanabiliriz.
split metodu bize array verir. Kelimelerimiz bir array icinde oldu. map metodu yaninda flatMap metodu kullandik.
flatMap array icine girmemizi saglar, metni cevreleyen duvarlar flatMap ile kirildi. stream icindeki kelimeler ile
calisacaksak icine girebilmek icin flatMap kullaniriz. Bu metod icine Arrays::stream yazarak ardindan distinct
 metodunu ekleyerek farkli kelimeleri aldik.

ve collect(Collector.toList) ile kalan tum farkli kelimeleri bir liste koyduk. En son sout icinde listimizin words
 olan ismini yazarak kodumuzu calistirdik.
 */

