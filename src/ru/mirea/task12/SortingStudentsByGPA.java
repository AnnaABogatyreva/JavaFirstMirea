package ru.mirea.task12;

public class SortingStudentsByGPA implements Comparable {
    private String name;
    private int id;
    private int GPA;

    public SortingStudentsByGPA(String name, int id, int GPA) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
    }

    public String toString() {
        return "(" + name + ", " + id + ", " + GPA + ")";
    }

    @Override
    public int compareTo(Object obj) {
        // это функция сравнения из интерфейса Comparable
        // должна возвращать значение:
        //   < 0,  если this < obj
        //   = 0,  если this == obj
        //   > 0,  если this > obj

        SortingStudentsByGPA f2 = (SortingStudentsByGPA)obj;
        return this.GPA - f2.GPA;
    }
}
