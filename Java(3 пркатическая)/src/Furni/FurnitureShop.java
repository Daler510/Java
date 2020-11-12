package Furni;

import java.util.Scanner;

public class FurnitureShop extends Furniture  {
    public void Catalog() {
        Scanner in = new Scanner(System.in);
        Table tb = new Table(150,50,60,1200,4);
        Cupboard cb = new Cupboard(270,150,150,4000,15);
        Chair ch = new Chair(120,80,90,600,"Оригинальный");
        System.out.println("Каталог товаров");
        int ind;
                System.out.println("Столы: ");
                System.out.println("Параметры: ");
                System.out.println(tb.getHeight());
                System.out.println(tb.getLength());
                System.out.println(tb.getWidth());
                System.out.println("Кол-во ножек: ");
                System.out.println(tb.getNumber_of_legs());
                System.out.println("Цена: ");
                System.out.println(tb.getPrice());
                System.out.println("\n");
                System.out.println("Шкафы: " + "\n"
                        + "Параметры: " + "\n" +
                        cb.getHeight() + "\n" +
                        cb.getLength() + "\n" +
                        cb.getWidth() + "\n");
                System.out.println("Кол-во полок: " + "\n" +
                        cb.getNumb_of_shelves() + "\n" +
                        "Цена: " + "\n" +
                        cb.getPrice());
                System.out.println("\n");
                System.out.println("Стулья: ");
                System.out.println("Параметры: ");
                System.out.println(ch.getHeight());
                System.out.println(ch.getLength());
                System.out.println(ch.getWidth());
                System.out.println("Вид: ");
                System.out.println(ch.getView());
                System.out.println("Цена: ");
                System.out.println(getPrice());

        System.out.println("Если хотите продолжить нажмите 1 ");
        int next = in.nextInt();
        int price1 = 0,price2 = 0,price3 = 0;
        int kol1 = 0,kol2 = 0,kol3 = 0;
        while (next == 1) {
            System.out.println("Если хотите купить стол(ы) нажмите 1 ");
            System.out.println("Если хотите купить щкаф(ы) нажмите 2 ");
            System.out.println("Если хотите купить стул(ья) нажмите 3 ");
            ind = in.nextInt();
            if (ind == 1) {
                System.out.println("Введите кол-во ");
                kol1 = in.nextInt();
                price1 = kol1 * tb.getPrice();
                System.out.println("Если хотите продолжить нажмите 1");
                next = in.nextInt();
            }
            if (ind == 2) {
                System.out.println("Введите кол-во ");
                kol2 = in.nextInt();
                price2 = kol2 * cb.getPrice();
                System.out.println("Если хотите продолжить нажмите 1");
                next = in.nextInt();
            } else {
                System.out.println("Введите кол-во ");
                kol3 = in.nextInt();
                price3 = kol3 * ch.getPrice();
                System.out.println("Если хотите продолжить нажмите 1");
                next = in.nextInt();
            }
            System.out.println("Ваша покупка: ");
            if(price1 != 0) {
                System.out.println("Стол(ы): " + "Кол-во " + kol1 + " Цена " + price1);
            }
            if(price2 != 0) {
                System.out.println("Шкаф(ы): " + "Кол-во " + kol2 + " Цена " + price2);
            }
            if(price3 != 0) {
                System.out.println("Стул(ья): " + "Кол-во " + kol3 + " Цена " + price3);
            }
            System.out.println("Общая сумма заказа: ");
            int priceAll = price1 + price2 + price3;
            System.out.println(priceAll);
        }
    }

    }

