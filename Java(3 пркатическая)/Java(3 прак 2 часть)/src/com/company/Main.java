package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Хотите создать Круг, нажмите 1 ");
        System.out.println("Хотите создать Прямоугольник, нажмите 2 ");
        System.out.println("Хотите создать Квадрат, нажмите 3 ");
        int i = in.nextInt();
            switch (i) {
                case (1): {
                    in.nextLine();
                    System.out.println("Введите цвет Круга: ");
                    String color = in.nextLine();
                    System.out.println("Введите радиус: ");
                    double radius = in.nextDouble();
                    Circle cr = new Circle(radius, color, true);
                    break;
                    }

                case (2): {
                    in.nextLine();
                    System.out.println("Введите цвет Прямоугольника: ");
                    String color = in.nextLine();
                    System.out.println("Введите длину: ");
                    double length = in.nextDouble();
                    System.out.println("Введите ширину: ");
                    double width = in.nextDouble();
                    Rectangle res = new Rectangle(width, length, color, true);
                    break;
                    }
                case (3): {
                    in.nextLine();
                    System.out.println("Введите цвет Квадрата: ");
                    String color = in.nextLine();
                    System.out.println("Введите длину стороны: ");
                    double side = in.nextDouble();
                    Square sq = new Square(side, color, true);
                    break;
                    }

                }
            }
        }



