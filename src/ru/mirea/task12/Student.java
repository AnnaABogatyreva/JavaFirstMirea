package ru.mirea.task12;

public class Student {
    protected int id;
    protected int GPA;

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, int GPA) {
        this.id = id;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public int getGPA() {
        return GPA;
    }

    public boolean cmpr(Student s) {
        if (s.id < id) return true;
        return false;
    }

    @Override
    public String toString() {
        return "(" + id + "," + GPA + ")";
    }
}
