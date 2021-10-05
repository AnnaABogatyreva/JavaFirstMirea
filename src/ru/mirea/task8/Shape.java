package ru.mirea.task8;

import java.awt.*;
import java.awt.event.*;

public abstract class Shape {
    protected int x, y;
    String color;

    abstract public void paint(Graphics g);
}
