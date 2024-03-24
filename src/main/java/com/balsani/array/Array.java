package com.balsani.array;

import com.balsani.exception.GenericException;

import java.util.Arrays;

public class Array <T>{
    private T[] elements;
    private int index;

    public Array(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.index = 0;

    }

    public boolean addElement(T element) {
        if (this.index < this.elements.length) {
            this.elements[this.index] = element;
            this.index++;
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
        return this.index;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < index-1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.getSize() > 0) {
            s.append(this.elements[this.index-1]);
        }
        s.append("]");

        return s.toString();
    }
}
