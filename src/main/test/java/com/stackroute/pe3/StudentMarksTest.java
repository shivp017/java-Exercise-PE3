package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks;

    @Before
    public  void setUp()
    {
        this.studentMarks=new StudentMarks();

    }

    @After
    public void tearDown(){
        this.studentMarks=null;
    }

    @Test
    public void givenNumberShouldReturnErrorMessage(){
        //action
        int[] array = {10,56,67};
        String Input=studentMarks.gradeDetails(-5, array);
        //assert
        assertEquals("Invalid input",Input);

    }


//   // @Test
//    public void givenNumberShouldReturnMessage(){
//        //action
//        int[] array = {10,56,67};
//        String Input=studentMarks.gradeDetails(3, array);
//        //assert
//        assertEquals("Valid input",Input);}

 //       @Test
//    public void givenInputGreaterthan100ReturnError(){
//        //action
//        String InputMarks=studentMarks.gradeDetails(101);
//        //assert
//        assertEquals("Marks is greater than 100",InputMarks);
//
//    }
}