package com.stackroute.pe3;

public class StudentMarks {



public String gradeDetails(int n, int[] grades) {
    String sendMessage = null;
    String sendMessage1;
    int lengthOfGrades = grades.length;
    if(n==0||lengthOfGrades<0&&lengthOfGrades>100) {
        sendMessage = "Valid input";
    }
    else if
        (n==(lengthOfGrades) || lengthOfGrades>0 && lengthOfGrades< 100){
        sendMessage = "Invalid input";
    }
    return sendMessage;
}

}
