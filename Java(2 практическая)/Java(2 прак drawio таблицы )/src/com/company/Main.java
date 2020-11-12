package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя автора письма: ");
        String name = in.nextLine();
        System.out.println("Введите email автора письма: ");
        String email = in.nextLine();
        System.out.println("Введите пол автора письма: ");
        int x = System.in.read();
        char gender = (char) x;
        Author au = new Author(name,email,gender);
        System.out.println(au.toString());
    }
}
