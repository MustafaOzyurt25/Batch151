package day17;

import java.util.Arrays;

public class MultiDimensional {

    public static void main(String[] args) {

        // multidimensional Array nasil olusturulur:
        String names[][] = new String[3][2];


        names[1][0] = "p";
        names[2][1] = "Z";

        names[0][0] = "A";

        names[0][1] = "K";
        names[1][1] = "M";

        names[2][0] = "C";

        System.out.println(Arrays.deepToString(names));  // [[A, K], [p, M], [C, Z]]  Arrayin tamami icin deepToString fakat spesifik icin farkli
        System.out.println(Arrays.toString(names));  // [[Ljava.lang.String;@6d03e736, [Ljava.lang.String;@568db2f2, [Ljava.lang.String;@378bf509]
        // toString ile adresleri alinir.

        // multidimensional Array icinden spesifik eleman nasil yazdirilir?

        System.out.println(names[1][1]);//M   spesifik icin sout yeter.

        // md Array icinden bir Arrayi yazdirmak

        System.out.println(Arrays.toString(names[0])); // [A, K]
        System.out.println(Arrays.toString(names[1]));  // [p, M]
        System.out.println();

        // Kisayoldam MD Array nasil olustururlur?

        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Set", "deli"}, {"ceyhan", "Kayahan"}};

        // yukardaki stuedents arrayinde toplam kac isim var?

        int sum = 0;

        for (String[] w : students) {
            sum = sum + w.length;  // 2 + 1 +

        }
        System.out.println(sum);  // 8


// yukaridaaki stud. arrayinde icinde "m" olan isimlari konsola yazdiriniz.
//  String students [][] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Set","deli"},{"ceyhan","Kayahan"}};

        for (String[] w : students) {


            for (String k : w) {


                if (k.contains("h")) {
                    System.out.println(k);
                }
            }
        }


        // bir int md Array olusutrunuz tum elemanlerin carpinmini hesapalyiniz


        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};

        int result = 1;

        for (int[] w : nums) {


            for (int k : w) {


                result = result * k;
                System.out.println(result);
            }
        }

//***************************************************************************************************************************


        // Ex 4: iki boyutlu bir Arrayi tek boyutlu bir Arraya ceviriniz


        int numbers[][] = {{5, 4}, {2, 3, 2}, {7}};   // =====>> {5,4,2,3,2,7}


        // 1. step : iki boyutlu arrayde kac elemn old. bulan kodu yazmaliyiz.. 5


        // 2. step tek boyutlu arrayi iki boyutlu arrayin elemmn sayiisni kullanarak olusturmaliyiz...
        // 3.step  iki boyutlu arraydeki elmnlari tek boyutlu arraye transfer edecez


        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        // ex 5: bir int MD arrayde ki en buyuk ve en kucuk elemn lerin toplanmini bulunuz


        int ages[][] = {{15, 4}, {12, 43, 21}, {7}};   // 4 + 43 = 47

        // tek boyutlu ya cevirelim ;


        int small = ages[0][0];  // elemnlardan birini baslangic olarak aldik
        int big = ages[0][0];

        // {{15, 4}, {12, 43, 21}, {7}};
        for (int[] w : ages) {


            for (int k : w) {


                small = Math.min(small, k);
                big = Math.max(big, k);          // 47
            }


        }

        System.out.println(small + big);  // 4


    }
}
