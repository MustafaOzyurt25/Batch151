package day24inheritancepoliymorphism;
/*
1) Inheritance'da object olustururken  Constructorlar yukaridan asagiya (Parent dan child e) dogru calisir
2) parent==super ve child ile sub esanlamlidir.
3) super() her Constructor in ilk satirinda gorunmez olarak vardir. Isterseniz onu gorunur de yapabilirsiniz
4) super () sizi parent class daki Constructor'a tasir
5) this() sizi ayni Class icindeki construclar arasinda gezdirir.
6) this icinde bulundugumuz classlardaki variable'lari cagirmaya yarar
     super , parent classlardaki variablari cagirmaya yarar.
   this==> kendi clasindan  variable  yada method cagirmayi saglar.
   super==> parent clasindan variable  yada method cagirmayi saglar.

 7) Parent'tan child'a "Has-A "   ILISKISI VARDIR
 8) child dan Parent e "IS-A"  iliskisi vardir.
 9( Eger data type lari arasinda
 "Has-A " ve "IS-A" iliskisi varsa bu data type'larina "COVARIANT"denir

 */
/*
1) Polymorphizm  ==>> coklu sekil
yani bir metodun farkli sekillerde karsiniza cikmasi demektir
polymorphsizm = Overloading(+) + Overriding(-)
Overriding parent'daki methodu child'lara gore ozellestirme islemi demektir.

2) overriding parent classindaki methodu childin  ihtiyacina gore ozellestirerek kullanmak demektir
3)  oveeriding de methodun body si degistirilir.
4) overridingde method signitur'a a dokunulmaz.
 */


public class Car {


    public void move(){
        System.out.println("Cars move...");
    }


    public void getBreak(){
        System.out.println("Cars break...");
    }


    public void engine(){
        System.out.println("Cars have engine...");
    }


    public  String model = "Car";
    public int price =0;


    public Car () {
        System.out.println("Car constructor 1");
    }
    public Car (int i) {
        this();
        System.out.println("Car constructor 2");
    }




















}
