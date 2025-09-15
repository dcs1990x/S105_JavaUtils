package Level_1.Exercise_5.model;

import java.io.*;

public class FileSerializer {

    public void serialize(String filepath, Object obj){

        try(ObjectOutputStream serialObject = new ObjectOutputStream(new FileOutputStream(filepath))){
            serialObject.writeObject(obj);
            System.out.println("Object serialized successfully in path: " + filepath);

        } catch(IOException ioe){
            System.err.println("An error occurred during export process. " + ioe.getMessage());
        }
    }
    public void deserialize(String filepath) {

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