package ru.mirea.task8;

import ru.mirea.task8.Shape;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ShapePainting extends Frame {

    public ShapePainting() {
        super("ShapePainting");
        // выход при закрытии окна
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(350, 300);
    }

    // в этом методе производится рисование
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        for (int i = 0; i < 5; i++) {
            int x = i * 50 + 50;
            for (int j = 0; j < 4; j++) {
                int y = j * 50 + 50;
                Shape s = rand(x, y);
                s.paint(g);
            }
        }
    }

    public Shape rand(int x, int y) {
        Random random = new Random();
        int r = random.nextInt(3);
        int c = random.nextInt(6);
        String color;
        if (c == 0) color = "blue";
        else if (c == 1) color = "red";
        else if (c == 2) color = "black";
        else if (c == 3) color = "yellow";
        else if (c == 4) color = "cyan";
        else color = "green";
        if (r == 0) {
            Shape s = new Circle(x, y, 20, color);
            return s;
        }
        else if (r == 1) {
            Shape s = new Rectangle(x, y, 40, 30, color);
            return s;
        }
        else if (r == 2) {
            Shape s = new Triangle(x, y, 40, color);
            return s;
        }
        else {
            Shape s = new Circle(x, y, 20, color);
            return s;
        }
    }
}
