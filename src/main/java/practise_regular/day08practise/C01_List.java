package practise_regular.day08practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C01_List {
    public static void main(String[] args) {
    /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */

List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

//        System.out.println(list);             //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
//        for (int i = 0; i < list.size(); i++) {  // o dan listin uzunluguna kadar donguye aldik
//
//            if (list.get(i)>10){ // listin i. indexindeki elemani getirdik 10 dan buyuk mu kontrol ettik
//                list.set(i,2* list.get(i));// buyukse i.indexdeki elemani 2 katiyla set ettik
//            }
//
//        }
//        System.out.println(list);           //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 24, 26, 28, 30]



        for (int w: list ) {
            if (w>10){
                w=2*w;

            }
            System.out.println(w);
        }
      ;





















    }
}
