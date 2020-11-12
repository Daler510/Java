package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус окружности: ");
        int r = in.nextInt();
        double len = 0,ar = 0;
	    Circle cl = new Circle(r);
	    System.out.println(cl);
	    int next;
        System.out.println("Чтобы продолжить нажмите 1 ");
        next = in.nextInt();
        while (next == 1) {
            System.out.println("Введите радиус окружности: ");
            r = in.nextInt();
            cl.setRad(r);
            cl.Len(r);
            cl.Ar(r);
            System.out.println("Чтобы продолжить нажмите 1 ");
            next = in.nextInt();
        }


    }
}
