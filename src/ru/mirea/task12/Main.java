package ru.mirea.task12;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        System.out.println("Task 1");
        Student[] iDNumber = {new Student(10, 1), new Student(2, 2), new Student(10, 3),
                new Student(3, 4), new Student(1, 5), new Student(2, 6), new Student(5, 7)};
        System.out.println(Arrays.toString(iDNumber));
        for (int left = 0; left < iDNumber.length; left++) {
            Student value = iDNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (iDNumber[i].cmpr(value)) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    break;
                }
            }
            iDNumber[i + 1] = value;
        }
        System.out.println(Arrays.toString(iDNumber));

        System.out.println("Task 2");
        SortingStudentsByGPA[] listGPA = {new SortingStudentsByGPA("S1", 10, 3),
                new SortingStudentsByGPA("S2", 2, 4),
                new SortingStudentsByGPA("S3", 10, 3),
                new SortingStudentsByGPA("S4", 3, 5),
                new SortingStudentsByGPA("S5", 1, 4),
                new SortingStudentsByGPA("S6", 2, 5),
                new SortingStudentsByGPA("S7", 5, 4)};
        System.out.println(Arrays.toString(listGPA));
        quickSort(listGPA, 0, 6);
        System.out.println(Arrays.toString(listGPA));

        System.out.println("Task 3");
        SortingStudentsByGPA[] list1 = {new SortingStudentsByGPA("S01", 10, 3),
                new SortingStudentsByGPA("S02", 2, 4),
                new SortingStudentsByGPA("S03", 10, 3),
                new SortingStudentsByGPA("S04", 3, 5),
                new SortingStudentsByGPA("S05", 1, 4),
                new SortingStudentsByGPA("S06", 2, 5),
                new SortingStudentsByGPA("S07", 5, 4)};
        SortingStudentsByGPA[] list2 = {new SortingStudentsByGPA("S08", 10, 3),
                new SortingStudentsByGPA("S09", 12, 5),
                new SortingStudentsByGPA("S10", 110, 3),
                new SortingStudentsByGPA("S11", 13, 5),
                new SortingStudentsByGPA("S12", 11, 4),
                new SortingStudentsByGPA("S13", 211, 5),
                new SortingStudentsByGPA("S14", 15, 3)};
        quickSort(list1, 0, 6);
        quickSort(list2, 0, 6);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
        SortingStudentsByGPA[] list3 = {new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0),
                new SortingStudentsByGPA("", 0, 0)};
        int i1 = 0, i2 = 0, i3 = 0;
        while (i3 < list3.length) {
            if (i1 < list1.length && i2 < list2.length) {
                if (list1[i1].compareTo(list2[i2]) > 0) {
                    list3[i3] = list1[i1];
                    i1++;
                } else if (i2 < list2.length) {
                    list3[i3] = list2[i2];
                    i2++;
                }
            }
            else if (i1 < list1.length) {
                list3[i3] = list1[i1];
                i1++;
            }
            else if (i2 < list2.length) {
                list3[i3] = list2[i2];
                i2++;
            }
            i3++;
        }
        System.out.println(Arrays.toString(list3));
    }

    public static void quickSort(SortingStudentsByGPA[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        SortingStudentsByGPA pivot = source[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (source[leftMarker].compareTo(pivot) > 0) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (source[rightMarker].compareTo(pivot) < 0) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    SortingStudentsByGPA tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
}
