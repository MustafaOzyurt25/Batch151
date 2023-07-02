package day18constructerstatickeyword;

public class Student {
    // Degisimin herkes tarafindan bilinmesi icin ilgili varable'in static olmasi lazim gelir.
// bazi variable'in degisimlari herkes icin ortak olur(ay hepimiz iciin ortak)

    //1. "Static " " class member"lar(variable +method+ constructor+code blocks) tum objectler
    // tarafindan paylasilir.
// 2. "Static " " class member"lar daki degisiklikler tum objectler tarafindan otomatik olarak gorulur.
    // 3 "Static " " class member"lar gokteki ayin dunyaya bagli oldugu gibi Clasa baglidirlar.
    // Bu yuzden static variable'lara bazen "class variable" da denir.
    // 4. "Static ", "class member"larin nasil calistigini anlamak icin cizim yapip static olanlari Class'a
             // olmayanlari ise objectlere baglayip dusunmek bu konuyu kolaylastirir.
    // 5) "static" "class memberler" lari  cagirmak icin object olusturmak gerekmez ve tavsiye edilmez.
// "Non-static" class memberleri cagirmak icin object olusturmak sarttir.



    public static int numOfRegisteredStd =0;
    public  int num =0;

    public Student() {
        numOfRegisteredStd++;
        num++;
    }


    public static void main(String[] args) {

        System.out.println(numOfRegisteredStd); // 0

        Student s1 = new Student();
        System.out.println(numOfRegisteredStd); // 1

        Student s2 = new Student();
        System.out.println(numOfRegisteredStd);//2

        Student s3 = new Student();
        System.out.println(numOfRegisteredStd); //3


        System.out.println(s1.num); //1

        System.out.println(s2.num);






    }

}
