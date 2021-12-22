package ru.mirea.task15;

import java.io.*;
import java.util.Arrays;

public class Main {
    private static String filename = "file1.txt";

    // https://metanit.com/java/tutorial/6.8.php - чтение и запись файлов
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        do {
            ans = ShowMenu(br);
            switch (ans) {
                case 1: TestWrite(br); break;
                case 2: TestRead(); break;
                case 3: TestAppend(br, false); break;
                case 4: TestAppend(br, true); break;
            }
        } while (ans != 0);
        System.out.println("--- выход ---");

    }

    public static int ShowMenu(BufferedReader br) throws IOException {
        int ans = 0;
        System.out.println("1. Реализовать запись в файл введённой с клавиатуры информации.");
        System.out.println("2. Реализовать вывод информации из файла на экран.");
        System.out.println("3. Заменить информацию в файле на информацию, введённую с клавиатуры.");
        System.out.println("4. Добавить в конец исходного файла текст, введённый с клавиатуры.");
        System.out.println("Любая другая строка - выход");
        String s = br.readLine();
        switch (s) {
            case "1" : ans = 1; break;
            case "2" : ans = 2; break;
            case "3" : ans = 3; break;
            case "4" : ans = 4; break;
        }
        return ans;
    }

    public static void TestWrite(BufferedReader br) { // 1
        System.out.println("Вводите данные построчно, пустая строка = конец ввода");
        try (FileWriter fw = new FileWriter(filename)) {
            String s = "";
            while (!(s = br.readLine()).isEmpty())
                fw.write(s + "\r\n");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("--- выполнено! ---");
    }

    public static void TestRead() throws IOException { // 2
        System.out.println("Текущее содержимое файла:");
        try (FileReader fr = new FileReader(filename)) {
            char[] buf = new char[256];
            int c;
            while ((c = fr.read(buf)) > 0) {
                if(c < 256)
                    buf = Arrays.copyOf(buf, c);
                System.out.print(buf);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("--- выполнено! ---");
    }

    public static void TestAppend(BufferedReader br, boolean append) { // 3 & 4
        System.out.println("Вводите данные построчно, пустая строка = конец ввода");
        try (FileWriter fw = new FileWriter(filename, append)) {
            String s = "";
            while (!(s = br.readLine()).isEmpty())
                fw.write(s + "\r\n");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("--- выполнено! ---");
    }

}
