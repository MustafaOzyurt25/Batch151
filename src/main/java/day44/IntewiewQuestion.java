package day44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntewiewQuestion {
    public static void main(String[] args) {
        // Size verilen bir Arrayin "Mountain Array" olup olmadigini gosteren kodu yaziniz.
        // mesela : [0,2,5,3,1,-2]  bir mountain array


        int[] arr = {0,2,5,3,1,-2};

        // Arrayi Liste cevirelim. Cunku List'i kullanmak daha kolay:

        List<Integer> myList = new ArrayList<>();
        Arrays.stream(arr).forEach(t->myList.add(t));
        System.out.println(myList);   // [0, 2, 5, 3, 1, -2]


        // List'teki max elemani bulalim:

        int max=myList.stream().reduce(Math::max).get();
        System.out.println(max); // 5

        // Listteki max elemanin indexini bulmaliyim:

        int idxOfMax = myList.indexOf(max);
        System.out.println(idxOfMax);//2

        // Max elemana kadarki tum elemanlari bir listin icine koy:
        List<Integer> firstList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)<=idxOfMax).forEach(t->firstList.add(t));
        System.out.println("firstList : " +firstList );// firstList : [0, 2, 5]

        //FirstList'in copy'sini olustur:
        List<Integer> firstListCopy =new ArrayList<>();
        firstList.stream().forEach(t->firstListCopy.add(t));
        System.out.println("firstListCopy : " + firstListCopy);// firstListCopy : [0, 2, 5]

        // firstListCopy : [0, 2, 5] 'i sort et
        Collections.sort(firstListCopy);



        boolean rule1 = firstList.equals(firstListCopy);
        System.out.println(rule1);// true

        /*
         burada firsList ile sort edilmis hali( Collections.sort(firstListCopy)) esitse
         demekki kural geregi buraya kadarki elemanlar Mountain yani surekli artma kuralina uyduklaridan
        Arrayin mountain olma ozelligi devam ediyor Ama birde max. elemandan sonraki duruma bakmaliyiz burdada
         benzer sekilde islemler yapilmali. Surekli azalma gozlenmeli burda.
        */

        //////////////////////////////////////////    sorunu ikinci bolumu          ///////////////////////////////////


        //Maximum elemandan sonraki tum elemanlari bir listin icine koy
        List<Integer> secondList = new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)>=idxOfMax).forEach(t->secondList.add(t));
        System.out.println("secondList : "+secondList);// secondList : [5, 3, 1, -2]


        // secondListin copysini olustur: Neden? Cunku secondList'teki elemanlarin gercekten max elemandan
        //sonra surekli olarak azalmada bulunmularmi bunun kontrolunu yapmaliyiz.

        List<Integer> secondListCopy = new ArrayList<>();
        secondList.stream().forEach(t->secondListCopy.add(t));
        System.out.println("secondListCopy : "+ secondListCopy);// secondListCopy : [5, 3, 1, -2]

        // secondListCopy'i ters olarak sirala:
        Collections.sort( secondListCopy);
        System.out.println("sorttan sonra secondListCopy :"+ secondListCopy);// [-2, 1, 3, 5]
        Collections.reverse(secondListCopy);
        System.out.println("reverse'den sonra secondListCopy :"+secondListCopy); //[5, 3, 1, -2]

        // secondList ile reverse'den sonra secondListCopy aynimi diye kontrol et:
        boolean rule2 = secondList.equals(secondListCopy);
        System.out.println(rule2);// true

        System.out.println("Is the array mountain array ? " + (rule1&&rule2));
        // Is the array mountain array ? true


    }
}






/*
Example 1: Size verilen bir arrayin "Mountain Array" olup olmadigini gosteren kodu yaziniz.

Elemanlar bu cesit arrayde once artacak, belli bir elemana gelince o elemandan sonra azalacak.
// {0,2,5,3,1,-2}

Bu soruyu cozmek icin Lambda kullancagiz ve arrayi liste cevirecegiz. Cunku list metodlar yonunde
daha zengindir.
1. adim: Bir array olustur.

2. adim: arrayi liste cevir

3.adim: Integer elemanlari olan yeni bir list olustur

4.adim:Arrays.stream(arr) ile arr arrayindeki elemanlari stream'e cevir

5.adim:forEach metodu ile elamani al ve liste ekle (forEach(t->myList.add(t);
forEach sadece yazdirma islemi icin kullanilmaz. Bunu burada gormus olduk.

6. adim: sout icine listimizin ismini ekleyerek listin elemanlarini ekranda gor

7.adim: maximum elamani bul, int max=myList.stream()reduce(Math::max).get();
sout icine max yazip calistirinca maximum elamani gor

8.adim: maximum elemanin indexini bul. Cunku bundan sonra azalma oldugunu biliyoruz.
int idxOfMax=myList.indexOf(max);
sout icine idxOfMax yazarak maksimum elemanin indexini gor

9.adim: maximum oldugu ve 2.indexte oldugunu anladigimiz sayi 5'ten once artma, sonrasinda azalma var.
maksimum elemana kadarki tum elemanlari bir listin icine koy.

10.adim: yeni bir list olustur. Ilk bolum bu liste girecek.

11.adim:myList.stream().filter(t->myList.indexOf(t)<=idxOfMax).forEach(t->firstList.add(t)
sout icine firstList yazarak ilk bolumu gor. Neden filter kullandik. Cunku ilk bolumu alacagiz, 5'ten sonrasi
elenmeli. Filter icine yazdiklarimiz ile 2.index oncesi indexteki elemanlari aldik. Maximum elemanin
indexinden oncekileri aldik. [3,2,5]

12.Yeni Integer list olustur. First listi ekle. Bu sekilde firstList'i kopyaladik, ayni elemanli
list olusturduk. [3,2,5]

13.firstList'in kopyasi olan listi, collections.sort ile elemanlari alip sirala [2,3,5]

14.firstList ile kopyasinin ayni olup olmadigini kontrol et. boolean rule1=firstList.equals(firstListCopy);
sout icine rule1 yazdik

15. adim: Maximum elemandan sonraki tum elemanlari yeni bir list icine koy

16.adim: yeni bir list daha olusturduk. secondList isimli listimize myList.stream().filter
(t->myList.indexOf(t)>=idxOfMax).forEcah(t->secondList.add(t));

17.adim secondListin copy'sini olustur

18.adim: secondListCopy'i ters olarak sirala. Collections.sort ve ardindan Collections.reverseOrder
metodunu kullandik.

19.adim:secondList ile secondList kopyasi ayni mi diye bak.
equals metodunu kullandik.
Mountain Array olmasi icin iki boolean conteynerimizin sout icinde yazilmasi gerekir.
Sout icinde rule1&&rule2 yazdik. Bize true verdi.
 */