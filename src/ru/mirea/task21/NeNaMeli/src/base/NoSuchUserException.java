package ru.mirea.task21.NeNaMeli.src.base;

public class NoSuchUserException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Такого пользователя нет!");
    }
}
