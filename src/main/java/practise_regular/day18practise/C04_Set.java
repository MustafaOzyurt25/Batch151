package practise_regular.day18practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_Set {
    public static void main(String[] args) {

        // Verilen bir array'den tekrar eden elemanları silip
        // unique elemanlardan olusan bir array haline donusturen method olusturun

        int arr[] = {1, 2, 2, 3, 4, 4, 5};

        System.out.println(Arrays.toString(benzersizYap(arr)));// [1, 2, 3, 4, 5]

    }

    public static int[] benzersizYap(int arr[]) {

        Set<Integer> set = new HashSet<>();

        for (int w : arr) {

            set.add(w);

        }

        int idx = 0;
        int arr2[] = new int[set.size()];
        for (Integer w : set) { // setlerde index yapisi olm.dan foreach kullandik

            arr2[idx] = w;
            idx++;

        }
        arr = arr2;
        return arr;
    }
}
