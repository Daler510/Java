package com.company;

public abstract class Dish {
    protected int height;
    protected int length;
    protected int width;

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void Out() {
        System.out.println("Тарелка: " + "\n" + "Высота,ширина,длина : " + getHeight() + " " + getWidth() + " " + getLength());
    }
}
