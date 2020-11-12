package com.company;

public class Goblets extends Dish {
    private String view;

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
    public void Out() {
        super.Out();
        System.out.println("Вид: " + getView());
    }
}
