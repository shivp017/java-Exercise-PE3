package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MatrixAddition {

public int[][] sumMatrix(int[][] a , int[][] b, int rows,int col){

  int sum[][] = new int[rows][col];
    for (int i =0 ; i< rows ; i++)
    {
        for(int j=0; j<col;j++)
            sum[i][j]=a[i][j]+b[i][j];


    }
    return sum;
}







}
