package day13;

public class Loops01_tekrar {
    public static void main(String[] args) {
      /*  // cift indexlerdeki karakterleri buyuk yapin.

        System.out.println();

        String s = "miami"; // length 5 MiAmI
        String result ="";
        for (int i = 0;i<s.length();i++){
            result =s.substring(i,i+1);
            if (i%2==0){
                System.out.print(result.toUpperCase());
            }else {
                System.out.print(result);
            }

        }

//////////////////////////////////////////////////////////////////////////


        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz

String s = "Mustafa"; // Must
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            int aIndx = s.indexOf('a');

            if (i<aIndx){
                System.out.print(ch);
            }
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////

*/


//verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz

String s = "Mustafagiller";   // rellig

        for (int i=s.length()-1;i>-1;i--){
           if (i>s.lastIndexOf('a')){
               char ch  = s.charAt(i);
               System.out.print(ch);  // rellig
           }


        }



















    }
}

