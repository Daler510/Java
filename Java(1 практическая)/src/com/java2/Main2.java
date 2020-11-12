package com.java2;

public class Main2 {
    public static void main(String[] args) {
       Book b = new Book();
       b.setAuthor("Лев Толстой");
       b.setName("Война и Мир");
       b.setYear(1873);
       b.setPublicher("Эксмо");
       b.setNum_of_pag(1800);
       System.out.println("Автор: " + b.getAuthor());
       System.out.println("Название: " + b.getName());
       System.out.println("Год: " + b.getYear());
        System.out.println("Издатель: " + b.getPublicher());
        System.out.println("Кол-во стр.: " + b.getNum_of_pag());
       System.out.print(b.toString());
    }
}

