package introduction.day03scanner;

public class Runnertekrar {
    public static void main(String[] args) {

        Studenttekrar mySon = new Studenttekrar();
        String studentName = mySon.studentName;
        System.out.println("studentName = " + studentName);
        int studentAge = mySon.studentAge;
        System.out.println("studentAge = " + studentAge);
        Byte studentGrade = mySon.studentGrade;
        System.out.println("studentGrade = " + studentGrade);
        mySon.study();
        mySon.beslenme();


        Cartekrar mehmetCar = new Cartekrar();

        String arabaMarkaAdi = mehmetCar.arabaMarkaAdi;
        System.out.println("arabaMarkaAdi = " + arabaMarkaAdi);
        String arabaModelNo = mehmetCar.arabaModelNo;
        System.out.println("arabaModelNo = " + arabaModelNo);
        short arabaModelYili = mehmetCar.arabaModelYili;
        String arabaRenk = mehmetCar.arabaRenk;
        mehmetCar.arabaninHizi();
        mehmetCar.arabaninFrenSistemi();


    }
}
