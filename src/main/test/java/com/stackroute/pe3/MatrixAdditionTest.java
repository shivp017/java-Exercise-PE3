package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition;

    @Before
    public  void  setUp()
    {
        this.matrixAddition= new MatrixAddition();
    }

    @After
    public void  teaDown(){

        this.matrixAddition=null;
    }

    @Test
    public void givenMatrixShouldReturnsum()
    {
         int rows=3;
          int col=2;

        int a[][] ={{1, 2},{3, 4,},{5, 6}};
        int b[][] ={{9, 8},{7, 6},{5, 4}};
        int[][] InputMatrix=matrixAddition.sumMatrix(a,b,rows,col);
        int[][] expectedResult={{10, 10},{10, 10},{10, 10}};
        assertArrayEquals(expectedResult,InputMatrix);
}


}