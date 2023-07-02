package day33Maps;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable01_Tekrar {
    public static void main(String[] args) {


        Hashtable<String,Integer> stdntAge = new Hashtable<>();  // multi-thread ve synchronized

        stdntAge.put("Ahmet",30);
        stdntAge.put("Mehmet",8);
        stdntAge.put("Mustafa",38);
        stdntAge.put("Ayse",36);  // {Mehmet=8, Ahmet=30, Mustafa=38, Ayse=36}
       //  stdntAge.put("a",null); HashTable'larda;  keyler'e  valuelar'a null konulamaz.

        System.out.println(stdntAge);

        System.out.println(stdntAge.get("Ayse")); // 36



    }
}
