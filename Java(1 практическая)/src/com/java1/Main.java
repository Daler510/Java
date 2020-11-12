package com.java1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000);
            int temp;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.println(arr[i]);
        }

        System.out.println("Задание 2");
        double[] arr2 = new double[10];
        double sum = 0;
        int b = 1;
        for (int i=0;i<arr2.length;i++) {
            arr2[i] = 1.0/b;
            sum += arr2[i];
            b++;
            System.out.println(arr2[i]);
        }
        System.out.println("sum = " + sum);

        System.out.println("Задание 3");
        int f = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        for (int i=1; i<=a;i++)
        {
            f = f*i;
        }
        System.out.print("fact = " + f);
        in.close();


    }

}