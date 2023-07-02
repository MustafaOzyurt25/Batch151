package day27Interface;

public class CarRunner {
    public static void main(String[] args) {
        Engine.stop();//STOP() METHODU  STATIC OLDUGUNDAN INTERFACE ISMI ILE ULASTIK
       Honda h = new Honda();
       h.eco();//ecu() METHODU  STATIC OLmadigindan(default method) OBJEct ILE ULASTIK.


    }


}
