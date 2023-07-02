package day14loops;

public class Loops05_Tekrar {


    public static void main(String[] args) {
        // EX 1: stdNames arrayin daki her ismin sonuna yildiz koayrak yazdiriniz.
        String stdNames[] = new String[3];
        stdNames[0]="ali";
        stdNames[1]="veli";
        stdNames[2]="kasim";
        System.out.println(stdNames[0]+"*");
        System.out.println(stdNames[1]+"*");
        System.out.println(stdNames[2]+"*");


        for (int i = 0;i<stdNames.length;i++){
            System.out.println(stdNames[i]+"*");
        }
        System.out.println();
        for (String w:stdNames) {
            System.out.println(w+"*");

        }

        // Ex 2: bir integer Array olusturun. 5 eleman ekleyiniuz. elemenlarin toplamini bulup konsola yazdiriniz (-)

        int arr[] ={3,5,10,20,30};


            System.out.println(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);




            int sum = 0;
        for (int w : arr){
            sum = sum+w;
        }
        System.out.println(sum);


        // Ex 3: bir char Array olusturun. 3 eleman ekleyiniuz. elemenlarin carpimini bulup konsola yazdiriniz

       int r =1;
        char ary[] = {'@','#','/'};
        for (char w:ary
             ) { r=  (r*w);

        }
        System.out.println(r);













    }
}
