package ru.mirea.task7;

public class MovableRectangle implements Movable {
    MovablePoint upLeft, downRight;

    MovableRectangle() {
        upLeft = new MovablePoint(1, 1, 1, 1);
        downRight = new MovablePoint(0, 0, 1, 1);
    }
    MovableRectangle(MovablePoint upLeft, MovablePoint downRight) {
        if (upLeft.ySpeed != downRight.ySpeed || upLeft.xSpeed != downRight.xSpeed)
            return;
        this.upLeft = upLeft;
        this.downRight = downRight;
    }
    public void moveUp() {
        upLeft.y += upLeft.ySpeed;
        downRight.y += downRight.ySpeed;

    }
    public void moveDown() {
        upLeft.y -= upLeft.ySpeed;
        downRight.y -= downRight.ySpeed;
    }
    public void moveLeft() {
        upLeft.x += upLeft.xSpeed;
        downRight.x += downRight.xSpeed;
    }
    public void moveRight() {
        upLeft.x -= upLeft.xSpeed;
        downRight.x -= downRight.xSpeed;
    }
    public String toString() {
        return "Текущая позиция верхнего левого угла: (" + upLeft.x + ", " + upLeft.y +
                "), нижнего правого угла: (" + downRight.x + ", " + downRight.y + ")";
    }
}
