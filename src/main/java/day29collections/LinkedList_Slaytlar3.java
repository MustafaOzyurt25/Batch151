package day29collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Slaytlar3 {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("Ali");
        llist.add("Velili");
        llist.add("Can");
        llist.add("Ayse");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen silmek istediginiz ismi giriniz");
        String silinecekIsim = scanner.next();

        if (llist.contains(silinecekIsim)){
            llist.remove(silinecekIsim);
            System.out.println(silinecekIsim+ " LinkedList'te vardi ve silindi");
        }else {
            System.out.println(silinecekIsim + "  listede yok bu yuzden " +silinecekIsim  +" silinemedi");
        }

        System.out.println(llist);

    }
}
