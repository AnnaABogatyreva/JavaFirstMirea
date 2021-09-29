package ru.mirea.task4;

public class Author {
    private String name;
    private char gender;
    private String email;

    public Author(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String g = (gender == 'M') ? "m" : "ms";
        return name + " (" + g + ") at " + email;
    }
}