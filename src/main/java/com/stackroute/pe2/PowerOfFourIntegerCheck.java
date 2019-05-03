package com.stackroute.pe2;

public class PowerOfFourIntegerCheck {

    public boolean checkIfNumberIsPowerOfFour(double num) {

        int number = (int) num;
        int remainder = -1;
        int i = 0;


        while (number > 0) {
            ++i;
            remainder = number % 4;
            number = number / 4;

            if ((number == 1) && (remainder == 0)) {
                System.out.println("4 power "+i+" is "+num);
                return true;
            }

        }
        return false;
    }

    public boolean checkIfNumberIsInteger(double number) {
        if (number == (int)number) {
            return true;
        }

        return false;
    }



    public String Checkinput(String a) {
        if(false) {
            throw new IllegalArgumentException();
        }
        return "Exception thrown";
    }

    }



