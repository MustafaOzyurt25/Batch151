package day12switchincrementdecrementloops;

public class loops01 {

    public static void main(String[] args) {
        // ekrana 5 kere "Hi" yazdiriniz.


        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
/*
Code yazarken: i) tekrarli kod yazmamaya dikkat edin. ii) yazdiginiz kodun tamir edilmesinin kolay olmasina
               iii) yazdiginiz kodun gerektiginde gelistirilmesinin kolay olmasina dikkat ediniz
               iv) yazdiginiz kodun  farkli senaryolar icinde calisabilmesine dikkat ediniz.
 */

        // 1) tekrar var. 2) 5000 kre yap dense burda olmaz. 3) tamir etme nasil olabili 5000 kere.

        // yukarudaki gibi tekrar gerektiren islei yapmak icin "Loop" yapilarini kullaniriiz
        // 1) for_loop   2)while-loop  3)do-while loop  4) for-each-loop.
              //Starting value                  Loop Condition             increment/decrement
        for ( int i = 1;i<6 ;i++){
            System.out.println("Hi");
        }


//   4 den 24 ' ekadar tum tamsayilar aralarinda birer bosluk olacak sekilde yanyana yazdiriniz.
        for(int i = 4;   i<25  ;  i++  ){
            System.out.print(i+" ");
        }
// //  33 den 11 ' ekadar tum cift tamsayilar aralarinda birer bosluk olacak sekilde yanyana yazdiriniz.
        System.out.println();

        for (int i = 33 ;i>10 ; i--){

           if(i%2==0){
               System.out.print(i+" ");
           }
        }
        System.out.println("****************");

        // yazdiginiz kod baska sahada uzmanlikk icermemeli
        for (int i = 32 ;i>10 ; i=i-2){
            System.out.print(i+" ");
        }

        System.out.println("************");



        for (int i = 20;i<75;i++){
            if(i%2!=0){
                System.out.print(i+" ");

            }


        }


        System.out.println();

        // Massachusetts kelimesindeki tum sesli harfleri konsola yazdiriniz.

        String s = "UMassachusettsA";

        for (int i = 0; i<s.length() ; i++){

            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i'|| c== 'o'|| c=='u'|| c=='A' || c=='E' || c=='I'|| c=='O'|| c=='U' ){

                System.out.print(c+" ");  // Y a a u e A

            }
        }
















    }
}
