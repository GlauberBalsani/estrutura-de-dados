package com.balsani.array;

import com.balsani.exception.GenericException;

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
}
