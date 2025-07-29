package Level_1.Exercise_5.model;

import java.io.*;

public class FileSerializer {

    private String filepath = "C:" + File.separator + "Users" + File.separator + "dcs19" + File.separator + "IdeaProjects" + File.separator + "S105_Utils" +
            File.separator + "src" + File.separator + "Level_1" + File.separator + "Exercise_5" + File.separator + "resources" + File.separator + "people.dat";

    public void serialize(Object obj){

        File outputFile = new File(filepath);
        File parentDirectory = outputFile.getParentFile();

        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }

        try(ObjectOutputStream serialObject = new ObjectOutputStream(new FileOutputStream(filepath))){
            serialObject.writeObject(obj);
            System.out.println("Object serialized successfully in path: " + outputFile.getAbsolutePath());

        } catch(IOException ioe){
            System.err.println("An error occurred during export process. " + ioe.getMessage());
        }
    }
}