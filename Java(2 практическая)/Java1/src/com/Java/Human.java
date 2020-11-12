package com.Java;

import java.util.Scanner;

public class Human {
    Scanner in = new Scanner(System.in);
    private String skin_color;
    private int Age;
    private int Growth;

    public class Head {
        private String Hair_color;
        public String getHair_color () {
            return Hair_color;
        }
        public void setHair_color(String hair_color) {
            Hair_color = hair_color;
        }


        public String toString() {
            return "Голова {" +
                    "Цвет волос = " + Hair_color +
                    '}';
        }
        public Head(String Hair_color) {
            setHair_color(Hair_color);
            toString();

        }
    }
    public class Leg {
        private int Number_Fingers;
        private int Leg_length;

        public int getLeg_length() {
            return Leg_length;
        }

        public int getNumber_Fingers() {
            return Number_Fingers;
        }

        public void setLeg_length(int leg_length) {
            Leg_length = leg_length;
        }

        public void setNumber_Fingers(int number_Fingers) {
            Number_Fingers = number_Fingers;
        }


        public String toString() {
            return "Нога {" +
                    "Кол-во пальцев = " + Number_Fingers +
                    ", Длина ноги = " + Leg_length +
                    '}';
        }
        public Leg(int Number_Fingers,int Leg_length) {
            setLeg_length(Leg_length);
            setNumber_Fingers(Number_Fingers);
            toString();
        }
    }
    public class Hand {
        private int Hand_leu;
        private int Number_Fingers;

        public void setNumber_Fingers(int number_Fingers) {
            Number_Fingers = number_Fingers;
        }

        public void setHand_leu(int hand_leu) {
            Hand_leu = hand_leu;
        }

        public int getNumber_Fingers2() {
            return Number_Fingers;
        }

        public int getHand_leu() {
            return Hand_leu;
        }


        public String toString() {
            return "Рука {" +
                    "Длина рук = " + Hand_leu +
                    ", Кол-во пальцев = " + Number_Fingers +
                    '}';
        }
        public Hand(int Hand_leu,int Number_Fingers) {
            setHand_leu(Hand_leu);
            setNumber_Fingers(Number_Fingers);
            toString();
        }
    }

    public int getAge() {
        return Age;
    }

    public int getGrowth() {
        return Growth;
    }
    public String getSkin_color() {
        return skin_color;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setGrowth(int growth) {
        Growth = growth;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    @Override
    public String toString() {
        return "Человек {" +
                "  Цвет кожи = " + skin_color +
                ", Возраст = " + Age +
                ", Рост = " + Growth +
                '}';
    }

    public Human(int Age, int Growth, String skin_color) {
        setAge(Age);
        setGrowth(Growth);
        setSkin_color(skin_color);
        System.out.println("Введите цвет волос: ");
        String hair_color = in.nextLine();
        System.out.println("Введите кол-во пальцев на ноге: ");
        int number_fingers = in.nextInt();
        System.out.println("Введите длину ног: ");
        int leg_heught = in.nextInt();
        System.out.println("Введите длину рук: ");
        int hand_leu = in.nextInt();
        System.out.println("Введите кол-во пальцев на руке: ");
        int number_fing_hand = in.nextInt();
        Human.Head head = new Head(hair_color);
        Human.Leg leg = new Leg(number_fingers,leg_heught);
        Human.Hand hand = new Hand(hand_leu,number_fing_hand);
        int go;
        System.out.println("Чтобы прордолжить нажмите 1 ");
        go = in.nextInt();
        while (go == 1) {
            System.out.print("Что вы хотите вывести 1(характеристи человека) ,2(Руки), 3(Ноги), 4(Голова), 5(Все данные о человеке) ");
            int num = in.nextInt();
            switch (num) {
                case (1):
                    System.out.println(toString());
                    System.out.println("Чтобы прордолжить нажмите 1 ");
                    go = in.nextInt();
                    break;
                case (2):
                    System.out.println(hand);
                    System.out.println("Чтобы прордолжить нажмите 1 ");
                    go = in.nextInt();
                    break;
                case (3):
                    System.out.println(leg);
                    System.out.println("Чтобы прордолжить нажмите 1 ");
                    go = in.nextInt();
                    break;
                case (4):
                    System.out.println(head);
                    System.out.println("Чтобы прордолжить нажмите 1 ");
                    go = in.nextInt();
                    break;
                case (5):
                    System.out.println(toString());
                    System.out.println(head);
                    System.out.println(hand);
                    System.out.println(leg);
                    System.out.println("Чтобы прордолжить нажмите 1 ");
                    go = in.nextInt();
                    break;
                default:
                    System.out.println("Чтобы прордолжить нажмите 1 ");
                    go = in.nextInt();
            }
        }
    }
}
