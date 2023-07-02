package day22stringbuilder;

public class Sbf01 {

    public static void main(String[] args) {
        /*
        1) StringBuffer Java da String ureten bir Class dir.
        2)  StringBuffer Java'da StringBuilder a cok benzer. yani ikisi de mutable String uretir.
        3)  StringBuffer "multi-thread" dir ama StringBuilder ise "multi-thread" degildir.
                         multi thread coklu is demektir burda.
       4)Java    StringBuffer'i, SBuilder dan once olusturdu.
       5) SBuilder multi thread olm.dan, StrinBuffer dan daha hizli calisir.
        6) multi thread yapilirken yapilan islerin siralamasi onem arzeder/ yapilan islerin mantikli bir
          siraya koymak seyncronization olarak adlandirilir . SBf Multi tehread  old,dan ayni zamanda sencronozation olmalidir
         3 tane String olusturan Class:
         Eger immutable String lAZIM SA : String Class
         eger mutable String lazimsa : StringBuilder veya StringBuffer kullaniriz

                                      i) Sbi, multi-thread gerekmezse kullaniriz.
                                      ii) SbF ise , multi thread gerekirse kullaniriz.


         */

        StringBuffer sbf1 = new StringBuffer("Java");
























    }
}
