package practise_regular.day07practise;

public class C03_Array {

    public static void main(String[] args) {
             /*

      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.


      int arr1[][] = {{1,2},{3,4,5}};
      int arr2[][] = {{7,8,9},{10,11},{12}};

arr1[0][0] + arr2[0][0] = 1 +7
     */
        int toplam = 0;
        int sinir =0;

        int arr1[][] = {{1,2},{3,4,5}};
        int arr2[][] = {{7,8,9},{10,11},{12}};

        for (int i = 0; i <arr1.length ; i++) { // distaki arraylaerin kisa olaninin sayisinca donguye alacam
            if(arr1[i].length<arr2[i].length){
               sinir =arr1[i].length;
            }else {
                sinir = arr2[i].length;
            }


            for (int j = 0; j < sinir; j++) { //  j ic arrayi ifade ediyor.
               toplam =arr1[i][j]+arr2[i][j];

                System.out.print(toplam+ " ");
            }



        }


    }
}
