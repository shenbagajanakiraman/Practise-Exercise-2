package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourIntegerCheckTest {

    PowerOfFourIntegerCheck chk;
    double number;
    boolean flag;

    @Before
    public void setUp() throws Exception {
        chk = new PowerOfFourIntegerCheck();
    }


    @After
    public void tearDown() throws Exception {
        chk = null;
    }


    @Test
    public void testFindingIfTheNumberIsPowerOfFour() {
        //Assign
        number = 64;

        //Act
        flag = chk.checkIfNumberIsPowerOfFour(number);

        //Assert
        assertTrue(flag);

        System.out.println("Testing if "+number+" is Power of 4 : Check!");


    }


    @Test
    public void testFindingIfTheNumberIsNotPowerOfFour() {
        //Assign
        number = 30;

        //Act
        flag = chk.checkIfNumberIsPowerOfFour(number);

        //Assert
        assertFalse(flag);

        System.out.println("Testing if number is not Power of 4 : Check!");


    }

    @Test
    public void testTrueIfNumberIsInteger() {
        //Assign
        number = 65;
        //Act
        flag = chk.checkIfNumberIsInteger(number);

        //Assert
        assertTrue(flag);

        System.out.println("Integer Input : Check!");
    }



    @Test
    public void testTrueIfNumberIsNotAnInteger() {
        //Assign
        number = 6.8;
        //Act
        flag = chk.checkIfNumberIsInteger(number);

        //Assert
        assertFalse(flag);

        System.out.println("Floating point Input : Check!");
    }

    @Test
    public void testCheckIfInputisInvalid()  {
        // Act
        String strCheck;
        strCheck = chk.Checkinput("a");
        // Assert
        assertEquals("Exception thrown",strCheck);

        System.out.println("Invalid input (String / Special Characters) : Check!");
    }
}