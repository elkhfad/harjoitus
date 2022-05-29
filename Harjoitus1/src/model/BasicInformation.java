package model;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class BasicInformation {
    private String name;
    private String socialSecurityNumber;
    private MaritalStatus maritalStatus;
    private Address address;
    private String nationallity;
    private ZonedDateTime birthDate;
    private ZonedDateTime deathDate;
    private Address birthPlace;
    private Address deathPlace;
    private String gender;

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getNationallityy() {
        return nationallity;
    }

    public void setNationallity(String nationallity) {
        this.nationallity = nationallity;
    }

    public ZonedDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(ZonedDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public ZonedDateTime getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(ZonedDateTime deathDate) {
        this.deathDate = deathDate;
    }

    public Address getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(Address birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Address getDeathPlace() {
        return deathPlace;
    }

    public void setDeathPlace(Address deathPlace) {
        this.deathPlace = deathPlace;
    }

    public String getNationallity() {
        return nationallity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Perustiedot:  [\nNimi = " + this.name + ", \nHenkilotunnus = " + this.socialSecurityNumber
                + ", \nSivilisaaty = " + this.maritalStatus + ", \nOsoite = " + this.address + ", \nKansallisuus = "
                + this.nationallity + ", \nSyntymaaika = "
                + DateTimeFormatter.ofPattern("dd.MM.yyyy , hh:mm").format(this.birthDate) + ", \nKuolinpaiva = "
                + this.deathDate + ", \nSyntymapaikka = " + this.birthPlace + ", \nKuolinpaikka = " + this.deathPlace
                + ", \nSukupuoli = " + this.gender + "]";
    }

}
