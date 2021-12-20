package ru.mirea.task13;

import java.util.Arrays;

public class MyArrayList<E> {
    private int MAXSIZE;
    private E[] DATA;
    private int CURSIZE;

    public MyArrayList() {
        this.CURSIZE = 0;
        this.MAXSIZE = 10;
        this.DATA = (E[]) new Object[this.MAXSIZE];
    }

    public MyArrayList(int MAXSIZE) {
        if (MAXSIZE < 1)
            throw new IndexOutOfBoundsException();
        this.CURSIZE = 0;
        this.MAXSIZE = MAXSIZE;
        this.DATA = (E[]) new Object[this.MAXSIZE];
    }

    private void grow(int minSize) { // увеличение вместимости в 1.5 раза
        if (minSize <= MAXSIZE)
            return;
        E[] NEWDATA = (E[])new Object[minSize];
        for (int  i = 0; i < CURSIZE; i++)
            NEWDATA[i] = DATA[i];
        MAXSIZE = minSize;
        DATA = NEWDATA;
    }

    public boolean add(E e) {
        if (CURSIZE == MAXSIZE-1)
            grow((int) (MAXSIZE * 1.5));
        DATA[CURSIZE] = e;
        ++CURSIZE;
        return true;
    }

    public void add(int index, E e) {
        if (index < 0 || index > CURSIZE)
            throw new IndexOutOfBoundsException();
        if (CURSIZE == MAXSIZE-1)
            grow((int) (MAXSIZE * 1.5));
        ++CURSIZE;
        for (int i = CURSIZE; i > index ; i--)
            DATA[i] = DATA[i-1];
        DATA[index] = e;
    }

    public E remove(int index) {
        if (index < 0 || index >= CURSIZE)
            throw new IndexOutOfBoundsException();
        E e = DATA[index];
        for (int i = index; i < CURSIZE - 1; i++)
            DATA[i] = DATA[i + 1];
        DATA[--CURSIZE] = null;
        return e;
    }

    public boolean remove(E e) {
        int index = indexOf(e);
        if (index == -1)
            return false;
        remove(index);
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= CURSIZE)
            throw new IndexOutOfBoundsException();
        return DATA[index];
    }

    public void set(int index, E e) {
        if (index < 0 || index >= CURSIZE)
            throw new IndexOutOfBoundsException();
        DATA[index] = e;
    }


    public boolean isEmpty() {
        return CURSIZE == 0;
    }

    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < CURSIZE; i++)
            if (e == null ? DATA[i] == null : DATA[i].equals(e)) {
                index = i;
                break;
            }
        return index;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < CURSIZE; i++)
            sb.append(i == 0 ? DATA[i] : ", " + DATA[i]);
        sb.append("]");
        return sb.toString();
    }
}