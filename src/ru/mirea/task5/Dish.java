
package ru.mirea.task5;

public abstract class Dish {
    protected String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    abstract public String toString();
}
