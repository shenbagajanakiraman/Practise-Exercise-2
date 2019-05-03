package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCheckTest {

    double number;
    EvenNumberCheck chk;
    boolean flag;

    @Before
    public void setUp() throws Exception {
        chk = new EvenNumberCheck();
    }

    @After
    public void tearDown() throws Exception {
        chk = null;
    }

    @Test
    public void testIfNumberIsEven() {
        //Assign
        number = 36;

        //Act
        flag = chk.checkforEvenorOdd(number);

        //Assert
        assertTrue("Even Number - True : Check!",flag);


    }


    @Test
    public void testIfNumberIsOdd() {
        //Assign
        number = 5;

        //Act
        flag = chk.checkforEvenorOdd(number);

        //Assert
        assertFalse("Even Number - False : Check!",flag);



    }


    @Test
    public void testTrueIfNumberIsInteger() {
        //Assign
        number = 65;
        //Act
        flag = chk.checkIfNumberIsInteger(number);

        //Assert
        assertTrue("Integer Input : Check!",flag);


    }



    @Test
    public void testTrueIfNumberIsNotAnInteger() {
        //Assign
        number = 6.8;
        //Act
        flag = chk.checkIfNumberIsInteger(number);

        //Assert
        assertFalse("Floating point Input : Check!",flag);

    }


    @Test
    public void testTrueIfNumberIsNegative() {
        //Assign
        number = -6;
        //Act
        flag = chk.checkIfNumberIsInteger(number);

        //Assert
        assertTrue(flag);

        System.out.println("Negative number : Check");
    }

    @Test
    public void testCheckIfInputisInvalid()  {
        // Act
        String strCheck;
        strCheck = chk.checkInput("a");
        // Assert
        assertEquals("Invalid input (String / Special Characters) : Check!","Exception thrown",strCheck);

    }


}