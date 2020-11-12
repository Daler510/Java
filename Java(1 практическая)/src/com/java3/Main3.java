package com.java3;

public class Main3 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Овчарка", 5, "черный");
        Dog dog2 = new Dog("Бигкель" , 3, "кориичневый");
        Dog dog3 = new Dog("Такса" , 6, "белый");
        Dog dog4 = new Dog("Хаски",7,"серый");
        String Mass [] = new String[4];
        Mass[0] = dog1.toString();
        Mass[1] = dog2.toString();
        Mass[2] = dog3.toString();
        Mass[3] = dog4.toString();
        for(int i=0;i< Mass.length;i++) {
            System.out.println(Mass[i]);
        }
        System.out.println("Возраст 1 собаки : " + dog1.getYear());
        System.out.println("Возраст 1 собаки переведеный к человеческому: " + dog1.AgeTransf(dog1.getYear()));
    }
}
