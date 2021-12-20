package ru.mirea.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 2");
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.print("Числа от 1 до n включительно: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        System.out.print("Введите A и B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Числа от A до B включительно: ");
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Task 4");
        System.out.print("Введите k и d: ");
        int k = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Количество чисел длиной k, сумма которых равна d: " + sumTask4(k, d, 1, 0));
        System.out.println("Task 5");
        System.out.print("Введите n: ");
        n = scanner.nextInt();
        System.out.println("Сумма цифр числа n: " + sumTask5(n));
        System.out.println("Task 6");
        System.out.print("Введите n: ");
        n = scanner.nextInt();
        System.out.println("Число n простое: " + isPrimeTask6(n));
    }

    static int sumTask4(int k, int d, int i, int c) {
        if (k < i) {
            if (d == c) return 1;
            else return 0;
        }
        int x = 0;
        if (k != i)
            x += sumTask4(k, d, i + 1, c + 0);
        for (int j = 1; j <= 9; j++)
            x += sumTask4(k, d, i + 1, c + j);
        return x;
    }

    static int sumTask5(int n) {
        if (n == 0) return 0;
        return n % 10 + sumTask5(n / 10);
    }

    static String isPrimeTask6(int n) {
        if (n < 2) return "NO";
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0) return "NO";
        return "YES";
    }
}
