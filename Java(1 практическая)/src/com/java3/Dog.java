package com.java3;

public class Dog {
    private String breed;
    private int year;
    private String color;
    Dog (String breed,int year,String color) {
        setBreed(breed);
        setColor(color);
        setYear(year);
    }
    // Гетеры
    public String getBreed() {
        return breed;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    //Сетеры
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "Порода: " + breed + ". Возраст: " + year + ". Цвет: " + color;
    }
    public int AgeTransf(int age) {
        age = getYear() * 7;
        return age;
    }
}
