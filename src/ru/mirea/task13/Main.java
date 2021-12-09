package ru.mirea.task13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("one");
        array.add("two");
        array.add("three");
        String s = array.get(1);
        System.out.println(array.contains("one"));
        array.set(0, "four");

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Anna");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");
        LinkedList<String> list = new LinkedList<>();
        list.add(str1);
        list.add(str3);
        list.add(1, str2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        MyArrayList<Integer>  lst = new MyArrayList<>(3);
        System.out.println(lst.isEmpty());
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        System.out.println(lst);
        lst.add(5, 9);
        System.out.println(lst);
        lst.remove(2);
        System.out.println(lst);
        lst.remove(new Integer(5));
        System.out.println(lst);
        System.out.println(lst.isEmpty());
        System.out.println(lst.indexOf(2));
        System.out.println(lst.get(2));
    }
}
