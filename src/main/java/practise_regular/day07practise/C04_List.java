package practise_regular.day07practise;

import java.util.ArrayList;
import java.util.List;

public class C04_List {
    public static void main(String[] args) {
         /*
          İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)


          String[] arr = {"John","Brad","Angel","Sofia","Emily"};

          String[] brr = {"sofia","brad","grace","emily","hazel"};

          Output : [Brad,Sofia,Emily]

         */
        String[] arr = {"John","Brad","Angel","Sofia","Emily"};

        String[] brr = {"sofia","brad","grace","emily","hazel"};


        List<String> crr = new ArrayList<>();

        for (String w:arr  ) {
            for (String p :brr) {

                if (w.equalsIgnoreCase(p)){
                    crr.add(w);
                }

            }

        }
        System.out.println(crr);









    }
}
