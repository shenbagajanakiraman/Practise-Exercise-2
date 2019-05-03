package com.stackroute.pe2;

public class EvenNumberCheck {

    protected boolean flag_check;


    public boolean checkforEvenorOdd(double number)
    {

        if(number % 2 == 0) {
            flag_check = true;
        }
        else {
            flag_check = false;
        }

        return flag_check;
    }

    public boolean checkIfNumberIsInteger(double number) {
        if (number == (int)number) {
            return true;
        }

        return false;
    }

//
//    public boolean checkForNegativeNumber(int number)
//    {
//        return number<0;
//    }

    public String checkInput(String a) {
        if(false) {
            throw new IllegalArgumentException();
        }
        return "Exception thrown";
   }


}
