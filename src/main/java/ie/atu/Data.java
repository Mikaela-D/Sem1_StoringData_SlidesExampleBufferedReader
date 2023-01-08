package ie.atu;

import java.io.*;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Data {
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";

        try {
            //Parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("names.cvs"));
            while ((line = br.readLine()) != null) { //Returns boolean value
                String[] students = line.split(splitBy); //Use comma as separator
                System.out.println("Student name : " + students[0] + ", Surname : " + students[1] + ", Age : " + students[2] + ", Address : " + students[3]);
            }
        }
        catch (IIOException e) {
            e.printStackTrace();
        }
    }
}
