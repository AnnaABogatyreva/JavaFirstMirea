package ru.mirea.task3;

public class Head {
    private String hairColor;
    private String eyeColor;

    public Head() {
        hairColor = "black";
        eyeColor = "blue";
    }

    public Head(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
