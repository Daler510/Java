package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Plate tr = new Plate();
    	String color;
    	int height;
    	int width;
    	int length;
		System.out.println("Введите параметры тарелки ");
		Scanner in = new Scanner(System.in);
		System.out.println("Цвет: ");
		color = in.nextLine();
		System.out.println("Высота: ");
		height = in.nextInt();
		System.out.println("Ширина: ");
		width = in.nextInt();
		System.out.println("Длина: ");
		length = in.nextInt();
		tr.setHeight(height);
		tr.setLength(length);
		tr.setWidth(width);
		tr.setColor(color);
		tr.Out();
		in.nextLine();
		System.out.println("Введите параметры бокалов ");
		Goblets gb = new Goblets();
		System.out.println("Вид: ");
		String vi = in.nextLine();
		System.out.println("Высота: ");
		height = in.nextInt();
		System.out.println("Ширина: ");
		width = in.nextInt();
		System.out.println("Длина: ");
		length = in.nextInt();
		gb.setHeight(height);
		gb.setLength(length);
		gb.setWidth(width);
		gb.setView(vi);
		gb.Out();
    }
}
