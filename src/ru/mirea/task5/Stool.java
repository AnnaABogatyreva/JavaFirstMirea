package ru.mirea.task5;

public class Stool extends Furniture {
    protected int cntLeg;

    public Stool() {
        cntLeg = 4;
    }

    public Stool(int cntLeg) {
        this.cntLeg = cntLeg;
    }

    public void setCntLeg(int cntLeg) {
        this.cntLeg = cntLeg;
    }

    public int getCntLeg() {
        return cntLeg;
    }

    @Override
    public String toString() {
        return "Stool{" +
                "size=" + size +
                ", color=" + color +
                ", cntLeg=" + cntLeg +
                '}';
    }
}
