package day44;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01_Tekrar {

    //Ex1: verilen tex file icindeki text'i consol'a yazdiran code u yaziniz
    //Ex2: verilen bir text file icindeki text'i buyuk harflarle  consol'a yazdiran code u yaziniz
    //Ex3: verilen bir text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden   code u yaziniz
    //Ex4: verilen bir text file icindeki text'lerde Kullanilan farkli kelimeleri bir list icinde return ediniz
    //Ex5: verilen bir text file icindeki text'de toplam kac harf kullanildigini gosteren kodu return ediniz
    //Ex6: verilen bir text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin icinde
    // return eden kodu yaziniz

    public static void main(String[] args) throws IOException {

        //Ex1: verilen tex file icindeki text'i consol'a yazdiran code u yaziniz
        // Files.lines(Paths.get("day44/MustafaOzyurt.txt")).forEach(System.out::println);

        //Ex2: verilen bir text file icindeki text'i buyuk harflarle  consol'a yazdiran code u yaziniz
        // Files.lines(Paths.get("day44/MustafaOzyurt.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Ex3: verilen bir text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden   code u yaziniz
        System.out.println(Files.lines(Paths.get("day44/MustafaOzyurt.txt")).anyMatch(t -> t.contains("Java")));// true

        //Ex4: verilen bir text file icindeki text'lerde Kullanilan farkli kelimeleri bir list icinde return ediniz
        List<String> words = Files.lines(Paths.get("day44/MustafaOzyurt.txt")).
                map(t -> t.replaceAll("[\\p{Punct}]", "")).
                map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().toList();
                System.out.println(words);

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz

       long length =Files.lines(Paths.get("day44/MustafaOzyurt.txt")).
                map(t -> t.replaceAll("[^A-Za-z]", "")).
                map(t -> t.split("")).flatMap(Arrays::stream).count();
        System.out.println(length);



//Ex6: verilen bir text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin icinde
// return eden kodu yaziniz

      List<String> listOfLetters =Files.lines(Paths.get("day44/MustafaOzyurt.txt")).
                map(t -> t.replaceAll("[^A-Za-z]", "")).
                map(t -> t.split("")).flatMap(Arrays::stream).sorted(Comparator.reverseOrder()).toList();


        System.out.println(listOfLetters);


    }


}
