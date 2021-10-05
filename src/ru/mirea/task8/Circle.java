package ru.mirea.task8;

import ru.mirea.task8.Shape;

import java.awt.*;
import java.awt.event.*;

public class Circle extends Shape {
    protected int radius;
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = "white";
        radius = 1;
    }
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.color = "white";
        this.radius = radius;
    }
    public Circle(int x, int y, int radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public void paint(Graphics g) {
        if (color == "blue") g.setColor(Color.BLUE);
        else if (color == "red") g.setColor(Color.RED);
        else if (color == "black") g.setColor(Color.BLACK);
        else if (color == "yellow") g.setColor(Color.YELLOW);
        else if (color == "cyan") g.setColor(Color.CYAN);
        else if (color == "green") g.setColor(Color.GREEN);
        g.drawOval(x, y, 2 * radius, 2 * radius);
    }
}
