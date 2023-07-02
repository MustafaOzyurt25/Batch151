package day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //   Ex : ogrenci email adreslerini national order'da siralamis olarak depolayiniz

//        1 - emailler tekrasiz olduklarindan set kullanmaliyim.
//        2- national order dediginden tree set kullanmayalim
//        3- Ama treeSet yavas old.dan ===> TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs); kullanmaliyim/ the best
//


        long t1 = System.nanoTime();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abl@gmail.com");

        System.out.println(emails);

        // 2.Way : This is the best

        long t2 = System.nanoTime();
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abh@gmail.com");
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("abk@gmail.com");
        emailsHs.add("abl@gmail.com");

        System.out.println(emailsHs); // bu hizli ama national order degil. bunun icin de asagidaki gibi objeyi kullanabiliriz
        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);
        long t3 = System.nanoTime();

        System.out.println(t2 - t1); // 556200
        System.out.println(t3 - t2);  // daha dusuk  163300


    }
}
