package model;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
        Address address = new Address();
        ZoneId zoneId = ZoneId.of("Europe/Helsinki");
        ZonedDateTime birthofMe = ZonedDateTime.of(2000, 10, 20, 12, 34, 23, 1250, zoneId);
        ZonedDateTime birthOfWife = ZonedDateTime.of(2005, 9, 10, 11, 24, 13, 2250, zoneId);
        ZonedDateTime birthOfJoni = ZonedDateTime.of(2010, 11, 11, 10, 14, 24, 4250, zoneId);

        PersonBasicInformation childrenJoni = new PersonBasicInformation();
        childrenJoni.setName("Joni");
        childrenJoni.setAddress(address);
        childrenJoni.setBirthDate(birthOfJoni);
        childrenJoni.setSocialSecurityNumber("321-654");
        childrenJoni.setNationallity("Finland");
        childrenJoni.setBirthPlace(address);
        address.setCity("Helsinki");
        address.setPostalCode("00100");
        address.setStreet("Vantaan tie 72");
        PersonBasicInformation wifeJulia = new PersonBasicInformation();
        wifeJulia.setAddress(address);
        wifeJulia.setBirthDate(birthOfWife);
        wifeJulia.addChild(childrenJoni);
        wifeJulia.setGender("Nainen");
        wifeJulia.setName("Julia");
        wifeJulia.setNationallity("Finland");
        wifeJulia.setMaritalStatus(MaritalStatus.Married);
        wifeJulia.setSocialSecurityNumber("2224-62234");

        PersonBasicInformation spouseMarko = new PersonBasicInformation();
        spouseMarko.setAddress(address);
        spouseMarko.setBirthDate(birthofMe);
        spouseMarko.addChild(childrenJoni);
        spouseMarko.setGender("Mies");
        spouseMarko.setName("Marko");
        spouseMarko.setNationallity("Finland");
        spouseMarko.setSpouse(wifeJulia);
        spouseMarko.setMaritalStatus(MaritalStatus.Married);
        spouseMarko.setSocialSecurityNumber("1234-12234");

        System.out.println(spouseMarko);

        for (BasicInformation child : spouseMarko.getChildren()) {
            System.out.println("\nLasten tiedot = [\n" + child);
        }

    }

}
