package com.stackroute.pe2;

import java.io.*;

public class CalculateFrequencyOfWords {

    // Initializing counters

    static int countWord = 0;
    static int sentenceCount = 0;
    static int characterCount = 0;
    static int paragraphCount = 1;
    static int whitespaceCount = 0;
    static String str[];


    public static void main(String[] args) throws IOException {

        readfile();
        printWordCount();
        findOccurence();


    }

    private static void findOccurence() throws IOException {
        File file = new File("/home/lakshmi/IdeaProjects/shen/PractiseExercise2/src/main/java/com/stackroute/pe2/FileDemo.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        while((line = reader.readLine()) != null) {
            str = line.split(" ");

        }

    }

    private static void printWordCount() {
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraphs = " + paragraphCount);
        System.out.println("Total number of whitespaces = " + whitespaceCount);
    }

    private static void readfile() throws IOException {

        File file = new File("/home/lakshmi/IdeaProjects/shen/PractiseExercise2/src/main/java/com/stackroute/pe2/FileDemo.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;



        // Reading line by line from the
        // file until a null is returned
        while((line = reader.readLine()) != null)
        {
            if(line.equals(""))
            {
                paragraphCount++;
            }
            if(!(line.equals("")))
            {

                characterCount += line.length();

                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");



                countWord += wordList.length;
                whitespaceCount += countWord -1;

                // [!?.:]+ is the sentence delimiter in java
                String[] sentenceList = line.split("[!?.:,]+");

                sentenceCount += sentenceList.length;
            }
        }


    }
}
