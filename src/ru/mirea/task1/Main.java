package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        System.out.println("3. Сумма элементов целочисленного массива {1, 2, 3, 4, 5} цикл for: " + sum);
        sum = 0;
        int i = 0;
        while (i < a.length) {
            sum += a[i];
            i++;
        }
        System.out.println("   Сумма элементов целочисленного массива {1, 2, 3, 4, 5} цикл while: " + sum);
        sum = 0;
        i = 0;
        do {
            sum += a[i];
            i++;
        } while (i < a.length);
        System.out.println("   Сумма элементов целочисленного массива {1, 2, 3, 4, 5} цикл do while: " + sum);

        Scanner s = new Scanner(System.in);
        System.out.print("4. Введите значения массива (5 элементов): ");
        for (int j = 0; j < a.length; j++) {
            if (s.hasNextInt()) a[j] = s.nextInt();
        }
        System.out.print("   Вывод аргументов командной строки в цикле for: ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();

        System.out.print("5. Первые 10 чисел гармонического ряда: ");
        for (int j = 1; j <= 10; j++) {
            double x = 1 / (double) j;
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("6. Массив сгенерированных чисел: (метод random() класса Math): ");
        int[] b = new int[10];
        for (int j = 0; j < b.length; j++) {
            b[j] = (int) (Math.random() * 1000);
        }
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j] + " ");
        }
        System.out.println();
        System.out.print("   Массив сгенерированных чисел: (класс Random): ");
        Random rand = new Random();
        for (int j = 0; j < b.length; j++) {
            b[j] = rand.nextInt(1000);
        }
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j] + " ");
        }
        System.out.println();
        Arrays.sort(b);
        System.out.print("   Отсортированный массив: ");
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j] + " ");
        }
        System.out.println();

        int n = 5;
        System.out.println("7. Факториал числа: " + fact(n));
    }

    static int fact(int x) {
        int n = 1;
        for (int i = 1; i <= x; i++)
            n *= i;
        return n;
    }
}