package com.pluralsight;

//import FileReader
//Import BuffReader
//Import scanner

import java.io.*;
import java.util.*;


public class BedtimeStoriesApp {

    //Creat main class

    public static void main(String[] args) {

        //Initialize Scanner
        Scanner input = new Scanner(System.in);

        //Prompt user for name of story they would like to read
        System.out.println("Which story would you like to read?");
        String story = input.nextLine();

        //Add if statements
        if (story.equals("goldilocks.txt")) {
            try {
                FileReader fileReader = new FileReader("goldilocks.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = bufferedReader.readLine();

                // Add while loops for the reading to stop when the text is over
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

                // Add try/catch statements
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            //Close bufferedReader

        } else if (story.equals("hansel_and_gretel.txt")) {
            try {
                FileReader fileReader = new FileReader("hansel_and_gretel.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = bufferedReader.readLine();

                //Add while loop
                while (line != null) {
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }

                //Add try/catch statement
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (story.equals("mary_had_a_little_lamb.txt")) {
            try {
                FileReader fileReader = new FileReader("mary_had_a_little_lamb.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = bufferedReader.readLine();

                // Add while loops for the reading to stop when the text is over
                while (line != null) {
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }

                // Add try/catch statements
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }







}
