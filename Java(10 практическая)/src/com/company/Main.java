package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File_const fl = new File_const();
        System.out.println("Чтобы продолжить нажми 1");
        int num = in.nextInt();;
        while (num == 1) {
        System.out.println("Какое действие сделать?");
        System.out.println("1.Создание log-файла");
        System.out.println("2.Размер кталога или файла");
        System.out.println("3.Копирование кталога или файла");
        int num2 = in.nextInt();
            switch (num2) {
                case (1): {
                    fl.PrintLogFile();
                    System.out.println("Чтобы продолжить нажми 1");
                    num = in.nextInt();
                    break;
                }
                case (2): {
                    fl.File_directory();
                    System.out.println("Чтобы продолжить нажми 1");
                    num = in.nextInt();
                    break;
                }
                case(3): {
                    fl.Copy_File();
                    System.out.println("Чтобы продолжить нажми 1");
                    num = in.nextInt();
                    break;
                }

            }
        }

    }
}
