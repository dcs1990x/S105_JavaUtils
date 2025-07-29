package Level_1.Exercise_5.model;

import java.io.File;
import java.io.*;

public class FileDeserializer {

    private String filepath = "C:" + File.separator + "Users" + File.separator + "dcs19" + File.separator + "IdeaProjects" + File.separator + "S105_Utils" +
            File.separator + "src" + File.separator + "Level_1" + File.separator + "Exercise_5" + File.separator + "resources" + File.separator + "people.dat";

    public void deserialize() {

        try(ObjectInputStream deserialObject = new ObjectInputStream(new FileInputStream(filepath))){

            Person[] peopleArray = (Person[]) deserialObject.readObject();

            System.out.println("\nDeserializing and printing object: ");

            for(var person : peopleArray){
                System.out.println(person);
            }

        } catch(FileNotFoundException fnfe){
            System.out.println("File not found. " + fnfe.getMessage());
        } catch(IOException ioe){
            System.err.println("An error occurred during import process. " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Class not found. " + cnfe.getMessage());
        }
    }
}
