package day38enumsitarator;

public class EnumRunner {

    public static void main(String[] args) {

      String capitalOfIllnious =UsStatesEnum.ILLINOIS.getCapital();

        System.out.println(capitalOfIllnious);//Springfield

      String abbreviationOfFlorida =UsStatesEnum.FLORIDA.getAbbreviation();

        System.out.println(abbreviationOfFlorida);//FL

       UsStatesEnum state = UsStatesEnum.FLORIDA;

       String stateName = UsStatesEnum.getStateNameByUsingAbbreviation("AK");

        System.out.println(stateName);

        System.out.println(UsStatesEnum.getAbbreviationForStateName("Alaska"));  // AK


    }
}
