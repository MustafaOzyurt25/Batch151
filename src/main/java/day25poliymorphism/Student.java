package day25poliymorphism;

public class Student {

    public String stdName = "Tom Hanks";
    public int age = 23;

    // Encapsulation: Data saklamaktir.(Data hiding)
    // Data' yi nasil saklarsin? ==> Acces Modifeir'ini "private" yaparak.

    //herhangi bir konu veya method icin:  nedir?    nicin ?


    // Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz.
    // NASIL OKURUZ ? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.
    // i) "get method" lari hep public olur   ii) get methodun return type'i okudugu variable'in return type'i ile ayni olur.
    // iii) Encapsulation yapilan variabel'in data type'i  boolean ise get method ismi "is" ile baslar.

    private String stdId = "AC2023102T";

    public String getStdId() {
        return stdId;
    }


    private double gpa = 3.87;

    public double getGpa() {
        return gpa;
    }

    private boolean isSuccessful = false;

    // Encapsulation yaptigimiz datayi istersek diger Classlardan nasil degistirebiliriz:
    //==>set method olusturarak, Encapsulation yaptigimiz datanin degerini degistirebiliz.
    // i) set methodun Acces M i hep public olur/ ii)  set methodun "return type"'i hep void olur.
    // iii)set method parametre kullanir. set method'un parametresinin data type'i  o variable ile ayni olur.
    // set methodu kullanarak ,  varolan object uzerinde degisiklikler yaparak o objecti sanki yeni bir objectmis gibi
                                                                                                    // kullanabiliriz
    // note: get method'larin diger adi "getter"; set m dun diger adi "setter" dir.

    public void setGpa(double gpa) {
        this.gpa = gpa;  // bu gpa yi degistir.
    }



    public boolean isSuccessful() {
        return isSuccessful;
    }


    public  void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }









}
