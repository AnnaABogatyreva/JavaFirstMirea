package ru.mirea.task7;

public class MovablePoint implements Movable {
    int x, y;
    int xSpeed, ySpeed;

    MovablePoint() {
        x = 0;
        y = 0;
        xSpeed = 1;
        ySpeed = 1;
    }
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp() {
        y += ySpeed;
    }
    public void moveDown() {
        y -= ySpeed;
    }
    public void moveLeft() {
        x += xSpeed;
    }
    public void moveRight() {
        x -= xSpeed;
    }
    public String toString() {
        return "Текущая позиция: (" + x + ", " + y + ")";
    }
}
