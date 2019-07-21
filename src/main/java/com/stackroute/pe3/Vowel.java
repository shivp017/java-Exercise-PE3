package com.stackroute.pe3;

public class Vowel {

    public String[] vowelRemover(String[] str) {


                String[] inputString = new String[5];
                for (int i = 0; i < 5; i++) {
                    inputString[i] = str[i];
                }
                for (int j = 0; j < 5; j++) {
                    inputString[j] = inputString[j].replaceAll("([a,e,i,o,u])", "");
                }
                return inputString;
            }
        }


