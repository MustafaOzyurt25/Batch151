package day28interface;
/*
1) Class ==> Class  : extends
  interface ==> interface : extends
   Class ==> interface : implements
 */
public interface Mammal extends Animal {
String feedBaby = "Milk";

int age =6;  // Animalda da vardi . sorun degil . karismaz/ Interface ismiyle variablara
                // bakabiliyoruz
}
/*
Abstract Class ile Interface arasindaki farkalr:
1) Abstract Classlar hem abstract hem de conc metod icerebilir, Fakat Interfacelar sadece abstract method icerrir.
   ama istrsek default ve static keywordunu kullanarak Conc Method uretebiliriz

 2) Abstract Classlar Multipal inheritance i desteklemez ama digeri destekler
 3) Abstract Class'lar icinde her turlu variabl'lar icerir. Ama  Interface'lrda variable lar "public static final "olmak zorundalar
4) Interface ler Classlarin childi olamaz ama abstract class lar Interface'in child'i olabilir
5) Abstract Classlarda Cons vardir ama, object uretemez .Interface'laerde constructor yok bu yuzden object uretilemez.

 */