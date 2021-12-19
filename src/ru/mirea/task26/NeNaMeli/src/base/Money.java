package ru.mirea.task26.NeNaMeli.src.base;

import java.util.Random;

public class Money <T extends Number>{
    T value;

    public Money(T value) {
        this.value = value;
    }

    T generatePrize(){
        Random r = new Random();
        double prob = r.nextDouble();
        if (prob < 0.05){
            return value;
        }
        return null;
    }
}
