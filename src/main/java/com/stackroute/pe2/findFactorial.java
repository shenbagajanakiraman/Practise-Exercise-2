package com.stackroute.pe2;

public class findFactorial {
    public static void main(String[] args) {

        System.out.println(" Int Factorials....");
        intFactorial();

        System.out.println(" Long Factorials....");
        longFactorials();

    }

    private static void longFactorials() {

        long fact = 1;
        for ( int i =1 ; i < 25 ; i++) {
            for (int j = 1; j <= i; j++) {
                fact = fact * i;
            }
            if (fact > 0) {
                System.out.println("Factorial of " + i + " is : " + fact);
                fact = 1;
            }
            else {
                System.out.println("Factorial of " +i+  " is : out of range");
                break;
            }
        }
    }


    private static void intFactorial() {

        int fact = 1;
        for ( int i =1 ; i < 15 ; i++) {
            for (int j = 1; j <= i; j++) {
                fact = fact * i;
            }
            if (fact > 0) {
                System.out.println("Factorial of " + i + " is : " + fact);
                fact = 1;
            }
            else {
                System.out.println("Factorial of " +i+  " is : out of range");
                break;

            }
        }
    }

}
