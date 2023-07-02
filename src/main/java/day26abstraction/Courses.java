package day26abstraction;
/*
1) Bazen Parent Class'daki methodun bodysi hic bir Child tarafinfidan kullanilmaz.Bu durumda Parent'taki methoda
body yazmak hic kullanilmadigi icin mantikli degil , biz de o method'a body yazmayiz.
2) Bodysi yazilmayan methoda "Abstract method" denir. Abstract vucutsuz soyut anlamindadir.
3) Methodun bodysini yazmayinca da java hata verir,biz de "abstract" keywordunu yazip, java'ya bu methodun bodysi
olmayacak diyoruz.
4) abstract keywordunu kullaninca da elde ettigimiz method normal  Class'lara konulmaz bu nedenle de Classi da
 abstract yapmamiz gerekiyor. Bu yuzden de Clas'i da abstract yapiyoruz
5) Parent'taki method "abstract" ise butun child Classlar o methodu override etmek zorundalar, o yuzden tum childlar
 icin mecburu olmasini istedigimiz fonksiyonlari abstract yapmak mantikli secimdir.
6) Abstract Classlarin icine , Bodysi olan methodlar (Concrete Method)  yazilabilir ama abstract methodlar
  Concrete Classlarin icine yazilamaz.
7) "abstract" keyword ile method body bir methodda ayni anda kullanilamaz.
8) Abstract classlarin icinde abstract methodlar olur, abstract methodlarin bodysi olmadigindan eksik methotlar gibi
dusunulebilir yani abstract Class, icinde eksik bir yapi barindirir.siz abstract classlardan object uretirseniz
abstract clas icindeki eksiklik object'e yansir,ve obj eksigi olan bir obj olmus olur.java bunu istemez.
Cunku eksik bir obj eksik is yapar, bu da applicationun yanlis calismasina neden olur.
 java appl i korumak icin "abstract class"lardan obj uretilmesini engellemistir.

9) abstract Classlarin Constructor'u var ama obj olusturamazlar.(var ama obj uretemez!!!)

10) "final" methodlar abstract olamazlar.

11) "private" methodlar "abstract" olamazlar.

12) "Abstract" Class'in "abstract" Child'i veya Concrete Child'i olabilir.

 */

/*
"final" keywordu aciklar misiniz? (MESHUR INTERWIEW SORUSU)
"final" keyword:
1 - variable' larda  2- methodlarda   3 - Classlarda kullanilabilir.
1- varible larda kull.da a) o varible'a kesinlikla deger atamasi yapilmalidir. b) o ILK ATANAN deger degistirilemez
2- method'larad kull.da  a) o methodun bodysi degistirilemez.   b) o method Override edilemez.

3- Classlarda kullanildiginda a) o Class in child classi olamaz(artik kisirdirlar). Ama final classin kendisi child
olabilir. Yani kisir birinin cocugu olmaz ama kendisi birinin cocugu olabilir.
 */


public abstract class Courses {
    // Body si olmayan methoda abstract (vucutsuz=soyut) method denir.

    public abstract void math();

    public abstract void fen();

    public void art() {
        System.out.println("learn art");
    }


    private void sum() {

    }


}
