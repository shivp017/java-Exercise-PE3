package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumberTest {
    ConsecutiveNumber consecutiveNumber;

        @Before
        public  void setUp()
        {
            this.consecutiveNumber=new ConsecutiveNumber();

        }

        @After
        public void tearDown(){
            this.consecutiveNumber=null;
        }

        @Test
        public void givenInputShouldReturnConsecutive(){
            //action

            String Input=consecutiveNumber.isConsecutive("123456");
            //assert
            assertEquals("consecutive number",Input);

        }

    @Test
    public void givenInputShouldReturnError(){
        //action

        String Input=consecutiveNumber.isConsecutive("1211134856");
        //assert
        assertEquals("Not a consecutive number",Input);

    }

}