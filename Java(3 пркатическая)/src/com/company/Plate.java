package com.company;



public class Plate extends Dish {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Out() {
        super.Out();
        System.out.println("Цвет: " + getColor());
    }
}
