package com.company;

public class Person {
    // instance variables of a person
    private String name = "";
    private int age = 0;
    private String gender = "";
    private String ssn = "";
    private String nationality = "";
    private String address = "";
    private String social_status = "";
    private String mail = "";
    private String phone = "";

    // constructor for the class
    public Person(String name, int age, String gender, String ssn, String nationality, String address,
                  String social_status, String mail, String phone) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ssn = ssn;
        this.nationality = nationality;
        this.address = address;
        this.social_status = social_status;
        this.mail = mail;
        this.phone = phone;
    }
    // only getters those instances should be immutable

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public String getSsn() {
        return ssn;
    }

    // setters and getters those instances could be changed
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSocial_status() {
        return social_status;
    }

    public void setSocial_status(String social_status) {
        this.social_status = social_status;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
