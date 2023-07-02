package day37exceptionsenums;
//Eger Runtime Custom Exception uretmek isterseniz RuntimeException Class'a extends etmelisiniz

public class IllegalAgeException extends RuntimeException{

    public  IllegalAgeException (){
        super();
    }

    public  IllegalAgeException (String message){
        super(message);
    }



}
