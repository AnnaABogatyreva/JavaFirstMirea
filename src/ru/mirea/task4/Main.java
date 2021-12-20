package ru.mirea.task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing class Author");
        Author a = new Author("Ivan Popov", 'M');
        a.setEmail("ivPopov@somewhere.com");
        System.out.println(a);

        System.out.println("Testing class Ball");
        Ball b = new Ball();
        b.setX(0.9);
        b.setY(1.3);
        System.out.println(b);
    }
}
