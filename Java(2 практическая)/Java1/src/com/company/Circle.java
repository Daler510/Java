package com.company;

public class Circle {
    private int rad;
    public Circle(int rad) {
        setRad(rad);
        System.out.println("Радиус окружности равен: " +  getRad());
        Len(rad);
        Ar(rad);

    }
    public void setRad(int rad) {
        this.rad = rad;
    }
    public int getRad() {
        return rad;
    }
    public void Len(int rad) {
        double len;
        setRad(rad);
        len = 2*3.14*rad;
        System.out.println("Длина окружности равна: ");
        System.out.println(len);
    }


    public void Ar(int rad) {
        double ar;
        setRad(rad);
        ar = 3.14 * rad * rad;
        System.out.println("Площадь окружности равна: ");
        System.out.println(ar);
    }


}
