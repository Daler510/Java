package Dogs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите породу: ");
        String breed = in.nextLine();
        System.out.println("Введите цвет: ");
        String color= in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        System.out.println("Введите вес: ");
        int weight = in.nextInt();
        Dog1 dg1 = new Dog1();
        dg1.SetAll(age,color,breed);
        dg1.setWeight(weight);
        dg1.Out();
        in.nextLine();
        System.out.println("Введите породу: ");
        breed = in.nextLine();
        System.out.println("Введите цвет: ");
        color= in.nextLine();
        System.out.println("Введите возраст: ");
        age = in.nextInt();
        System.out.println("Введите вес: ");
        weight = in.nextInt();
        Dog2 dg2 = new Dog2();
        dg2.SetAll(age,color,breed);
        dg2.setWeight(weight);
        dg2.Out();

    }
}
