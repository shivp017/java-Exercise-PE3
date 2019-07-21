package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {

    Vowel vowel;

    @Before
    public void setUp() {
        this.vowel = new Vowel();

    }

    @After
    public void tearDown() {
        this.vowel = null;

    }

    @Test
    public void givenInputShouldREturnArrayWithoutVowel() {

        String[] array = {"India", "United States","Germany","Egypt","czechoslovakia"};
        String[] expectedArray = {"Ind", "Untd Stts","Grmny", "Egypt","czchslvk"};
        String[] actualResult = vowel.vowelRemover(array);
        assertArrayEquals( expectedArray, actualResult);
    }


    @Test
    public void givenInputShouldArrayWithoutVowel() {

        String[] array = {"", "United State","Germany","Egypt","czechoslovakia"};
        String[] expectedArray = {"Ind", "Untd Stts","Grmny", "Egypt","czchslvk"};
        String[] actualResult = vowel.vowelRemover(array);
        assertArrayEquals( expectedArray, actualResult);
    }


}