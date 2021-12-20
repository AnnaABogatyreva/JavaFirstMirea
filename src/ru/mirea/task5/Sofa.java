package ru.mirea.task5;

public class Sofa extends Furniture {
    protected int material;

    public Sofa() {
        size = 1;
        color = 0;
        material = 1;
    }

    public Sofa(int size, int color, int material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "size=" + size +
                ", color=" + color +
                ", material=" + material +
                '}';
    }
}
