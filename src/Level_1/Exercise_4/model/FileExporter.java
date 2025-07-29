package Level_1.Exercise_4.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileExporter {

    public void exportFile(List<String> files){

        String filepath = "C:" + File.separator + "Users" + File.separator + "dcs19" + File.separator + "IdeaProjects" + File.separator + "S105_Utils" +
                File.separator + "src" + File.separator + "Level_1" + File.separator + "Ejercicio_3" + File.separator + "resources" + File.separator + "directories.txt";

        File outputFile = new File(filepath);
        File parentDirectory = outputFile.getParentFile();

        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){

            writer.write("List of directories and files: \n\n" );

            for (String line : files){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("\nFile saved successfully in directory: " + outputFile.getAbsolutePath());

        } catch(IOException ioe){
            System.err.println("An error occurred during export process. " + ioe.getMessage());
        }
    }
}