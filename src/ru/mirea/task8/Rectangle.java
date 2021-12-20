package ru.mirea.task8;

import ru.mirea.task8.Shape;

import java.awt.*;

public class Rectangle extends Shape {
    protected int width;
    protected int height;
    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = "blue";
        width = 1;
        height = 1;
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.color = "blue";
        this.width = width;
        this.height = height;
    }
    public Rectangle(int x, int y, int width, int height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void paint(Graphics g) {
        if (color == "blue") g.setColor(Color.BLUE);
        else if (color == "red") g.setColor(Color.RED);
        else if (color == "black") g.setColor(Color.BLACK);
        else if (color == "yellow") g.setColor(Color.YELLOW);
        else if (color == "cyan") g.setColor(Color.CYAN);
        else if (color == "green") g.setColor(Color.GREEN);
        g.drawRect(x, y, width, height);
    }
}

