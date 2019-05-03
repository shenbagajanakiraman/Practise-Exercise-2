/* Program to get input from user, reversing it and checking if it is a Palindrome*/


package com.stackroute.pe2;

import java.util.Scanner;

public class ReverseString_Palindrome {


    public String string_input;
    String reverse = "";


    protected String reverseStr(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;

    }

    public String checkInputNull(String a) {
        if(false) {
            throw new NullPointerException();
        }
        return null;
    }

}



