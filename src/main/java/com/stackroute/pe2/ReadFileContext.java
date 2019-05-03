package com.stackroute.pe2;

import java.io.*;


public class ReadFileContext {

    public static void main(String[] args)throws Exception {

        File file = new File("/home/lakshmi/IdeaProjects/shen/PractiseExercise2/src/main/java/com/stackroute/pe2/Sample.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));


        String line;
        String str[];
        int length = 0;
        int lines = 0;

        System.out.println("Converting the file content to upper case and printing");

        while ((line = reader.readLine()) != null) {
            line = line.toUpperCase();
            str = line.split(" ");
            length = length + str.length;
            System.out.println(line);
            lines ++;
        }

        System.out.println("The number of lines are : "+lines);
        System.out.println("The number of words are : "+length);



        /* For reading letter by letter

        FileReader fr = new FileReader("/home/lakshmi/IdeaProjects/shen/PractiseExercise2/src/main/java/com/stackroute/pe2/sample.txt");

        int i;

        while ((i = fr.read() )!= -1) {
            System.out.print((char) i);

        } */
    }

}
