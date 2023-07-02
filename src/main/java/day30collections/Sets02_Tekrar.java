package day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02_Tekrar {
    public static void main(String[] args) {

        TreeSet<String> emails = new TreeSet<>();


        emails.add("abd@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abc@gmail.com");
        emails.add("abl@gmail.com");
        emails.add("abe@gmail.com");

        System.out.println(emails);

        HashSet<String> emailshs = new HashSet<>();
        emailshs.add("abd@gmail.com");
        emailshs.add("abk@gmail.com");
        emailshs.add("abf@gmail.com");
        emailshs.add("abg@gmail.com");
        emailshs.add("abh@gmail.com");
        emailshs.add("abi@gmail.com");
        emailshs.add("abj@gmail.com");
        emailshs.add("abc@gmail.com");
        emailshs.add("abl@gmail.com");
        emailshs.add("abe@gmail.com");

        System.out.println(emailshs);


        TreeSet<String> emailhsts = new TreeSet<>(emailshs);


        emailhsts.add("abd@gmail.com");
        emailhsts.add("abk@gmail.com");
        emailhsts.add("abf@gmail.com");
        emailhsts.add("abg@gmail.com");
        emailhsts.add("abh@gmail.com");
        emailhsts.add("abi@gmail.com");
        emailhsts.add("abj@gmail.com");
        emailhsts.add("abc@gmail.com");
        emailhsts.add("abl@gmail.com");
        emailhsts.add("abe@gmail.com");

        System.out.println(emailhsts);













    }
}
