package com.balsani.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
    private static Array<String> array;

    @BeforeEach
    public void ArrayTest() {
        array = new Array<>(5);
    }

    @Test
    public void shouldInitArray() {

        int i = 0;
        i++;
    }

    @Test
    public void shouldAddElementOnArry() {
        array.addElement("Glauber");
        array.addElement("Samira");


    }



}