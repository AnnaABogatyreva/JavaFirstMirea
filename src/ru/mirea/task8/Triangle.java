package ru.mirea.task8;

import java.awt.*;

public class Triangle extends Shape {
    protected int width;
    public Triangle(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = "blue";
        width = 1;
    }
    public Triangle(int x, int y, int width) {
        this.x = x;
        this.y = y;
        this.color = "blue";
        this.width = width;
    }
    public Triangle(int x, int y, int width, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.color = color;
    }

    public void paint(Graphics g) {
        if (color == "blue") g.setColor(Color.BLUE);
        else if (color == "red") g.setColor(Color.RED);
        else if (color == "black") g.setColor(Color.BLACK);
        else if (color == "yellow") g.setColor(Color.YELLOW);
        else if (color == "cyan") g.setColor(Color.CYAN);
        else if (color == "green") g.setColor(Color.GREEN);
        g.drawLine(x + width/2, y, x, y + width);
        g.drawLine(x + width/2, y, x + width, y + width);
        g.drawLine(x, y + width, x + width, y + width);
    }
}
