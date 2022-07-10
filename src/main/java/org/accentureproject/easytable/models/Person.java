package org.accentureproject.easytable.models;

import java.util.Date;

public class Person {
    private static int ID;
    private String name;
    private String surname;
    private Date birthDate;
    private String email;

    public Person(String name, String surname, Date birthDate, String email) {
        ++ID;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.email = email;
    }

    public Person(String name, String surname, String email) {
        ++ID;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Person.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
