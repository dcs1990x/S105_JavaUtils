package Level_1.Exercise_5.model;

import java.io.*;
import java.util.ArrayList;

public class FileReaderClass {

    public ArrayList<String> readFile(File filepath) {

        ArrayList<String> fileContents = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
            String line = "";
            while ((br.readLine()) != null) {
                fileContents.add(line);
            }
            if (fileContents.isEmpty()) {
                System.out.println("The file is empty. ");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("An error occurred. " + ioe.getMessage());
        }
        return fileContents;
    }

    public void printToConsole(ArrayList<String> fileContents){
        if (fileContents.isEmpty()){
            throw new IllegalArgumentException("The file is empty. ");
        }
        for (String line : fileContents){
            System.out.println(line);
        }
    }
}