package com.company;

public class Author {
    private String name;
    private String email;
    private char gender;

    @Override
    public String toString() {
        return "Автор: " +
                "Имя =" + name +
                ", email =" + email +
                ", Пол = " + gender +
                " .";
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Author(String name,String email,char gender) {
        setEmail(email);
        setName(name);
        setGender(gender);
    }
}
