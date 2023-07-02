package day37exceptionsenums;

public class Test {
    public static void main(String[] args) throws InvalidEmailIdCheckedException {
      mailDogrula("ab@gmail.com");
     try {
         mailDogrula2("aaaa@gmail,1.com");
     }catch (InvalidEmailIdUnCheckedException e){
         System.out.println(e.getMessage());   // handl
     }

    }

    private static void mailDogrula2(String eMeil) {

        if (eMeil.contains("@hotmail.com")||eMeil.contains("@gmail.com")){
            System.out.println(eMeil);
        }else {
            throw new InvalidEmailIdUnCheckedException("Uygun mail adresi girmediniz");
        }
    }

   public static void mailDogrula(String eMail) throws InvalidEmailIdCheckedException {

       if (eMail.contains("@hotmail.com") || eMail.contains("@gmail.com")) {
           System.out.println(eMail);
       } else {
            throw new InvalidEmailIdCheckedException("Mail adresleri @hotmail.com veya @gmail.com kelimelerini icermeli");
            }

       }

   }