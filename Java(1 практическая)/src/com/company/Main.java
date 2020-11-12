package com.company;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Ball b = new Ball();
        b.type = "Футбольный";
        b.d = 25;
        b.color = "Белый";
        System.out.println(b.toString());

    }
}
