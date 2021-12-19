package ru.mirea.task29;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	// создадим массив объектов
        ArrayList<CurrencyInfo> v = new ArrayList<>();
        v.add(new CurrencyInfo("RUR", "Российский Рубль", 1.0));
        v.add(new CurrencyInfo("USD", "Доллар США", 73.72));
        v.add(new CurrencyInfo("EUR", "Евро", 83.52));
        for (int i = 0; i < v.size(); i++)
            System.out.println((i+1) + ". " + v.get(i));
        // сериализуем
        for (int i = 0; i < v.size(); i++) {
            FileOutputStream outputStream = new FileOutputStream(v.get(i).getCurrencyCode() + ".ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(v.get(i));
            objectOutputStream.close();
        }
        // десериализуем
        CurrencyInfo ci1 = readFromFile("RUR.ser");
        System.out.println(ci1);
        CurrencyInfo ci2 = readFromFile("EUR.ser");
        System.out.println(ci2);
        CurrencyInfo ci3 = readFromFile("USD.ser");
        System.out.println(ci3);
    }

    public static CurrencyInfo readFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CurrencyInfo ci = (CurrencyInfo)objectInputStream.readObject();
        objectInputStream.close();
        return ci;
    }
}
