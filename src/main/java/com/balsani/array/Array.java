package com.balsani.array;

import com.balsani.exception.GenericException;

public class Array<T> {
    private T[] elements;
    private int size;


    @SuppressWarnings("unchecked")
    public Array(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;


    }

//    public T search(int position) {
//        if (this.elements[position] == null) {
//            throw new GenericException("Position not found");
//        }
//        return this.elements[position];
//    }

    public T search(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Position not found");
        }
        return this.elements[position];
    }

    public int exists(T element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(int position, T element) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Position not found");
        }

        for (int i = size; i >= position; i--) {
            elements[i+1] = elements[i];
        }

        return false;
    }

    public boolean addElement(T element) {

        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;


//    public void addElement(T element) {
//        if (this.index < this.elements.length) {
//            this.elements[this.index] = element;
//            this.index++;
//        }
//        else {
//            throw new GenericException("Array full!");
//        }
//
//
//
//
////        for (int i = 0; i <this.elements.length; i++) {
////            if (this.elements[i] == null) {
////                this.elements[i] = t;
////                break;
////            }
////        }
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < size - 1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.getSize() > 0) {
            s.append(this.elements[this.size - 1]);
        }
        s.append("]");

        return s.toString();
    }
}
