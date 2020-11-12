package com.java2;

public class Book {
    private String author;
    private String name;
    private int year;
    private String publicher;
    private int num_of_pag;

    //Сетеры
    public void setAuthor (String author) {
        this.author = author;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public void setPublicher (String publicher) {
        this.publicher = publicher;
    }
    public void setNum_of_pag (int num_of_pag) {
        this.num_of_pag = num_of_pag;
    }
    //Гетеры
    public int getYear () {
        return year;
    }
    public int getNum_of_pag () {
        return num_of_pag;
    }
    public String getAuthor () {
        return author;
    }
    public String getName () {
        return name;
    }
    public String getPublicher () {
        return publicher;
    }
    public String toString () {
        return author + " " + name + " " + year + " " + publicher + " " + num_of_pag + " .";
    }


}
