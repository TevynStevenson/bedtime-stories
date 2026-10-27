package com.pluralsight;

//import FileReader
//Import BuffReader

import java.io.*;


public class BedtimeStoriesApp {

    //Creat main class

    public static void main(String[] args) {
        try {
            //Add FileReader
            FileReader fileReader = new FileReader("goldilocks.txt");

            //Add BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Add the string line for the buffered reader
            String line;

            //Make a while loop to read the entire .txt file
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            //Close the bufferedreader
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }







}
