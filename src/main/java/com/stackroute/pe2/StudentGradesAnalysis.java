package com.stackroute.pe2;

import java.util.Scanner;


public class StudentGradesAnalysis {

    static Scanner input = new Scanner(System.in);
    static   int[] marks;
    static int sum;

    private void getMarks(int number) {

        marks = new int[number];

        for (int i = 0; i < marks.length; i++) {
            System.out.println(" Enter the mark of student " + (i) + " : ");
            marks[i] = input.nextInt();

        }
    }


    private  void findMaxMarks(int[] marks) {
        int max = marks[0];

        for(int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }

        }

        System.out.println("Maximum marks is... "+ max);
    }

    private  void findMinMarks(int[] marks) {
        int min = marks[0];
        for(int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }

        }

        System.out.println("Minimum marks is... "+ min);
    }

    private  void findAverage(int[] marks) {
        for(int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

        }

        float avg = (float)sum / marks.length;

        System.out.println(" The Average is ..."+ avg);

    }

    public static void main (String[] args) {

        StudentGradesAnalysis studentGradesAnalysis = new StudentGradesAnalysis();


        System.out.println("Enter the number of students : ");
        int number = input.nextInt();
        studentGradesAnalysis.getMarks(number);
        studentGradesAnalysis.findAverage(marks);
        studentGradesAnalysis.findMinMarks(marks);
        studentGradesAnalysis.findMaxMarks(marks);

    }


}

