package com.balsani.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



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


        System.out.println(array);


    }

    @Test
    public void shouldReturnSizeOfArray() {
        array.addElement("Glauber");
        array.addElement("Samira");
        var actual = array.getSize();
        var expected = 2;

        Assertions.assertEquals(expected,actual);

        System.out.println(array);
    }

    @Test
    public void shouldReturnPosition() {
        array.addElement("Glauber");
        array.addElement("Samira");

        System.out.println(array.search(1));
    }

    @Test
    public void shouldReturnIfElementsExists() {
        array.addElement("Glauber");
        array.addElement("Samira");
        System.out.println(array.exists("Samira"));
    }



}