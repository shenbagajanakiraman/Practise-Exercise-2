package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseString_PalindromeTest extends ReverseString_Palindrome{

    ReverseString_Palindrome chk;

    @Before
    public void setUp() throws Exception {
        chk = new ReverseString_Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        chk = null;
        string_input = null;
    }



    @Test
    public void testFindingReverseString() {
        //Assign
        string_input = "Shenbaga Lakshmi J";

        //Act
        reverse = chk.reverseStr(string_input);

        //Assert
        assertEquals("J imhskaL agabnehS",reverse);

        System.out.println("Reversing String : Check!");
    }


    @Test
    public void testCheckReverseStringIsSameAsOriginal() {

        //Assign
        string_input = "redivider";

        //Act
        reverse = chk.reverseStr(string_input);

        //Assert
        assertEquals(string_input,reverse);

        System.out.println("Reverse string and original string same : Check!");

    }



    @Test
    public void testCheckIfInputisNull()  {
        // Act
        String strCheck;
        strCheck = chk.checkInputNull(null);
        // Assert
        assertNull(strCheck);

        System.out.println("Invalid input (null value) : Check!");
    }


}