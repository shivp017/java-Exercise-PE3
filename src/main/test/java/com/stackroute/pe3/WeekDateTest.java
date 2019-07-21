package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekDateTest {
    WeekDate weekDate;

    @Before
    public  void setUp()
    {
        this.weekDate=new WeekDate();

    }

    @After
    public void tearDown(){
        this.weekDate=null;
    }

    @Test
    public void givenDateShouldReturnMessage(){
        //action
        String actualResult="28/07/2019";
        String Input=weekDate.date( );
        //assert
        assertEquals(actualResult,Input);

    }


}